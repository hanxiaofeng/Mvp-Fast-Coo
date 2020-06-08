package com.coo.mvp_coco.ui.home.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.di.component.ActivityComponent;
import com.coo.mvp_coco.ui.base.BaseFragment;
import com.coo.mvp_coco.ui.home.HomeModel;
import com.coo.mvp_coco.ui.home.HomeMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;


/**
 * 消息
 */
public class HomeFragment extends BaseFragment implements HomeFragmentMvpView {

    private int pageNumber = 0;

    @Inject
    HomeFragmentPresenter<HomeFragmentMvpView> homeFragmentPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            homeFragmentPresenter.onAttach(this);
        }

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeFragmentPresenter.getAllArticle(pageNumber);
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
