package com.shx.lawwh.base;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;

import com.shx.lawwh.common.LogGloble;
import com.shx.lawwh.dao.DBHelper;
import com.shx.lawwh.dao.DaoMaster;
import com.shx.lawwh.dao.DaoSession;

/**
 * Created by 邵鸿轩 on 2017/7/3.
 */

public class BaseApplication extends Application {
    private DaoMaster.DevOpenHelper dbHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private static  BaseApplication instance;
    public static boolean isExit = false;
    /**
     * 双击退出的消息处理
     */
    public Handler mHandlerExit = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };
    @Override
    public void onCreate() {
        super.onCreate();
        // 获取屏幕宽高
        DisplayMetrics dm = getResources().getDisplayMetrics();
        if (dm.widthPixels <= dm.heightPixels) {
            LayoutValue.SCREEN_WIDTH = dm.widthPixels;
            LayoutValue.SCREEN_HEIGHT = dm.heightPixels;
        } else {
            LayoutValue.SCREEN_WIDTH = dm.heightPixels;
            LayoutValue.SCREEN_HEIGHT = dm.widthPixels;
        }
        LogGloble.d("info", "LayoutValue.SCREEN_WIDTH-- "
                + LayoutValue.SCREEN_WIDTH);
        LogGloble.d("info", "LayoutValue.SCREEN_HEIGHT-- "
                + LayoutValue.SCREEN_HEIGHT);
        initDatabass();
        init();

    }
    public static String getApplicationName(){
        try {
            PackageManager packageManager = instance.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo( instance.getPackageName(), 0);
            return (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static BaseApplication getContext(){
        return instance;
    }
    private void initDatabass() {
        //这里之后会修改，关于升级数据库
//        DBHelper.getInstance(this).copyDatabaseFile(this,true);
//        dbHelper = new DaoMaster.DevOpenHelper(this, "law.db", null);
//        db = dbHelper.getWritableDatabase();
//        mDaoMaster = new DaoMaster(db);
//        mDaoSession = mDaoMaster.newSession();
    }
    /**
     * 初始化App
     */
    private void init() {
        instance = this;
    }
    public DaoSession getSession(){
        return mDaoSession;
    }
    public SQLiteDatabase getDb(){
        return db;
    }
}
