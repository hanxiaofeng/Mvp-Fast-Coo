package com.coo.mvp_coco.ui.home.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.blankj.utilcode.util.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.coo.mvp_coco.R;
import com.coo.mvp_coco.di.component.ActivityComponent;
import com.coo.mvp_coco.ui.base.BaseFragment;
import com.coo.mvp_coco.ui.home.HomeActivity;
import com.coo.mvp_coco.ui.home.HomeModel;
import com.coo.mvp_coco.ui.home.HomeMvpView;
import com.coo.mvp_coco.ui.home.adapter.HomeAdapter;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentMvpView;
import com.coo.mvp_coco.ui.home.fragment.msgfg.HomeFragmentPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;


/**
 * 消息
 */
public class HomeFragment extends BaseFragment implements HomeFragmentMvpView {

    private int pageNumber = 0;
    private int pageSize = 20;

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Inject
    HomeFragmentPresenter<HomeFragmentMvpView> homeFragmentPresenter;

    @Inject
    HomeAdapter homeAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            homeFragmentPresenter.onAttach(this);
        }

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();

        homeFragmentPresenter.getAllArticle(pageNumber);
    }

    private void initView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));
        recyclerView.setAdapter(homeAdapter);

        homeAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                HomeModel.ArticleInfo articleInfo = (HomeModel.ArticleInfo) adapter.getData().get(position);
                ((HomeActivity)mActivity).jumpWebActivity(articleInfo.getLink());
            }
        });

        initLoadMore();
        initRefreshLayout();
    }

    private void initLoadMore() {
        homeAdapter.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                //上拉加载时取消下拉刷新
                swipeRefreshLayout.setRefreshing(false);
                homeAdapter.getLoadMoreModule().setEnableLoadMore(true);
                //请求数据
                homeFragmentPresenter.getAllArticle(pageNumber);
            }
        });
        homeAdapter.getLoadMoreModule().setAutoLoadMore(true);
        //当自动加载开启，同时数据不满一屏时，是否继续执行自动加载更多(默认为true)
        homeAdapter.getLoadMoreModule().setEnableLoadMoreIfNotFullPage(false);
    }

    private void initRefreshLayout() {
        swipeRefreshLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // 这里的作用是防止下拉刷新的时候还可以上拉加载
                homeAdapter.getLoadMoreModule().setEnableLoadMore(false);
                // 下拉刷新，需要重置页数
                pageNumber = 0;
                //请求数据
                homeFragmentPresenter.getAllArticle(pageNumber);
            }
        });
    }

    private void dealNetData(HomeModel homeModel) {
        //省略网络请求数据......
        //网络请求成功后下拉刷新与上拉加载都做如下处理:

        swipeRefreshLayout.setRefreshing(false);
        homeAdapter.getLoadMoreModule().setEnableLoadMore(true);
        if (pageNumber == 0) {
            //如果是加载的第一页数据，用 setData()
            homeAdapter.setList(homeModel.getDatas());
        } else {
            //不是第一页，则用add
            homeAdapter.addData(homeModel.getDatas());
        }

        Timber.e("data.size = "+homeModel.getDatas().size());

        if (homeModel.getDatas().size() == 0) {
            //无数据,显示没有更多数据布局
            homeAdapter.getLoadMoreModule().loadMoreEnd();
        } else {
            homeAdapter.getLoadMoreModule().loadMoreComplete();
            // page加一
            ++pageNumber;
        }
    }

    @Override
    public void jumpWebActivity() {

    }

    @Override
    public void refreshView(HomeModel homeModel) {
        /*if (null != homeModel && homeModel.getDatas().size() > 0) {
            homeAdapter.setList(homeModel.getDatas());
        } else {
            showMessage("无更多数据了");
        }*/
        dealNetData(homeModel);
    }

    @Override
    protected void setUp(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void openKeyboard() {

    }
}
