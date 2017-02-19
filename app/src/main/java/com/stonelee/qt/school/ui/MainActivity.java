package com.stonelee.qt.school.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stonelee.qt.school.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment mainFragment=MainFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.container, mainFragment).commit();
    }

}
