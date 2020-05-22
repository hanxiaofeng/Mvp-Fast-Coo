package com.coo.mvp_coco.data;

import android.content.Context;

import com.coo.mvp_coco.db.DBHelper;
import com.coo.mvp_coco.db.TestTabel;
import com.coo.mvp_coco.di.ApplicationContext;
import com.coo.mvp_coco.di.PerActivity;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

@Singleton
public class AppDataManager implements DataManager{

    private final Context mContext;
    private final DBHelper mDbHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context mContext, DBHelper mDbHelper) {
        this.mContext = mContext;
        this.mDbHelper = mDbHelper;
    }

    @Override
    public Observable<Long> insertTestData(TestTabel tabel) {
        return mDbHelper.insertTestData(tabel);
    }

    @Override
    public Observable<List<TestTabel>> getAllTestData() {
        return mDbHelper.getAllTestData();
    }
}
