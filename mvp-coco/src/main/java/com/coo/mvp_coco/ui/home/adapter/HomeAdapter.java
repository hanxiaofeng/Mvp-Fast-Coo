package com.coo.mvp_coco.ui.home.adapter;

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
        helper.setText(R.id.tv_from, item.getChapterName());
        helper.setText(R.id.tv_author, item.getShareUser());
        helper.setText(R.id.tv_update_time, item.getNiceDate());
    }
}
