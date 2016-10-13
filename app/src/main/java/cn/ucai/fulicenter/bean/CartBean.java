package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CartBean {
    private int id;
    private String username;
    private int goodsid;
    private String goods;
    private int count;
    private boolean ischecked;
    private boolean checked;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }
    public int getGoodsid() {
        return goodsid;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }
    public String getGoods() {
        return goods;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }
    public boolean getIschecked() {
        return ischecked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    public boolean getChecked() {
        return checked;
    }

    public CartBean() {
    }

    public CartBean(int id, String username, int goodsid, String goods, int count, boolean ischecked, boolean checked) {
        this.id = id;
        this.username = username;
        this.goodsid = goodsid;
        this.goods = goods;
        this.count = count;
        this.ischecked = ischecked;
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "ColorBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", goodsid=" + goodsid +
                ", goods='" + goods + '\'' +
                ", count=" + count +
                ", ischecked=" + ischecked +
                ", checked=" + checked +
                '}';
    }
}
