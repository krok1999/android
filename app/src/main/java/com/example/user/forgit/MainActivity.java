package com.example.user.forgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //git remote add origin https://github.com/krok1999/android.git
    @BindView(R.id.button)Button btn1;
    @BindView(R.id.button2)Button btn2;
    @BindView(R.id.text)TextView textView;
    @BindString(R.string.hello)String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()== btn2.getId())textView.setText("change");
            }
        });
    }
    @OnClick({R.id.button})
    public void someMethod(){
        btn1.setText("you clicked");
    }
}
