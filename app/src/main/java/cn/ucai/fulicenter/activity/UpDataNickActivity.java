package cn.ucai.fulicenter.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.fulicenter.FuLiCenterApplication;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.bean.Result;
import cn.ucai.fulicenter.bean.User;
import cn.ucai.fulicenter.dao.UserDao;
import cn.ucai.fulicenter.net.NetDao;
import cn.ucai.fulicenter.utils.CommonUtils;
import cn.ucai.fulicenter.utils.MFGT;
import cn.ucai.fulicenter.utils.OkHttpUtils;
import cn.ucai.fulicenter.utils.ResultUtils;

public class UpDataNickActivity extends BaseActivity {

    @Bind(R.id.etAmendNick)
    EditText etAmendNick;
    UpDataNickActivity mContext;
    User user = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_up_data_nick);
        ButterKnife.bind(this);
        mContext =this;
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        user = FuLiCenterApplication.getUser();
        if (user != null) {
            etAmendNick.setText(user.getMuserNick());
            etAmendNick.setSelectAllOnFocus(true);
        } else {
            finish();
        }

    }

    @Override
    protected void setListener() {

    }

    @OnClick({R.id.ivBack, R.id.btn_save})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                MFGT.finish(mContext);
                break;
            case R.id.btn_save:
                if (user != null) {
                    String nick = etAmendNick.getText().toString().trim();
                    if (nick.equals(user.getMuserNick())) {
                        CommonUtils.showLongToast(R.string.update_nick_fail_unmodify);
                    } else if (TextUtils.isEmpty(nick)) {
                        CommonUtils.showLongToast(R.string.nick_name_connot_be_empty);
                    } else {
                        updateNick(nick);
                    }
                }
                break;
        }
    }

    private void updateNick(String nick) {
        final ProgressDialog pd = new ProgressDialog(mContext);
        pd.setMessage(getResources().getString(R.string.update_user_nick));
        pd.show();
        NetDao.updateNick(mContext, user.getMuserName(), nick, new OkHttpUtils.OnCompleteListener<String>() {
            @Override
            public void onSuccess(String s) {
                Result result = ResultUtils.getResultFromJson(s, User.class);
                if (result == null){
                    CommonUtils.showShortToast(R.string.update_fail);
                }else{
                    if (result.isRetMsg()){
                        User u = (User) result.getRetData();
                        UserDao dao = new UserDao(mContext);
                        boolean isSuccess = dao.saveUser(u);
                        if (isSuccess){
                            FuLiCenterApplication.setUser(u);
                            setResult(RESULT_OK);
                            MFGT.finish(mContext);
                        }else{
                            CommonUtils.showLongToast(R.string.user_database_error);
                        }
                    }else{
                        if (result.getRetCode() == I.MSG_USER_SAME_NICK){
                            CommonUtils.showLongToast(R.string.update_nick_fail_unmodify);
                        }else if(result.getRetCode() == I.MSG_USER_UPDATE_NICK_FAIL){
                            CommonUtils.showLongToast(R.string.update_fail);
                        }else{
                            CommonUtils.showLongToast(R.string.update_fail);
                        }
                    }
                }
                pd.dismiss();
            }

            @Override
            public void onError(String error) {
                pd.dismiss();
                CommonUtils.showShortToast(error);

            }
        });
    }
}
