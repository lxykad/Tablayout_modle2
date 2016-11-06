package com.caimi.gdd.ui;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.caimi.gdd.R;
import com.caimi.gdd.adapter.MainPagerDapter;
import com.caimi.gdd.databinding.ActivityMainBinding;
import com.caimi.gdd.entity.MainTab;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private String[] mTitles = {"自选", "行情", "交易", "投顾", "直播"};
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initData();
    }

    private void initData() {
        mFragments.add(new HomeFragment());
        mFragments.add(new StockFragment());
        mFragments.add(new NewsFragment());
        mFragments.add(new UserCenterFragment());
        mFragments.add(new LiveFragment());
        //绑定viewpager
        mBinding.viewPager.setAdapter(new MainPagerDapter(getSupportFragmentManager(), mFragments, mTitles));
        mBinding.tabLayout.setViewPager(mBinding.viewPager);
        mBinding.viewPager.setCurrentItem(0);
    }
}
