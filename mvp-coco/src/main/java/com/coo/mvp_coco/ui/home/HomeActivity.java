package com.coo.mvp_coco.ui.home;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.WebActivity;
import com.coo.mvp_coco.ui.base.BaseActivity;
import com.coo.mvp_coco.ui.home.adapter.MyFragmentPagerAdapter;
import com.coo.mvp_coco.ui.home.fragment.ContactsFragment;
import com.coo.mvp_coco.ui.home.fragment.FindFragment;
import com.coo.mvp_coco.ui.home.fragment.HomeFragment;
import com.coo.mvp_coco.ui.home.fragment.MeFragment;
import com.coo.mvp_coco.ui.main.MainActivity;
import com.coo.mvp_coco.ui.view.TabGroupView;
import com.coo.mvp_coco.ui.view.TabView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeMvpView, TabGroupView.OnItemClickListener {

    private int pageNumber = 0;

    @Inject
    HomePresenter<HomeMvpView> homePresenter;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private List<Fragment> mFragments = new ArrayList<>();
    private ViewPager mViewPager;
    private TabGroupView mTabGroupView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getmActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        initFragments();
        initView();
        initToolbar();
    }

    private void initToolbar() {

        //设置导航图标、添加菜单点击事件要在setSupportActionBar方法之后
        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_settings:
                        ToastUtils.showLong("Settings !");
                        break;
                }
                return true;
            }
        });
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mTabGroupView = (TabGroupView) findViewById(R.id.group_tab_layout);
        mTabGroupView.setOnItemClickListener(this);
        mTabGroupView.setUnreadCount(0, 12);
        mTabGroupView.setHasNew(2, true);
        mViewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragments));
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mTabGroupView.onScrolling(position, positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                mTabGroupView.setCurrentItem(position);
                mTabGroupView.setHasNew(position, false);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void jumpWebActivity(String url) {
        Intent intent = new Intent(HomeActivity.this, WebActivity.class);
        intent.putExtra(WebActivity.WEB_JUMP_URL,url);
        startActivity(intent);
    }

    @Override
    public void onClick(TabView tabLayout, int position) {
        mViewPager.setCurrentItem(position, false);
        mTabGroupView.setHasNew(position, false);
    }

}
