package com.coo.mvp_coco.di.component;

import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.di.module.FragmentModule;
import com.coo.mvp_coco.ui.home.fragment.ContactsFragment;
import com.coo.mvp_coco.ui.home.fragment.FindFragment;
import com.coo.mvp_coco.ui.home.fragment.HomeFragment;
import com.coo.mvp_coco.ui.home.fragment.MeFragment;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Component(modules = FragmentModule.class,dependencies = ApplicationComponent.class)
public interface FragmentComponent {

    void inject(ContactsFragment contactsFragment);

    void inject(FindFragment findFragment);

    void inject(MeFragment findFragment);

    void inject(HomeFragment homeFragment);

}
