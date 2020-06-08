package com.coo.mvp_coco.di.component;

import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.di.module.ActivityModule;
import com.coo.mvp_coco.ui.home.HomeActivity;
import com.coo.mvp_coco.ui.home.fragment.ContactsFragment;
import com.coo.mvp_coco.ui.home.fragment.FindFragment;
import com.coo.mvp_coco.ui.home.fragment.HomeFragment;
import com.coo.mvp_coco.ui.home.fragment.MeFragment;
import com.coo.mvp_coco.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(HomeActivity activity);

    void inject(ContactsFragment contactsFragment);

    void inject(FindFragment findFragment);

    void inject(MeFragment findFragment);

    void inject(HomeFragment homeFragment);
}
