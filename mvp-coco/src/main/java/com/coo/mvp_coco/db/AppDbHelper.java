package com.coo.mvp_coco.db;

import com.coo.mvp_coco.db.gen.DaoMaster;
import com.coo.mvp_coco.db.gen.DaoSession;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * 描述：
 * 作者：coco
 * 添加时间：2020/5/21 11:10
 */
@Singleton
public class AppDbHelper implements DBHelper{

    private final DaoSession mDaoSession;

    @Inject
    public AppDbHelper(DBOpenHelper dbOpenHelper) {
        mDaoSession = new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
    }

    @Override
    public Observable<Long> insertTestData(TestTabel tabel) {
        return Observable.fromCallable(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return mDaoSession.getTestTabelDao().insert(tabel);
            }
        });
    }

    @Override
    public Observable<List<TestTabel>> getAllTestData() {
        return Observable.fromCallable(new Callable<List<TestTabel>>() {
            @Override
            public List<TestTabel> call() throws Exception {
                return mDaoSession.getTestTabelDao().queryBuilder().list();
            }
        });
    }
}
