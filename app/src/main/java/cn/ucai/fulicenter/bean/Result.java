package cn.ucai.fulicenter.bean;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Result {
        private int retcode;
        private boolean retmsg;

        private Object retdata;
        public void setRetcode(int retcode) {
            this.retcode = retcode;
        }
        public int getRetcode() {
            return retcode;
        }

        public void setRetmsg(boolean retmsg) {
            this.retmsg = retmsg;
        }
        public boolean getRetmsg() {
            return retmsg;
        }

    public Object getRetdata() {
        return retdata;
    }

    public void setRetdata(Object retdata) {
        this.retdata = retdata;
    }

    public Result() {
    }

    public Result(int retcode, boolean retmsg, Object retdata) {
        this.retcode = retcode;
        this.retmsg = retmsg;
        this.retdata = retdata;
    }


    @Override
    public String toString() {
        return "Result{" +
                "retcode=" + retcode +
                ", retmsg=" + retmsg +
                ", retdata=" + retdata +
                '}';
    }
}
