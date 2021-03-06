package com.example.mdsample.activities;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mdsample.R;
import com.example.mdsample.utils.ToastUtils;


/**
 * Created by lxf on 16/10/28.
 */

public class SearchResultActivity extends BaseActivity {


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SearchResultActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        mToolbarTb.setTitle(R.string.search_result);

        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            ToastUtils.showToast(this, intent.getStringExtra(SearchManager.QUERY));
        }
    }
}
