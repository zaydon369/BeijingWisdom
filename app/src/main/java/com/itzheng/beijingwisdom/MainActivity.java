package com.itzheng.beijingwisdom;

import android.os.Bundle;

import com.itzheng.beijingwisdom.fragment.MenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    private SlidingMenu slidingMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        setBehindContentView(R.layout.menu_frame);
        slidingMenu=getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        slidingMenu.setShadowDrawable(R.drawable.shadow);
        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        MenuFragment menuFragment=new MenuFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.menu,menuFragment,"MENU")
                .commit();
    }
}
