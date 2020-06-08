package com.coo.mvp_coco.ui.home.fragment.msgfg;

import com.coo.mvp_coco.ui.base.MvpView;
import com.coo.mvp_coco.ui.home.HomeModel;

import java.util.List;

public interface HomeFragmentMvpView extends MvpView {

    void jumpWebActivity();

    void refreshView(HomeModel homeModel);
}
