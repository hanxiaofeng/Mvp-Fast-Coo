package com.coo.mvp_coco.ui.home;

import com.coo.mvp_coco.ui.base.MvpPresenter;

/**
 * 数据请求相关
 * @param <V>
 */
public interface HomeMvpPresenter<V extends HomeMvpView> extends MvpPresenter<V> {

    void getAllArticle(int pageNumber);
}
