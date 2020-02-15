package com.example.admin.broadcastbesttest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class newscontent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newscontent);
        String Title=getIntent().getStringExtra("news_title");
        String contentr=getIntent().getStringExtra("nes_content");
        NewscontentFragment newscontentFragment=(NewscontentFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_content);
        newscontentFragment.refresh(Title,contentr);
    }
public static void actionStart(Context context,String data1,String data2)
{
    Intent intent=new Intent(context,newscontent.class);
    intent.putExtra("news_title",data1);
    intent.putExtra("nes_content",data2);
    context.startActivity(intent);
}

}

