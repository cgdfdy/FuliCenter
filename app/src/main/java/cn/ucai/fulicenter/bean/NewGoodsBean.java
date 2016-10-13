package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class NewGoodsBean {
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
    private int colorid;
    private String colorname;
    private String colorcode;
    private String colorurl;
    private int addtime;
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

    public void setColorid(int colorid) {
        this.colorid = colorid;
    }
    public int getColorid() {
        return colorid;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }
    public String getColorname() {
        return colorname;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode;
    }
    public String getColorcode() {
        return colorcode;
    }

    public void setColorurl(String colorurl) {
        this.colorurl = colorurl;
    }
    public String getColorurl() {
        return colorurl;
    }

    public void setAddtime(int addtime) {
        this.addtime = addtime;
    }
    public int getAddtime() {
        return addtime;
    }

    public void setPromote(boolean promote) {
        this.promote = promote;
    }
    public boolean getPromote() {
        return promote;
    }

    public NewGoodsBean() {
    }

    public NewGoodsBean(int id, int goodsid, int catid, String goodsname, String goodsenglishname, String shopprice, String goodsbrief, String currencyprice, String rankprice, boolean ispromote, String promoteprice, String goodsthumb, String goodsimg, int colorid, String colorname, String colorcode, int addtime, String colorurl, boolean promote) {
        this.id = id;
        this.goodsid = goodsid;
        this.catid = catid;
        this.goodsname = goodsname;
        this.goodsenglishname = goodsenglishname;
        this.shopprice = shopprice;
        this.goodsbrief = goodsbrief;
        this.currencyprice = currencyprice;
        this.rankprice = rankprice;
        this.ispromote = ispromote;
        this.promoteprice = promoteprice;
        this.goodsthumb = goodsthumb;
        this.goodsimg = goodsimg;
        this.colorid = colorid;
        this.colorname = colorname;
        this.colorcode = colorcode;
        this.addtime = addtime;
        this.colorurl = colorurl;
        this.promote = promote;
    }

    @Override
    public String toString() {
        return "NewGoodsBean{" +
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
                ", colorid=" + colorid +
                ", colorname='" + colorname + '\'' +
                ", colorcode='" + colorcode + '\'' +
                ", colorurl='" + colorurl + '\'' +
                ", addtime=" + addtime +
                ", promote=" + promote +
                '}';
    }
}
