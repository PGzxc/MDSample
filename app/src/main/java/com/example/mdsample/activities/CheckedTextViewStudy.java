package com.example.mdsample.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ListView;

import com.example.mdsample.R;
import com.example.mdsample.adapter.MyListViewAdapter;


/**
 * Created by steven on 2017/11/4 0004.
 */

public class CheckedTextViewStudy extends AppCompatActivity implements View.OnClickListener {


    private CheckedTextView checkedTextViewMul1;
    private CheckedTextView ctv1;
    private CheckedTextView ctv2;
    private boolean ctv2Checked = false;
    public ListView listView;


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, CheckedTextViewStudy.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_textview);
        initWidget();
    }

    private void initWidget() {
        ctv1 = (CheckedTextView) findViewById(R.id.main_ctv1);
        ctv1.setOnClickListener(this);
        ctv1.setChecked(true);// 设置为选中，不设置默认为不选中

        ctv2 = (CheckedTextView) findViewById(R.id.main_ctv2);
        ctv2.setOnClickListener(this);
        // 更改图标
        ctv2.setCheckMarkDrawable(android.R.drawable.arrow_down_float);

        listView = (ListView) findViewById(R.id.main_lv);
        listView.setAdapter(new MyListViewAdapter(this));
    }

    @Override
    public void onClick(View v) {
        if (v == ctv1) {
            ctv1.toggle();// 反转状态
        } else if (v == ctv2) {
            ctv2Checked = !ctv2Checked;
            changeCtv2State();
        }
    }

    private void changeCtv2State() {
        if (ctv2Checked) {
            ctv2.setCheckMarkDrawable(android.R.drawable.arrow_up_float);
        } else {
            ctv2.setCheckMarkDrawable(android.R.drawable.arrow_down_float);
        }
    }


}
