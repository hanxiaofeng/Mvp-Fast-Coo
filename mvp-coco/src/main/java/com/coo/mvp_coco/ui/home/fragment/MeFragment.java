package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;

import com.coo.mvp_coco.R;


/**
 * 我
 */
public class MeFragment extends LazyFragment {

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_me,savedInstanceState);
        getData();
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
}
