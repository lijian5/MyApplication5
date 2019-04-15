package com.example.lijian5.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIv4 = findViewById(R.id.image1);
        Glide.with(this).load("http://pic69.nipic.com/file/20150608/9252150_134415115986_2.jpg").into(mIv4);
    }
}
