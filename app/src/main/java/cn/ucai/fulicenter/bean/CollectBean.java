package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CollectBean {
        private int id;
        private int username;
        private int goodsid;
        private String goodsname;
        private String goodsenglishname;
        private String goodsthumb;
        private String goodsimg;
        private int addtime;
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setUsername(int username) {
            this.username = username;
        }
        public int getUsername() {
            return username;
        }

        public void setGoodsid(int goodsid) {
            this.goodsid = goodsid;
        }
        public int getGoodsid() {
            return goodsid;
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

    public CollectBean() {
    }

    public CollectBean(int id, int username, int goodsid, String goodsname, String goodsenglishname, String goodsthumb, String goodsimg, int addtime) {
        this.id = id;
        this.username = username;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.goodsenglishname = goodsenglishname;
        this.goodsthumb = goodsthumb;
        this.goodsimg = goodsimg;
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "CollectBean{" +
                "id=" + id +
                ", username=" + username +
                ", goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsenglishname='" + goodsenglishname + '\'' +
                ", goodsthumb='" + goodsthumb + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", addtime=" + addtime +
                '}';
    }
}
