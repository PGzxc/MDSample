package com.example.mdsample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;

import com.example.mdsample.R;
import com.example.mdsample.model.Person;


/**
 * Created by steven on 2017/12/4 0004 .
 *
 * @Description:
 */

public class btnNullTest extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_null_test);
        TextView textView = (TextView) findViewById(R.id.tv_test);
        Person person = new Person("", "");
        if (person.getEat() != null) {
            textView.setText("456");
        }
        if (!TextUtils.isEmpty(person.getEat())) {
            textView.setText("789");
        }


    }


}
