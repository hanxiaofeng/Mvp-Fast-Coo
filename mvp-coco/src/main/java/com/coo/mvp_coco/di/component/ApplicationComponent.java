package com.coo.mvp_coco.di.component;

import android.app.Application;
import android.content.Context;

import com.coo.mvp_coco.MvpApp;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.di.ApplicationContext;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
