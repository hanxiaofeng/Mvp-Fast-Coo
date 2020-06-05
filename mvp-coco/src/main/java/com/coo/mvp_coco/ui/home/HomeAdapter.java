package com.coo.mvp_coco.ui.home;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.coo.mvp_coco.ui.home.HomeModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HomeAdapter extends BaseQuickAdapter<HomeModel.ArticleInfo, BaseViewHolder> {

    public HomeAdapter(int layoutResId, @Nullable List<HomeModel.ArticleInfo> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, HomeModel.ArticleInfo articleInfo) {

    }
}
