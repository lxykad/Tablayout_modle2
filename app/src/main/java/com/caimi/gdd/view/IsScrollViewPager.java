package com.caimi.gdd.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class IsScrollViewPager extends ViewPager {


    public IsScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public IsScrollViewPager(Context context) {
        super(context);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }
}
