package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CategoryGroupBean {

        private int id;
        private String name;
        private String imageurl;
        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
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


    @Override
    public String toString() {
        return "CategoryGroupBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    public CategoryGroupBean() {
    }

    public CategoryGroupBean(int id, String name, String imageurl) {
        this.id = id;
        this.name = name;
        this.imageurl = imageurl;
    }
}
