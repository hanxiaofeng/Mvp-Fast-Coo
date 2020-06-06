package com.coo.mvp_coco.ui.main;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.coo.coonet.EasyHttp;
import com.coo.coonet.callback.CallBackProxy;
import com.coo.coonet.callback.SimpleCallBack;
import com.coo.coonet.exception.ApiException;
import com.coo.coonet.model.ApiResult;
import com.coo.coonet.model.CooApiResult;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.db.TestTabel;
import com.coo.mvp_coco.ui.base.BasePresenter;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public MainPresenter(DataManager dataManager, SchedulerProvider mSchedulerProvider) {
        super(dataManager, mSchedulerProvider);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void netRequest() {
        getMvpView().showLoading();

        /*EasyHttp.post("/user/login")
                .params("username","hanxiaofeng")
                .params("password","123456")
                .timeStamp(true)
                .execute(new SimpleCallBack<String>() {
                    @Override
                    public void onError(ApiException e) {
                        getMvpView().hideLoading();
                        Log.e("wangkeke","error = "+e.getDisplayMessage());
                    }

                    @Override
                    public void onSuccess(String s) {
                        getMvpView().hideLoading();
                        Log.e("wangkeke","s = "+s);
                    }
                });*/

        EasyHttp.post("/user/login")
                .params("username", "hanxiaofeng")
                .params("password", "123456")
                .execute(new CallBackProxy<CooApiResult<LoginModel>, LoginModel>(new SimpleCallBack<LoginModel>() {
                    @Override
                    public void onError(ApiException e) {
                        getMvpView().hideLoading();
                        Log.e("wangkeke", "error = " + e.getDisplayMessage());
                    }

                    @Override
                    public void onSuccess(LoginModel loginModel) {
                        getMvpView().hideLoading();
                        Log.e("wangkeke", "loginModel = " + loginModel);


//                        EasyHttp.getCookieJar().removeAll();


                        Observable.timer(200, TimeUnit.MILLISECONDS)
                                .subscribeOn(getSchedulerProvider().io())
                                .observeOn(getSchedulerProvider().ui())
                                .subscribe(new Consumer<Long>() {
                                    @Override
                                    public void accept(Long aLong) throws Exception {
                                        EasyHttp.post("/user/lg/private_articles/1/json")
                                                .timeStamp(true)
                                                .execute(new SimpleCallBack<String>() {
                                                    @Override
                                                    public void onError(ApiException e) {
                                                        Log.e("wangkeke","error = "+e.getDisplayMessage());
                                                    }

                                                    @Override
                                                    public void onSuccess(String s) {
                                                        Log.e("wangkeke","s = "+s);
                                                    }
                                                });
                                    }
                                });

                    }
                }) {
                });

        /*disposable = Observable.timer(2, TimeUnit.SECONDS)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        getMvpView().hideLoading();
                        getMvpView().showMessage("请求成功");
                    }
                });*/


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
