package cn.ucai.fulicenter.view;

/**
 * Created by Administrator on 2016/10/19.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.ucai.fulicenter.R;

public class FooterViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tvFooter)
        public TextView tvFooter;

        public FooterViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
        }

}
