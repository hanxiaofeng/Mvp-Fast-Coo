package com.coo.mvp_coco.ui.base;

import androidx.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void openKeyboard();

    void hideKeyboard();

    void onError(@StringRes int resId);

    void onError(String message);
}
