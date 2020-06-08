package com.coo.mvp_coco.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.coo.mvp_coco.di.ActivityContext;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.ui.home.HomePresenter;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpPresenter;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;
import com.coo.mvp_coco.ui.main.MainMvpPresenter;
import com.coo.mvp_coco.ui.main.MainMvpView;
import com.coo.mvp_coco.ui.main.MainPresenter;
import com.coo.mvp_coco.utils.rx.AppSchedulerProvider;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
@PerActivity
public class FragmentModule {

    private Fragment mFragment;

    public FragmentModule(Fragment mFragment) {
        this.mFragment = mFragment;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mFragment.getActivity();
    }

    @Provides
    Fragment provideFragment(){
        return mFragment;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider(){
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    HomeFragmentMvpPresenter<HomeFragmentMvpView> provideHomeFragmentPresenter(HomeFragmentPresenter<HomeFragmentMvpView> presenter){
        return presenter;
    }

}
