package cn.ucai.fulicenter.bean;

import java.util.Date;


/**
 * Created by Administrator on 2016/10/13.
 */
public class GoodsDetailsBean {

        private int id;

        private int goodsid;

        private int catid;

        private String goodsname;

        private String goodsenglishname;

        private String goodsbrief;

        private String shopprice;

        private String currencyprice;

        private String promoteprice;

        private String rankprice;

        private boolean ispromote;

        private String goodsthumb;

        private String goodsimg;

        private int addtime;

        private String shareurl;

        private Object  properties;

        private boolean promote;
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setGoodsid(int goodsid) {
            this.goodsid = goodsid;
        }
        public int getGoodsid() {
            return goodsid;
        }

        public void setCatid(int catid) {
            this.catid = catid;
        }
        public int getCatid() {
            return catid;
        }

        public void setGoodsname(String goodsname) {
            this.goodsname = goodsname;
        }
        public String getGoodsname() {
            return goodsname;
        }

        public void setGoodsenglishname(String goodsenglishname) {
            this.goodsenglishname = goodsenglishname;
        }
        public String getGoodsenglishname() {
            return goodsenglishname;
        }

        public void setGoodsbrief(String goodsbrief) {
            this.goodsbrief = goodsbrief;
        }
        public String getGoodsbrief() {
            return goodsbrief;
        }

        public void setShopprice(String shopprice) {
            this.shopprice = shopprice;
        }
        public String getShopprice() {
            return shopprice;
        }

        public void setCurrencyprice(String currencyprice) {
            this.currencyprice = currencyprice;
        }
        public String getCurrencyprice() {
            return currencyprice;
        }

        public void setPromoteprice(String promoteprice) {
            this.promoteprice = promoteprice;
        }
        public String getPromoteprice() {
            return promoteprice;
        }

        public void setRankprice(String rankprice) {
            this.rankprice = rankprice;
        }
        public String getRankprice() {
            return rankprice;
        }

        public void setIspromote(boolean ispromote) {
            this.ispromote = ispromote;
        }
        public boolean getIspromote() {
            return ispromote;
        }

        public void setGoodsthumb(String goodsthumb) {
            this.goodsthumb = goodsthumb;
        }
        public String getGoodsthumb() {
            return goodsthumb;
        }

        public void setGoodsimg(String goodsimg) {
            this.goodsimg = goodsimg;
        }
        public String getGoodsimg() {
            return goodsimg;
        }

        public void setAddtime(int addtime) {
            this.addtime = addtime;
        }
        public int getAddtime() {
            return addtime;
        }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public void setPromote(boolean promote) {
            this.promote = promote;
        }
        public boolean getPromote() {
            return promote;
        }

    public GoodsDetailsBean() {
    }

    public GoodsDetailsBean(int id, int goodsid, int catid, String goodsname, String goodsenglishname, String goodsbrief, String shopprice, String currencyprice, String promoteprice, String rankprice, boolean ispromote, String goodsthumb, int addtime, String goodsimg,String shareurl, Object properties, boolean promote) {
        this.id = id;
        this.goodsid = goodsid;
        this.catid = catid;
        this.goodsname = goodsname;
        this.goodsenglishname = goodsenglishname;
        this.goodsbrief = goodsbrief;
        this.shopprice = shopprice;
        this.currencyprice = currencyprice;
        this.promoteprice = promoteprice;
        this.rankprice = rankprice;
        this.ispromote = ispromote;
        this.goodsthumb = goodsthumb;
        this.addtime = addtime;
        this.goodsimg = goodsimg;
        this.shareurl = shareurl;
        this.properties = properties;
        this.promote = promote;
    }

    @Override
    public String toString() {
        return "GoodsDetailsBean{" +
                "id=" + id +
                ", goodsid=" + goodsid +
                ", catid=" + catid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsenglishname='" + goodsenglishname + '\'' +
                ", goodsbrief='" + goodsbrief + '\'' +
                ", shopprice='" + shopprice + '\'' +
                ", currencyprice='" + currencyprice + '\'' +
                ", promoteprice='" + promoteprice + '\'' +
                ", rankprice='" + rankprice + '\'' +
                ", ispromote=" + ispromote +
                ", goodsthumb='" + goodsthumb + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", addtime=" + addtime +
                ", shareurl='" + shareurl + '\'' +
                ", properties=" + properties +
                ", promote=" + promote +
                '}';
    }
}
