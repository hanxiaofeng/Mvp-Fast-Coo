package com.coo.mvp_coco.ui.main;

import android.widget.Toast;

import com.coo.mvp_coco.data.AppDataManager;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.db.AppDbHelper;
import com.coo.mvp_coco.db.DBHelper;
import com.coo.mvp_coco.db.DBOpenHelper;
import com.coo.mvp_coco.db.TestTabel;
import com.coo.mvp_coco.ui.base.BasePresenter;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public MainPresenter(DataManager dataManager, SchedulerProvider mSchedulerProvider) {
        super(dataManager,mSchedulerProvider);
    }


    @Override
    public void netRequest() {
        getMvpView().showLoading();

        disposable = Observable.timer(2, TimeUnit.SECONDS)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        getMvpView().hideLoading();
                        getMvpView().showMessage("请求成功");
                    }
                });
    }

    @Override
    public Observable<Long> insertTestData(TestTabel tabel) {
        return getmDataManager().insertTestData(tabel);
    }

    @Override
    public Observable<List<TestTabel>> getAllData() {
        return getmDataManager().getAllTestData();
    }
}
