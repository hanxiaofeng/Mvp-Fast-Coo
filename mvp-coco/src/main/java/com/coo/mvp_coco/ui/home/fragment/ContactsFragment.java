package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.base.BaseFragment;


/**
 * 通讯录
 */
public class ContactsFragment extends BaseFragment {

    /*@Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_contacts,savedInstanceState);
        getData();
    }

    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);

        /*ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            homeFragmentPresenter.onAttach(this);
        }*/

        return view;
    }

    /**
     * 获取数据
     */
    public void  getData() {

    }

    @Override
    protected void setUp(View view) {

    }

    @Override
    public void openKeyboard() {

    }
}
