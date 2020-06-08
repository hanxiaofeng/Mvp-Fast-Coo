package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.home.HomeModel;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;

import javax.inject.Inject;


/**
 * 消息
 */
public class HomeFragment extends LazyFragment implements HomeFragmentMvpView {

//    @Inject
//    HomeFragmentPresenter homeFragmentPresenter;

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_message);

//        getmFragmentComponent().inject(this);
//
//        homeFragmentPresenter.onAttach(this);

//        getData();
    }

    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
    }

    /**
     * 获取数据
     */
    public void  getData() {

    }

    @Override
    public void jumpWebActivity() {

    }

    @Override
    public void refreshView(HomeModel homeModel) {

    }
}
