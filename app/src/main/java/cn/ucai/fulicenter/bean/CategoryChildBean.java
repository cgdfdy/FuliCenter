package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CategoryChildBean {

        private int id;
        private int parentid;
        private String name;
        private String imageurl;
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }
        public int getParentid() {
            return parentid;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }
        public String getImageurl() {
            return imageurl;
        }

    public CategoryChildBean() {
    }


    public CategoryChildBean(int id, int parentid, String name, String imageurl) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
        this.imageurl = imageurl;
    }

    @Override
        public String toString() {
            return "JsonRootBean{" +
                    "id=" + id +
                    ", parentid=" + parentid +
                    ", name='" + name + '\'' +
                    ", imageurl='" + imageurl + '\'' +
                    '}';
        }
    }

