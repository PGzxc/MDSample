package com.example.mdsample.enumerate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.mdsample.BaseActivity;
import com.example.mdsample.R;


/**
 * Created by steven on 2017/12/23.
 */

public class EnumerateActivity extends BaseActivity {


    private Button btnEnumetate;

    public static void start(Context context) {
        Intent intent = new Intent(context, EnumerateActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_enumerate);

        btnEnumetate = (Button) findViewById(R.id.btn_enumerate);
    }


    public void btnEnumerate(View view) {

        String strResult = String.valueOf(QueryType.BACKWARD.getValue());
        btnEnumetate.setText("result ==" + strResult);

    }


}
