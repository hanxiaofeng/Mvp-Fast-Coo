package com.coo.mvp_coco.ui.base;

import androidx.annotation.StringRes;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void netWorkError(String errorMsg);
}
