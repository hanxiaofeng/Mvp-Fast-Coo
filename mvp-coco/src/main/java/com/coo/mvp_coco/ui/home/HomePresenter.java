package com.coo.mvp_coco.ui.home;

import android.util.Log;

import com.coo.coonet.EasyHttp;
import com.coo.coonet.callback.CallBackProxy;
import com.coo.coonet.callback.SimpleCallBack;
import com.coo.coonet.exception.ApiException;
import com.coo.coonet.model.ApiResult;
import com.coo.coonet.model.CooApiResult;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.ui.base.BasePresenter;
import com.coo.mvp_coco.utils.AppConstants;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import java.util.Timer;

import javax.inject.Inject;

import timber.log.Timber;

public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V> implements HomeMvpPresenter<V> {

    private int pageNumber = 0;

    @Inject
    public HomePresenter(DataManager mDataManager, SchedulerProvider mSchedulerProvider) {
        super(mDataManager, mSchedulerProvider);
    }

    @Override
    public void getAllArticle(int pageNumber) {

        EasyHttp.get(AppConstants.BaseUrl+"/article/list/"+pageNumber+"/json")
                .execute(new CallBackProxy<CooApiResult<HomeModel>, HomeModel>(new SimpleCallBack<HomeModel>() {
                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(HomeModel homeModel) {
                        Timber.e("homeModel = "+homeModel);
                    }
                }) {
                });

    }
}
