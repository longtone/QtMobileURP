package com.stonelee.qt.school.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.stonelee.qt.school.R;
public class MainFragment extends Fragment {

    public MainFragment() {

    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        Button button= (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loginActivity();
            }
        });
        return view;
    }

    private void loginActivity(){
        LoginActivity.gotoLogoin(new Intent(getActivity(),LoginActivity.class),getActivity());
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }

}
