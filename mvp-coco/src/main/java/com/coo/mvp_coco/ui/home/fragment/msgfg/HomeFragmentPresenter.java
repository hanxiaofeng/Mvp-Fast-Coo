package com.coo.mvp_coco.ui.home.fragment.msgfg;

import com.coo.coonet.EasyHttp;
import com.coo.coonet.callback.CallBackProxy;
import com.coo.coonet.callback.SimpleCallBack;
import com.coo.coonet.exception.ApiException;
import com.coo.coonet.model.CooApiResult;
import com.coo.mvp_coco.data.DataManager;
import com.coo.mvp_coco.ui.base.BasePresenter;
import com.coo.mvp_coco.ui.home.HomeModel;
import com.coo.mvp_coco.utils.AppConstants;
import com.coo.mvp_coco.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import timber.log.Timber;

public class HomeFragmentPresenter<V extends HomeFragmentMvpView> extends BasePresenter<V> implements HomeFragmentMvpPresenter<V> {

    @Inject
    public HomeFragmentPresenter(DataManager mDataManager, SchedulerProvider mSchedulerProvider) {
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
