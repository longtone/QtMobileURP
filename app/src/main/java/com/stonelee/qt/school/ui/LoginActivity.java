package com.stonelee.qt.school.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.stonelee.qt.school.R;
import com.stonelee.qt.school.urp.bean.LoginBean;
import com.stonelee.qt.school.urp.bean.Student;
import com.stonelee.qt.school.urp.opering.LoginOpering;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class LoginActivity extends AppCompatActivity {
    TextView tvID;
    TextView tvPWD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button) findViewById(R.id.login);
        tvID = (TextView) findViewById(R.id.s_id);
        tvPWD = (TextView) findViewById(R.id.s_pwd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(tvID.getText().toString(), tvPWD.getText().toString());
            }
        });
    }

    private void login(String id, String pwd) {
        LoginOpering loginOpering = new LoginOpering();
        loginOpering.login(id, pwd, new Observer<LoginBean>() {
            @Override
            public void onSubscribe(Disposable d) {
            }
            @Override
            public void onNext(LoginBean value) {
                if (value != null) {
                    Log.e("loginactivity", value.getOperMark());
                    Student student=new Student();
                    student.setPwd(tvPWD.getText().toString());
                    student.setId(tvID.getText().toString());
                    student.setName(value.getRealName());
                    student.setCookie(value.getJsessionid());

                    ((MyApplication) getApplication()).setCookie(student.getCookie());
                    ((MyApplication) getApplication()).setId(student.getId());
                    ((MyApplication) getApplication()).setPwd(student.getPwd());
                    LoginOpering.saveUserToken(student);
                    MyApplication.MyToast("欢迎"+value.getRealName());
                    LoginActivity.this.finish();
                }
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    public static void gotoLogoin(Intent intent,Activity activity) {
        activity.startActivity(intent);
    }
}
