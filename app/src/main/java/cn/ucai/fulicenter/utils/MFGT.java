package cn.ucai.fulicenter.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.activity.BoutiqueChildActivity;
import cn.ucai.fulicenter.activity.CollectsActivity;
import cn.ucai.fulicenter.activity.GoodsDetailActivity;
import cn.ucai.fulicenter.activity.LoginActivity;
import cn.ucai.fulicenter.activity.MainActivity;
import cn.ucai.fulicenter.activity.RegisterActivity;
import cn.ucai.fulicenter.activity.UpDataNickActivity;
import cn.ucai.fulicenter.activity.UserProfileActivity;
import cn.ucai.fulicenter.bean.BoutiqueBean;

/**
 * Created by Administrator on 2016/10/14.
 */
public class MFGT {
    public static void finish(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    public static void gotoMainActivity(Activity context) {
        startActivity(context, MainActivity.class);
    }

    public static void startActivity(Activity context, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        startActivity(context,intent);
    }
    public static void gotoGoodsDetailsActivity(Context context, int goodsId) {
        Intent intent = new Intent();
        intent.setClass(context, GoodsDetailActivity.class);
        intent.putExtra(I.GoodsDetails.KEY_GOODS_ID,goodsId);
        startActivity(context,intent);

    }
    public static void gotoBoutiqueChildActivity(Context context, BoutiqueBean bean) {
        Intent intent = new Intent();
        intent.setClass(context, BoutiqueChildActivity.class);
        intent.putExtra(I.Boutique.CAT_ID,bean);
        startActivity(context,intent);
    }
    public static void startActivity(Context context,Intent intent){
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    public static void gotoLogin(Activity context){
        Intent intent = new Intent();
        intent.setClass(context,LoginActivity.class);
        startActivityForResult(context,intent,I.REQUEST_CODE_LOGIN);
    }
    public static void gotoLoginFromCart(Activity context){
        Intent intent = new Intent();
        intent.setClass(context,LoginActivity.class);
        startActivityForResult(context,intent,I.REQUEST_CODE_LOGIN_FROM_CART);
    }
    public static void gotoRegister(Activity context){
        Intent intent = new Intent();
        intent.setClass(context,RegisterActivity.class);
        startActivityForResult(context,intent,I.REQUEST_CODE_REGISTER);
    }
    public static void startActivityForResult(Activity context,Intent intent,int requestCode){
        context.startActivityForResult(intent,requestCode);
        context.overridePendingTransition(R.anim.push_left_in,R.anim.push_bottom_out);
    }
    public static void gotoSettings(Activity context){
        startActivity(context, UserProfileActivity.class);
    }
    public static void gotoUpDataActivity(Activity context){
        startActivityForResult(context,new Intent(context,UpDataNickActivity.class),I.REQUEST_CODE_NICK);
    }

    public static void gotoCollects(Activity context){
        startActivity(context, CollectsActivity.class);
    }
}
