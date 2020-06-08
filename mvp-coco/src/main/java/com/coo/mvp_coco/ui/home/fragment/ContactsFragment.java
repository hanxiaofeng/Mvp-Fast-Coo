package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;

import com.coo.mvp_coco.R;


/**
 * 通讯录
 */
public class ContactsFragment extends LazyFragment {

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_contacts,savedInstanceState);
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
