package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;
import android.view.View;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.di.component.ActivityComponent;
import com.coo.mvp_coco.ui.home.HomeModel;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;


/**
 * 消息
 */
public class HomeFragment extends LazyFragment implements HomeFragmentMvpView {

    @Inject
    HomeFragmentPresenter homeFragmentPresenter;

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(R.layout.fragment_message,savedInstanceState);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            homeFragmentPresenter.onAttach(this);
        }
    }

    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
    }

    @Override
    public void jumpWebActivity() {

    }

    @Override
    public void refreshView(HomeModel homeModel) {

    }

    @Override
    protected void setUp(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void openKeyboard() {

    }
}
