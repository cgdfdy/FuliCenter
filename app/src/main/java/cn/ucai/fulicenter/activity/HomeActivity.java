package cn.ucai.fulicenter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.fulicenter.R;

public class HomeActivity extends AppCompatActivity {

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
    @Bind(R.id.rg_bottom_layout)
    RadioGroup rgBottomLayout;
    int index;
    RadioButton[] rbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.layout_new_good, R.id.layout_boutique, R.id.layout_category, R.id.layout_cart, R.id.layout_me})
    public void onClick(View view) {
        switch (view.getId()) {
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
    }
}
