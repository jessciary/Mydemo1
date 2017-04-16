package com.bignerdranch.android.mydemo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by jiangxinyi on 2017/4/15.
 */

public class bianxieActivity extends Activity{
    //初始化
    private Button button1;
    private Button button2;
    private ImageButton share;
    private ImageButton picture;
    private ImageButton music;
    private ImageButton luyin;
    private ImageButton vedio;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findViewById添加到activity中
        button1 =(Button)findViewById(R.id.bx_button1);
        /*通过匿名内部类实现监听*/
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //实现功能：点击按钮，跳转到tiaozhaun界面
                Intent intent =new Intent(bianxieActivity.this,tiaozhuanActivity.class);
                startActivityForResult(intent,1) ;    //有返回值的跳转
            }
        });

        button2 =(Button)findViewById(R.id.bx_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，跳转页面，连接日历时间
            }
        });

        share=(ImageButton)findViewById(R.id.imageButton2);
        share.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，分享备忘至其他平台
            }
        });

        picture=(ImageButton)findViewById(R.id.imageButton3);
        picture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，连接手机相册
            }
        });

        music=(ImageButton)findViewById(R.id.imageButton4);
        music.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，连接手机音乐库
            }
        });

        luyin=(ImageButton)findViewById(R.id.imageButton5);
        luyin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，连接手机录音
            }
        });

        vedio=(ImageButton)findViewById(R.id.imageButton6);
        vedio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //待完善功能：点击按钮，连接手机视频库
            }
        });

    }

    //接收编写界面第一个按钮的返回数据
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        //第一个参数是请求的标志，第二个参数是返回的标志，第三个参数是回传的数据
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode ==1&&resultCode ==2){
            //待完善功能：将新的备忘录添加到分类中
        }
    }
}
