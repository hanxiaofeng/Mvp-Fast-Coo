package com.coo.mvp_coco.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.coo.mvp_coco.di.ActivityContext;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpPresenter;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;
import com.coo.mvp_coco.ui.main.MainMvpPresenter;
import com.coo.mvp_coco.ui.main.MainMvpView;
import com.coo.mvp_coco.ui.main.MainPresenter;
import com.coo.mvp_coco.utils.rx.AppSchedulerProvider;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.Disposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider(){
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> presenter){
        return presenter;
    }

    @Provides
    HomeFragmentMvpPresenter<HomeFragmentMvpView> provideHomeFragmentPresenter(HomeFragmentPresenter<HomeFragmentMvpView> presenter){
        return presenter;
    }

}
