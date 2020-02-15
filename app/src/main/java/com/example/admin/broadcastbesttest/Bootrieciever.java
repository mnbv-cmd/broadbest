package com.example.admin.broadcastbesttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Bootrieciever extends BroadcastReceiver {
    public Bootrieciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast toast=new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);	//设置持续时间
        toast.setGravity(Gravity.CENTER, 0, 0);	//设置对齐方式
        LinearLayout ll=new LinearLayout(context);	//创建一个线性布局管理器
        ImageView iv=new ImageView(context);	//创建一个ImageView
        iv.setImageResource(R.drawable.imgd1);	//设置要显示的图片
        iv.setPadding(0, 0, 5, 0);	//设置ImageView的右边距
        ll.addView(iv);	//将ImageView添加到线性布局管理器中
        TextView tv=new TextView(context);		//创建一个TextView
        tv.setText("傻邓情书：爱你宠你喜欢你，春风十里不如你");	//为TextView设置文本内容
        ll.addView(tv);	//将TextView添加到线性布局管理器中
        toast.setView(ll);	//设置消息提示框中要显示的视图
        toast.show();	//显示消息提示框</span>
    }
}
