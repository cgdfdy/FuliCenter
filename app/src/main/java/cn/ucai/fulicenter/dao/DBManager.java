package cn.ucai.fulicenter.dao;

import android.content.Context;

import cn.ucai.fulicenter.bean.User;

/**
 * Created by Administrator on 2016/10/24.
 */
public class DBManager {
    private static DBManager dbMgr = new DBManager();
    private  static  DBOpenHelper mHeleper;
    public DBManager(){

    }
    public  static  DBManager onInit(Context context){
        if (mHeleper==null){
            mHeleper= DBOpenHelper.onInit(context);
        }
        return dbMgr;
    }
    public static void closeDB(){
        if (mHeleper!=null){
            mHeleper.closeDB();
        }
    }
    public boolean savaUser(User user){

        return false;
    }
    public User getUser(String username){
        return null;
    }
    public boolean updateUser(User user){
        return false;
    }

}
