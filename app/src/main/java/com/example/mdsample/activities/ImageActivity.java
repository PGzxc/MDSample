package com.example.mdsample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.mdsample.R;

/**
 * Created by steven on 2017/11/27 0027 .
 *
 * @Description:
 */

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);

        ImageView imgageView = (ImageView) findViewById(R.id.iv_image);
//        imgageView
        imgageView.setSelected(true);

    }
}
