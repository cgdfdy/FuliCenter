package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class UserAvatar {

        private String musername;

        private String musernick;

        private int mavatarid;

        private String mavatarpath;

        private String mavatarsuffix;

        private int mavatartype;

        private String mavatarlastupdatetime;

        public UserAvatar() {
        }

        public UserAvatar(String musername, String musernick, int mavatarid, String mavatarpath, String mavatarsuffix, int mavatartype, String mavatarlastupdatetime) {
            this.musername = musername;
            this.musernick = musernick;
            this.mavatarid = mavatarid;
            this.mavatarpath = mavatarpath;
            this.mavatarsuffix = mavatarsuffix;
            this.mavatartype = mavatartype;
            this.mavatarlastupdatetime = mavatarlastupdatetime;
        }

        @Override
        public String toString() {
            return "JsonRootBean{" +
                    "musername='" + musername + '\'' +
                    ", musernick='" + musernick + '\'' +
                    ", mavatarid=" + mavatarid +
                    ", mavatarpath='" + mavatarpath + '\'' +
                    ", mavatarsuffix='" + mavatarsuffix + '\'' +
                    ", mavatartype=" + mavatartype +
                    ", mavatarlastupdatetime='" + mavatarlastupdatetime + '\'' +
                    '}';
        }

        public void setMusername(String musername) {
            this.musername = musername;
        }

        public String getMusername() {
            return musername;
        }

        public void setMusernick(String musernick) {
            this.musernick = musernick;
        }

        public String getMusernick() {
            return musernick;
        }

        public void setMavatarid(int mavatarid) {
            this.mavatarid = mavatarid;
        }

        public int getMavatarid() {
            return mavatarid;
        }

        public void setMavatarpath(String mavatarpath) {
            this.mavatarpath = mavatarpath;
        }

        public String getMavatarpath() {
            return mavatarpath;
        }

        public void setMavatarsuffix(String mavatarsuffix) {
            this.mavatarsuffix = mavatarsuffix;
        }

        public String getMavatarsuffix() {
            return mavatarsuffix;
        }

        public void setMavatartype(int mavatartype) {
            this.mavatartype = mavatartype;
        }

        public int getMavatartype() {
            return mavatartype;
        }

        public void setMavatarlastupdatetime(String mavatarlastupdatetime) {
            this.mavatarlastupdatetime = mavatarlastupdatetime;
        }

        public String getMavatarlastupdatetime() {
            return mavatarlastupdatetime;
        }


}
