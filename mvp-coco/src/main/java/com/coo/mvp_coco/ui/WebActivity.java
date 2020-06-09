package com.coo.mvp_coco.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.coo.mvp_coco.R;
import com.coo.mvp_coco.ui.base.BaseActivity;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.AgentWebView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WebActivity extends BaseActivity {

    @BindView(R.id.web_layout)
    LinearLayout webLayout;

    public static final String WEB_JUMP_URL = "web_jump_url";

    private String url = "";
    private AgentWeb agentWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        setUnBinder(ButterKnife.bind(this));

        url = getIntent().getStringExtra(WEB_JUMP_URL);

        initView();
    }

    private void initView() {
        agentWeb = AgentWeb.with(this)
                .setAgentWebParent(webLayout, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go(url);
    }

    @OnClick(R.id.back)
    public void dealOnClick(View view){
        switch (view.getId()){
            case R.id.back:
                finish();
                break;
        }
    }
}
