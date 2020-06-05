package com.coo.mvp_coco.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.data.AppDataManager;
import com.coo.mvp_coco.db.TestTabel;
import com.coo.mvp_coco.ui.base.BaseActivity;
import com.coo.mvp_coco.utils.AppLogger;

import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.functions.Consumer;
import timber.log.Timber;


public class MainActivity extends BaseActivity implements MainMvpView{

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getmActivityComponent().inject(this);

        mPresenter.onAttach(this);

//        Timber.tag("main");
    }

    @Override
    public void jumpOtherActivity() {

    }

    @OnClick({R.id.btn_test})
    public void dealOnClick(View view){
        switch (view.getId()){
            case R.id.btn_test:
                mPresenter.netRequest();
                TestTabel tabel = new TestTabel();
                tabel.setInfo("你好");
                tabel.setName("xsy");
                mPresenter.insertTestData(tabel).subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
//                        Log.e("result","aLong =  "+aLong);
                        Timber.e("aLong =  "+aLong);
                    }
                });


                mPresenter.getAllData().subscribe(new Consumer<List<TestTabel>>() {
                    @Override
                    public void accept(List<TestTabel> testTabels) throws Exception {
//                        Log.e("result","testTabels = "+testTabels);
                        Timber.e("testTabels = "+testTabels);
                    }
                });
                break;
        }
    }
}
