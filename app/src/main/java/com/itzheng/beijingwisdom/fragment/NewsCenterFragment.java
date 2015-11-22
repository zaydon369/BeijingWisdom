package com.itzheng.beijingwisdom.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.itzheng.beijingwisdom.base.BaseFragment;


/**
 * Created by asus on 2015/11/22.
 */
public class NewsCenterFragment extends BaseFragment {
    @Override
    public View initView(LayoutInflater inflater) {
        TextView tv=new TextView(getContext());
        tv.setText("新闻中心");
        return tv;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }
}
