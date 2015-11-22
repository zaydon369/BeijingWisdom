package com.itzheng.beijingwisdom.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;

import com.itzheng.beijingwisdom.R;
import com.itzheng.beijingwisdom.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    private static final String TAG = HomeFragment.class.getSimpleName();
//    /**
//     *fragment数据适配器,通过不同的索引,创建不同的fragment
//     */
//    FragmentStatePagerAdapter fragmentStatePagerAdapter =
//            new FragmentStatePagerAdapter(getSupportFragmentManager()) {
//                @Override
//                public Fragment getItem(int position) {//当前的fragment的索引
//                    //共同的父类
//                    BaseFragment baseFragment = null;
//                    switch (position) {
//                        case 0:
//                            baseFragment = new FunctionFragment();
//                            break;
//                        case 1:
//                            baseFragment = new NewsCenterFragment();
//                            break;
//                        case 2:
//                            baseFragment = new SmartServiceFragment();
//
//                            break;
//                        case 3:
//                            baseFragment = new GovAffairsFragment();
//
//                            break;
//                        case 4:
//                            baseFragment = new SettingFragment();
//                            break;
//                    }
//                    return baseFragment;
//                }
//
//                @Override
//                public int getCount() {
//                    //返回fragment的个数
//                    return 5;
//                }
//            };
//    private FrameLayout layout_content;

    private RadioGroup main_radio;
    private View view;

    @Override
    public View initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.frag_home,null);
        com.lidroid.xutils.ViewUtils.inject(this, view);
        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        main_radio = (RadioGroup) view.findViewById(R.id.main_radio);
        main_radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = -1;
                switch (checkedId) {
                    case R.id.rb_function:
                        index = 0;
                        break;
                    case R.id.rb_news_center:
                        index = 1;
                        break;
                    case R.id.rb_smart_service:
                        index = 2;
                        break;
                    case R.id.rb_gov_affairs:
                        index = 3;
                        break;
                    case R.id.rb_setting:
                        index = 4;
                        break;
                }
            }
        });

    }
}



