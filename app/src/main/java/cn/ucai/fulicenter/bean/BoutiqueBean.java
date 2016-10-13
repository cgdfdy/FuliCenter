package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class BoutiqueBean {
        private int id;
        private String title;
        private String description;
        private String name;
        private String imageurl;

    public BoutiqueBean() {
    }

    @Override
    public String toString() {
        return "BoutiqueBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    public BoutiqueBean(int id, String title, String description, String name, String imageurl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.name = name;
        this.imageurl = imageurl;
    }

    public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
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

    }
