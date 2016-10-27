package cn.ucai.fulicenter.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.bean.CartBean;
import cn.ucai.fulicenter.bean.GoodsDetailsBean;
import cn.ucai.fulicenter.utils.ImageLoader;

/**
 * Created by Administrator on 2016/10/19.
 */
public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    Context mContext;
    ArrayList<CartBean> mList;


    public CartAdapter(Activity context, ArrayList<CartBean> mList) {
        this.mContext = context;
        this.mList = new ArrayList<>();
        this.mList.addAll(mList);
    }


    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CartViewHolder holder = null;
        holder = new CartViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_cart, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        CartBean cartBean = mList.get(position);
        GoodsDetailsBean goods = cartBean.getGoods();
        if (goods!=null) {
            ImageLoader.downloadImg(mContext, holder.mIvCartThumb, goods.getGoodsThumb());
            holder.mIvCartGoodName.setText(goods.getGoodsName());
            holder.mTvCartPrice.setText(goods.getCurrencyPrice());
        }
        holder.mTvCartCount.setText(cartBean.getCount());
        holder.mCbCartSelected.setChecked(false);
    }


    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return I.TYPE_ITEM;
    }


    public void initData(ArrayList<CartBean> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    class CartViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.cb_cart_selected)
        CheckBox mCbCartSelected;
        @Bind(R.id.iv_cart_thumb)
        ImageView mIvCartThumb;
        @Bind(R.id.tv_cart_good_name)
        TextView mIvCartGoodName;
        @Bind(R.id.iv_cart_add)
        ImageView mIvCartAdd;
        @Bind(R.id.tv_cart_count)
        TextView mTvCartCount;
        @Bind(R.id.iv_cart_del)
        ImageView mIvCartDel;
        @Bind(R.id.tv_cart_price)
        TextView mTvCartPrice;
    CartViewHolder(View view) {
        super(view);
            ButterKnife.bind(this, view);
        }
    }
}
