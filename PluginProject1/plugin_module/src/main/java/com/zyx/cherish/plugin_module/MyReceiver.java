package com.zyx.cherish.plugin_module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.zyx.cherish.stander.ReceiverInterface;

public class MyReceiver extends BroadcastReceiver implements ReceiverInterface {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我是插件里面的广播接收者，我收到广播了", Toast.LENGTH_SHORT).show();
    }
}
