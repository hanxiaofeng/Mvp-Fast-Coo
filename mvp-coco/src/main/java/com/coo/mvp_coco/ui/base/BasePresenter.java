package com.coo.mvp_coco.ui.base;

import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private static final String TAG = BasePresenter.class.getSimpleName();

    private final SchedulerProvider mSchedulerProvider;

    private V mMvpView;

    protected Disposable disposable;

    @Inject
    public BasePresenter(SchedulerProvider mSchedulerProvider) {
        this.mSchedulerProvider = mSchedulerProvider;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mMvpView = null;
        if(null != disposable && !disposable.isDisposed()){
            disposable.dispose();
        }
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    @Override
    public void netWorkError(String errorMsg) {

    }
}
