package com.itzheng.beijingwisdom.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by asus on 2015/11/22.
 */
public abstract class BaseFragment extends Fragment {
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = initView(inflater);
        return view;
    }

    /**
     * 初始化View
     * @param inflater
     * @return
     */
    public abstract View initView(LayoutInflater inflater);

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        initData(savedInstanceState);
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 初始化数据
     * @param savedInstanceState
     */
    public abstract void initData(Bundle savedInstanceState);

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        if (getView() != null) {
            //如果当前不是可视状态就隐藏
            getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }

        // super.setMenuVisibility(menuVisible);
    }
}
