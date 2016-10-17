package cn.ucai.fulicenter.activity;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.fragment.NewgoodFragment;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.layout_new_good)
    RadioButton layoutNewGood;
    @Bind(R.id.layout_boutique)
    RadioButton layoutBoutique;
    @Bind(R.id.layout_category)
    RadioButton layoutCategory;
    @Bind(R.id.tvCartCount)
    TextView tvCartCount;
    @Bind(R.id.layout_cart)
    RadioButton layoutCart;
    @Bind(R.id.layout_me)
    RadioButton layoutMe;
    int index;
    RadioButton[] rbs;
    Fragment[] mFragments;
    NewgoodFragment mNewgoodsfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initview();
        initFragment();

    }

    private void initFragment() {
        mFragments = new Fragment[5];
        mNewgoodsfragment = new NewgoodFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,mNewgoodsfragment)
                .show(mNewgoodsfragment)
                .commit();
    }

    private void initview() {
        rbs = new RadioButton[5];
        rbs[0] = layoutNewGood;
        rbs[1] = layoutBoutique;
        rbs[2] = layoutCategory;
        rbs[3] = layoutCart;
        rbs[4] = layoutMe;
    }

    public void onCheckedChange(View v){
        switch (v.getId()){
            case R.id.layout_new_good:
                index = 0;
                break;
            case R.id.layout_boutique:
                index = 1;
                break;
            case R.id.layout_category:
                index = 2;
                break;
            case R.id.layout_cart:
                index = 3;
                break;
            case R.id.layout_me:
                index = 4;
                break;

        }
        setRadioButtonStatus();

    }

    private void setRadioButtonStatus() {
        for (int i= 0;i<rbs.length;i++){
            if (i == index){
                rbs[i].setChecked(true);
            }else {
                rbs[i].setChecked(false);
            }
        }
    }
}