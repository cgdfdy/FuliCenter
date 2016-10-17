package cn.ucai.fulicenter.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.ucai.fulicenter.I;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.activity.MainActivity;
import cn.ucai.fulicenter.adapter.GoodsAdapter;
import cn.ucai.fulicenter.bean.NewGoodsBean;
import cn.ucai.fulicenter.net.NetDao;
import cn.ucai.fulicenter.net.OkHttpUtils;
import cn.ucai.fulicenter.utils.ConvertUtils;
import cn.ucai.fulicenter.utils.L;

public class NewgoodFragment extends Fragment {


    @Bind(R.id.tv_rfresh)
    TextView tvRfresh;
    @Bind(R.id.iv_rv)
    RecyclerView ivRv;
    @Bind(R.id.srl)
    SwipeRefreshLayout srl;
    MainActivity mContext;
    GoodsAdapter mAdapter;
    ArrayList<NewGoodsBean> mList;
    int pageId = 1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_newgood, container, false);
        ButterKnife.bind(this, layout);
        mContext = (MainActivity) getContext();
        mList = new ArrayList<>();
        mAdapter = new GoodsAdapter(mContext, mList);
        initView();
        initData();
        return layout;
    }

    private void initData() {
        NetDao.downloadNewGoods(mContext, pageId,new OkHttpUtils.OnCompleteListener<NewGoodsBean[]>(){
            @Override
            public void onSuccess(NewGoodsBean[] result) {
                if (result != null && result.length > 0){
                    ArrayList<NewGoodsBean> list = ConvertUtils.array2List(result);
                    mAdapter.initData(list);
                }
            }

            @Override
            public void onError(String error) {

                L.e("error"+error);
            }
        });
    }

    private void initView() {
        srl.setColorSchemeColors(
                getResources().getColor(R.color.google_blue),
                getResources().getColor(R.color.google_green),
                getResources().getColor(R.color.google_red),
                getResources().getColor(R.color.google_yellow)
        );
        GridLayoutManager glm = new GridLayoutManager(mContext, I.COLUM_NUM);
        ivRv.setLayoutManager(glm);
        ivRv.setHasFixedSize(true);
        ivRv.setAdapter(mAdapter);
    }


}
