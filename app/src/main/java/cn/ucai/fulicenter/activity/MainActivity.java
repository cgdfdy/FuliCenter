package cn.ucai.fulicenter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.ucai.fulicenter.FuLiCenterApplication;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.fragment.BoutiqueFragment;
import cn.ucai.fulicenter.fragment.NewgoodsFragment;
import cn.ucai.fulicenter.utils.L;
import cn.ucai.fulicenter.utils.MFGT;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.new_good)
    RadioButton newGood;
    @Bind(R.id.boutique)
    RadioButton boutique;
    @Bind(R.id.category)
    RadioButton category;
    @Bind(R.id.cart)
    RadioButton cart;
    @Bind(R.id.tvCartHint)
    TextView tvCartHint;
    @Bind(R.id.personal)
    RadioButton personal;

    int index;
    int currentIndex;
    RadioButton[] rbs;
    Fragment[] mFragments;
    NewgoodsFragment mNewgoodsfragment;
    BoutiqueFragment mBoutiquefragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.i("MainActivity", "onCreate");
        super.onCreate(savedInstanceState);
    }

    private void initFragment() {
        mFragments = new Fragment[5];
        mNewgoodsfragment = new NewgoodsFragment();
        mBoutiquefragment = new BoutiqueFragment();
        mFragments[0] = mNewgoodsfragment;
        mFragments[1] = mBoutiquefragment;
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,mNewgoodsfragment)
                .add(R.id.fragment_container,mBoutiquefragment)
                .hide(mBoutiquefragment)
                .show(mNewgoodsfragment)
                .commit();
    }
    protected void initView() {
        rbs = new RadioButton[5];
        rbs[0] = newGood;
        rbs[1] = boutique;
        rbs[2] = category;
        rbs[3] = cart;
        rbs[4] = personal;
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initData() {
        initFragment();

    }

    public void onCheckedChange(View view) {
        switch (view.getId()) {
            case R.id.new_good:
                index = 0;
                break;
            case R.id.boutique:
                index = 1;
                break;
            case R.id.category:
                index = 2;
                break;
            case R.id.cart:
                index = 3;
                break;
            case R.id.personal:
                if (FuLiCenterApplication.getUsername() == null) {
                    MFGT.gotoLogin(this);
                } else {

                    index = 4;
                    break;
                }
                setFragment();
                L.i("index="+index);
                L.i("currentIndex = " + currentIndex);

        }
    }
    private void setFragment() {
        if (index!=currentIndex) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.hide(mFragments[currentIndex]);
            if (mFragments[index].isAdded()){
                ft.add(R.id.fragment_container,mFragments[index]);
            }
            ft.show(mFragments[index]).commit();
        }
        setRadioButtonStatus();
        currentIndex = index;
    }
    private void setRadioButtonStatus() {
        for (int i = 0; i < rbs.length; i++) {
            if (i == index) {
                rbs[i].setChecked(true);
            } else {
                rbs[i].setChecked(false);
            }
        }
    }
    public void  onBackPressed(){
        finish();
    }
    @Override
    protected void onResume() {
        super.onResume();
        L.e(TAG,"onResume...");
        if (index == 4 && FuLiCenterApplication.getUser() == null){
            index = 0;
        }
        setFragment();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        L.e(TAG,"onActivityResult,requestCode="+requestCode);
        if (requestCode == I.REQUEST_CODE_LOGIN && FuLiCenterApplication.getUser()!=null){
            index = 4;
        }
    }
}
