package com.stonelee.qt.school.urp.opering;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.stonelee.qt.school.ui.MyApplication;
import com.stonelee.qt.school.urp.Api;
import com.stonelee.qt.school.urp.bean.LoginBean;
import com.stonelee.qt.school.urp.bean.Student;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mac on 2017/2/16.
 */

public class LoginOpering {
    private final static String ID="id";
    private final static String NAME="name";
    private final static String PWD="pwd";
    private final static String COOKIE="cookie";

    public void login(String id,String pwd,Observer<LoginBean> observable) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.HTTP_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        LoginService loginService=retrofit.create(LoginService.class);
        loginService.login("mobileLogin",id,pwd)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observable);

    }
    public interface LoginService {
        @GET(Api.API_LOGIN)
        Observable<LoginBean> login(@Query("oper") String oper, @Query("zjh") String id, @Query("mm") String pwd);
    }

    public static Student readUserToken() {
        SharedPreferences preferences = MyApplication.getContext().getSharedPreferences("user",
                MyApplication.getContext().MODE_PRIVATE);
        Student student=new Student();
        student.setId(preferences.getString(ID, null));
        student.setPwd(preferences.getString(PWD, null));
        student.setName(preferences.getString(NAME, null));
        student.setCookie(preferences.getString(COOKIE, null));
        String uid=preferences.getString("uid",null);
        if (student.getCookie()==null || student.getPwd()==null)
            return null;
        return student;
    }
    public static void saveUserToken(Student student) {
        SharedPreferences preferences = MyApplication.getContext().getSharedPreferences("user",
                MyApplication.getContext().MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(ID,student.getId());
        editor.putString(PWD,student.getPwd());
        editor.putString(NAME,student.getName());
        editor.putString(COOKIE,student.getCookie());
        editor.apply();
    }
}
