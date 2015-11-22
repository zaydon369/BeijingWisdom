package com.itzheng.beijingwisdom.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.itzheng.beijingwisdom.base.BaseFragment;

/**
 * Created by asus on 2015/11/22.
 */
public class MenuFragment extends BaseFragment {
    @Override
    public View initView(LayoutInflater inflater) {
        TextView tv=new TextView(getContext());
        tv.setText("This is MenuFragment");
        return tv;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }
}
