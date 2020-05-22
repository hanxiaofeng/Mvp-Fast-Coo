package com.coo.mvp_coco.ui.main;

import com.coo.mvp_coco.db.TestTabel;
import com.coo.mvp_coco.di.PerActivity;
import com.coo.mvp_coco.ui.base.MvpPresenter;

import java.util.List;

import io.reactivex.Observable;

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V>{

    void netRequest();

    Observable<Long> insertTestData(TestTabel tabel);

    Observable<List<TestTabel>> getAllData();
}
