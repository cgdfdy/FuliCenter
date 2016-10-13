package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class AlbumsBean {
    private int pid;

    private int imgid;

    private String imgurl;

    private String thumburl;
    public void setPid(int pid) {
        this.pid = pid;
    }
    public int getPid() {
        return pid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
    public int getImgid() {
        return imgid;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    public String getImgurl() {
        return imgurl;
    }

    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }
    public String getThumburl() {
        return thumburl;
    }

    public AlbumsBean() {
    }

    public AlbumsBean(int pid, int imgid, String thumburl, String imgurl) {
        this.pid = pid;
        this.imgid = imgid;
        this.thumburl = thumburl;
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "AlbumsBean{" +
                "pid=" + pid +
                ", imgid=" + imgid +
                ", imgurl='" + imgurl + '\'' +
                ", thumburl='" + thumburl + '\'' +
                '}';
    }
}
