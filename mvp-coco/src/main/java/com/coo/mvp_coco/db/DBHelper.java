package com.coo.mvp_coco.db;

import java.util.List;

import io.reactivex.Observable;

public interface DBHelper {

    Observable<Long> insertTestData(TestTabel tabel);

    Observable<List<TestTabel>> getAllTestData();
}
