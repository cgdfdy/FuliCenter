package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class PropertiesBean {
        private int id;

        private int goodsid;

        private int colorid;

        private String colorname;

        private String colorcode;

        private String colorimg;

        private String colorurl;
        private Object albums;
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

        public void setColorimg(String colorimg) {
            this.colorimg = colorimg;
        }
        public String getColorimg() {
            return colorimg;
        }

        public void setColorurl(String colorurl) {
            this.colorurl = colorurl;
        }
        public String getColorurl() {
            return colorurl;
        }

    public Object getAlbums() {
        return albums;
    }

    public void setAlbums(Object albums) {
        this.albums = albums;
    }

    public PropertiesBean() {
    }

    public PropertiesBean(int id, int goodsid, int colorid, String colorname, String colorcode, String colorimg, String colorurl, Object albums) {
        this.id = id;
        this.goodsid = goodsid;
        this.colorid = colorid;
        this.colorname = colorname;
        this.colorcode = colorcode;
        this.colorimg = colorimg;
        this.colorurl = colorurl;
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "PropertiesBean{" +
                "id=" + id +
                ", goodsid=" + goodsid +
                ", colorid=" + colorid +
                ", colorname='" + colorname + '\'' +
                ", colorcode='" + colorcode + '\'' +
                ", colorimg='" + colorimg + '\'' +
                ", colorurl='" + colorurl + '\'' +
                ", albums=" + albums +
                '}';
    }
}
