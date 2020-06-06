package com.coo.mvp_coco.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.coo.mvp_coco.di.ActivityContext;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.ui.main.MainMvpPresenter;
import com.coo.mvp_coco.ui.main.MainMvpView;
import com.coo.mvp_coco.ui.main.MainPresenter;
import com.coo.mvp_coco.utils.rx.AppSchedulerProvider;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
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

    /*@Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> presenter){
        return presenter;
    }*/

}
