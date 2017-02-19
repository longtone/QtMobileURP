package com.stonelee.qt.school.ui;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.stonelee.qt.school.R;


/**
 * Created by cwind on 2016/10/10 0010.
 * 获取全局Content
 */

public class MyApplication extends Application {
    private static Context context;
    private static Toast mToast;
    private static View view;
    private static TextView textView;
    private String id;
    private String cookie;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public void onCreate() {
        //获取全局context
        context=getApplicationContext();
        initToast();
    }
    public static Context getContext(){
        return context;
    }
    private void initToast(){
        view= LayoutInflater.from(context).inflate(R.layout.custom_toast, null);
        textView=(TextView) view.findViewById(R.id.toast_message);
    }
    public static void MyToast(String text){
              //加载布局文件// 得到textview
        if(mToast == null) {
            //设置显示内容
            textView.setText(text);
            mToast=new Toast(context);
            mToast.setDuration(Toast.LENGTH_SHORT);
            //mToast.setGravity(Gravity.CENTER, Gravity.CENTER, Gravity.CENTER);
            //在setview之前进行文本，颜色等的修改；
            mToast.setView(view);
            mToast.show();
        } else {
            //取消之前的，从新显示
            mToast.cancel();
            mToast=null;
            MyToast(text);
        }
    }

}
