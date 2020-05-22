package com.coo.mvp_coco.di.module;

import android.app.Application;
import android.content.Context;

import com.coo.mvp_coco.data.AppDataManager;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.db.AppDbHelper;
import com.coo.mvp_coco.db.DBHelper;
import com.coo.mvp_coco.di.ApplicationContext;
import com.coo.mvp_coco.di.DatabaseInfo;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DBHelper provideDbHelper(AppDbHelper appDbHelper){
        return appDbHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }


}
