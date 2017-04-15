package com.bignerdranch.android.mydemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //初始化
    private ImageButton imgButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findViewById添加到activity中
        imgButton = (ImageButton) findViewById(R.id.imageButton);
        /*通过匿名内部类实现监听*/
        imgButton.setOnClickListener(new View.OnClickListener() {   //注册点击事件
            public void onClick(View arg0) {
                //实现功能：点击按钮跳转进入bianxie界面，无返回结果
                Intent intent=new Intent(MainActivity.this,bianxieActivity.class);   //初始化Intent，第一个参数为上下文对象this，第二个参数为目标文件
                startActivity(intent);
            }
        });



    }
}
