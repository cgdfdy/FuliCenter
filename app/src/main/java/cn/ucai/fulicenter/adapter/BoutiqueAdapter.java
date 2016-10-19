package cn.ucai.fulicenter.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.bean.BoutiqueBean;
import cn.ucai.fulicenter.utils.ImageLoader;

/**
 * Created by Administrator on 2016/10/19.
 */
public class BoutiqueAdapter extends Adapter {
    Context context;
    ArrayList<BoutiqueBean> mList;
    boolean isMore;

    public BoutiqueAdapter(Context context, ArrayList<BoutiqueBean> List) {
        this.context = context;
        this.mList = new ArrayList<>();
        mList.addAll(List);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;
        if (viewType == I.TYPE_FOOTER) {
            holder = new GoodsAdapter.FooterViewHolder(LayoutInflater.from(context)
                    .inflate(R.layout.item_footer, parent, false));
        } else {
            holder = new ButiqueViewHolder(LayoutInflater.from(context)
                    .inflate(R.layout.item_boutique, parent, false));
        }
        return holder;
    }


    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean more) {
        isMore = more;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (holder instanceof GoodsAdapter.FooterViewHolder){
            ((GoodsAdapter.FooterViewHolder) holder).tvFooter.setText(getFooterString());

        }
        if (holder instanceof  ButiqueViewHolder){
            BoutiqueBean boutiqueBean = mList.get(position);
            ImageLoader.downloadImg(context,((ButiqueViewHolder) holder).ivBoutiqueImg,boutiqueBean.getImageurl());
            ((ButiqueViewHolder) holder).tvBoutiqueTitle.setText(boutiqueBean.getTitle());
            ((ButiqueViewHolder) holder).tvBoutiqueName.setText(boutiqueBean.getName());
            ((ButiqueViewHolder) holder).tvBoutiqueDescription.setText(boutiqueBean.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() + 1 : 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == getItemCount() - 1) {
            return I.TYPE_FOOTER;
        }
        return I.TYPE_ITEM;
    }

    public int getFooterString() {
        return isMore?R.string.load_more:R.string.no_more;
    }

    class ButiqueViewHolder extends ViewHolder{
        @Bind(R.id.ivBoutiqueImg)
        ImageView ivBoutiqueImg;
        @Bind(R.id.tvBoutiqueTitle)
        TextView tvBoutiqueTitle;
        @Bind(R.id.tvBoutiqueName)
        TextView tvBoutiqueName;
        @Bind(R.id.tvBoutiqueDescription)
        TextView tvBoutiqueDescription;
        @Bind(R.id.layout_boutique_item)
        RelativeLayout layoutBoutiqueItem;

       ButiqueViewHolder(View view) {
           super(view);
            ButterKnife.bind(this, view);
        }
    }
}