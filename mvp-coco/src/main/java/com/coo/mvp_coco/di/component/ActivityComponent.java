package com.coo.mvp_coco.di.component;

import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.di.module.ActivityModule;
import com.coo.mvp_coco.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
