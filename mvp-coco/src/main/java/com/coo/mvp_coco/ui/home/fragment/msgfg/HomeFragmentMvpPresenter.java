package com.coo.mvp_coco.ui.home.fragment.msgfg;

import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.ui.base.MvpPresenter;

@PerActivity
public interface HomeFragmentMvpPresenter<V extends HomeFragmentMvpView> extends MvpPresenter<V> {
    void getAllArticle(int pageNumber);
}
