package com.coo.mvp_coco.ui.home.adapter;

import android.text.TextUtils;
import android.view.View;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.home.HomeModel;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.Provides;

public class HomeAdapter extends BaseQuickAdapter<HomeModel.ArticleInfo, BaseViewHolder> implements LoadMoreModule {

    private List<HomeModel.ArticleInfo> articleInfos = new ArrayList<>();

    public HomeAdapter(List<HomeModel.ArticleInfo> articleInfos) {
        super(R.layout.home_item, articleInfos);
    }

    @Inject
    public HomeAdapter() {
        super(R.layout.home_item);
    }

    @Override
    protected void convert(@NonNull final BaseViewHolder helper, final HomeModel.ArticleInfo item) {
        helper.setText(R.id.tv_title, item.getTitle());

        helper.getView(R.id.tv_from).setVisibility(TextUtils.isEmpty(item.getChapterName()) ? View.GONE : View.VISIBLE);
        helper.setText(R.id.tv_from, item.getChapterName());

        helper.getView(R.id.tv_author).setVisibility(TextUtils.isEmpty(item.getShareUser()) ? View.GONE : View.VISIBLE);
        helper.setText(R.id.tv_author, item.getShareUser());

        helper.getView(R.id.tv_update_time).setVisibility(TextUtils.isEmpty(item.getNiceDate()) ? View.GONE : View.VISIBLE);
        helper.setText(R.id.tv_update_time, item.getNiceDate());
    }
}
