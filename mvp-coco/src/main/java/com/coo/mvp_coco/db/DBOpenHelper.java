package com.coo.mvp_coco.db;

import android.content.Context;

import com.coo.mvp_coco.db.gen.DaoMaster;
import com.coo.mvp_coco.di.ApplicationContext;
import com.coo.mvp_coco.di.DatabaseInfo;
import com.coo.mvp_coco.utils.AppLogger;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/**
 * 描述：
 * 作者：coco
 * 添加时间：2020/5/21 11:16
 */

@Singleton
public class DBOpenHelper extends DaoMaster.OpenHelper {

    private String simpleName = this.getClass().getSimpleName();

    @Inject
    public DBOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);

        AppLogger.d(simpleName,"DB_OLD_VERSION : " + oldVersion + ", DB_NEW_VERSION : " + newVersion);

        switch (oldVersion){
            case 1:
            case 2:
                //执行升级操作
        }
    }
}
