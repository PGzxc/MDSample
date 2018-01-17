package com.example.mdsample.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mdsample.R;


/**
 * Created by steven on 2017/12/2 0002 .
 *
 * @Description:
 */

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button = (Button) getActivity().findViewById(R.id.button);
        final TextView textView = (TextView) getActivity().findViewById(R.id.tv2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView != null) {
                    Toast.makeText(getActivity(), textView.getText(), Toast.LENGTH_LONG).show();
                } else {
                    Log.d("aa", "onClick: ");
                }
            }
        });
    }
}
