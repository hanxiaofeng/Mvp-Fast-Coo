package com.coo.mvp_coco.ui.home;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.base.BaseActivity;
import com.coo.mvp_coco.ui.home.adapter.MyFragmentPagerAdapter;
import com.coo.mvp_coco.ui.home.fragment.ContactsFragment;
import com.coo.mvp_coco.ui.home.fragment.FindFragment;
import com.coo.mvp_coco.ui.home.fragment.HomeFragment;
import com.coo.mvp_coco.ui.home.fragment.MeFragment;
import com.coo.mvp_coco.ui.view.TabGroupView;
import com.coo.mvp_coco.ui.view.TabView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements HomeMvpView,TabGroupView.OnItemClickListener{

    private int pageNumber = 0;

    @Inject
    HomePresenter<HomeMvpView> homePresenter;

    private List<Fragment> mFragments = new ArrayList<>();
    private ViewPager mViewPager;
    private TabGroupView mTabGroupView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getmActivityComponent().inject(this);

//        homePresenter.getAllArticle(pageNumber);
        initFragments();
        initView();
    }

    private void initView() {
        mViewPager = (ViewPager)findViewById(R.id.view_pager);
        mTabGroupView = (TabGroupView)findViewById(R.id.group_tab_layout);
        mTabGroupView.setOnItemClickListener(this);
        mTabGroupView.setUnreadCount(0,12);
        mTabGroupView.setHasNew(2,true);
        mViewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),mFragments));
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mTabGroupView.onScrolling(position, positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                mTabGroupView.setCurrentItem(position);
                mTabGroupView.setHasNew(position,false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initFragments() {
        mFragments.add(new HomeFragment());
        mFragments.add(new ContactsFragment());
        mFragments.add(new FindFragment());
        mFragments.add(new MeFragment());
    }


    @Override
    public void jumpWebActivity(String url) {

    }

    @Override
    public void onClick(TabView tabLayout, int position) {
        mViewPager.setCurrentItem(position, false);
        mTabGroupView.setHasNew(position,false);
    }

}
