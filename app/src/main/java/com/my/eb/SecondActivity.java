package com.my.eb;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.my.model.MessageEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by AOW on 2018/3/6.
 */

public class SecondActivity extends Activity{
    @ViewInject(R.id.second_bt)
    Button second_bt;
    @OnClick({R.id.second_bt})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.second_bt:
                EventBus.getDefault().post(new MessageEvent("事件发布者发布事件"));

                finish();
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_second);
        ViewUtils.inject(this);
    }
}
