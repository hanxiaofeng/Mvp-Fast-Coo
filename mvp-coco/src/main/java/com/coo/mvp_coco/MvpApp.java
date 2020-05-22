package com.coo.mvp_coco;

import android.app.Application;

import com.coo.mvp_coco.di.component.ApplicationComponent;
import com.coo.mvp_coco.di.component.DaggerApplicationComponent;
import com.coo.mvp_coco.di.module.ApplicationModule;
import com.coo.mvp_coco.utils.AppLogger;

public class MvpApp extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
        AppLogger.init();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    public void setmApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.mApplicationComponent = mApplicationComponent;
    }
}
