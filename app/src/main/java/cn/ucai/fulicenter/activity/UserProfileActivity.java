package cn.ucai.fulicenter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.fulicenter.FuLiCenterApplication;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.bean.User;
import cn.ucai.fulicenter.dao.SharedPreferenceUtils;
import cn.ucai.fulicenter.utils.CommonUtils;
import cn.ucai.fulicenter.utils.ImageLoader;
import cn.ucai.fulicenter.utils.MFGT;
import cn.ucai.fulicenter.view.DisplayUtils;

public class UserProfileActivity extends BaseActivity {

    @Bind(R.id.iv_user_profile_avatar)
    ImageView ivAvatar;
    @Bind(R.id.tv_user_profile_name)
    TextView tvUserName;
    @Bind(R.id.tv_user_profile_nick)
    TextView tvNick;

    UserProfileActivity mContext;
    User user =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_user_profile);
        ButterKnife.bind(this);
        mContext =this;
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        DisplayUtils.initBackWithTitle(mContext,getResources().getString(R.string.user_profile));

    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initData() {
        User user = FuLiCenterApplication.getUser();
        if (user!=null){

            finish();
        }
        showInfo();

    }

    @OnClick({R.id.layout_user_profile_avatar, R.id.layout_user_profile_username, R.id.tv_user_profile_nick, R.id.layout_user_profile_nickname, R.id.btn_logout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.layout_user_profile_username:
                CommonUtils.showLongToast(R.string.user_name_connot_be_modify);
                break;
            case R.id.layout_user_profile_nickname:
                MFGT.gotoUpDataActivity(mContext);
                break;
            case R.id.btn_logout:
                logout();
                break;
        }
    }

    private void logout() {
        if (user!=null){
            SharedPreferenceUtils.getInstence(mContext).removeUser();
            FuLiCenterApplication.setUser(null);
            MFGT.gotoLogin(mContext);
        }
        finish();
    }

    private void showInfo(){
        user = FuLiCenterApplication.getUser();
        if (user != null){
            ImageLoader.setAvatar(ImageLoader.getAvatarUrl(user),mContext,ivAvatar);
            tvUserName.setText(user.getMuserName());
            tvNick.setText(user.getMuserNick());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        showInfo();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK){
            return;
        }
        if (resultCode == RESULT_OK && requestCode == I.REQUEST_CODE_NICK){
            CommonUtils.showLongToast(R.string.update_user_nick_success);
        }

    }
}
