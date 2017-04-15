package com.bignerdranch.android.mydemo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

/**
 * Created by jiangxinyi on 2017/4/15.
 */

public class tiaozhuanActivity extends Activity{
    //初始化
    private Button button3;
    private Button button4;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findViewById添加到activity中
        button3 =(Button)findViewById(R.id.tz_button1);
        button4 =(Button)findViewById(R.id.tz_button2);
        /*通过匿名内部类实现监听*/
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //实现：点击按钮，回传数据给bianxieActivity
                Intent data=new Intent();
                //待完善功能：点击按钮，确定添加到该分类中
                setResult(2,data);
                finish();    //结束当前页面
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();    //实现功能：点击按钮，结束当前页面
            }
        });

        setContentView(R.layout.tiaozhuan1);
        cb1=(CheckBox)findViewById(R.id.checkBox1);   //初始化
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        //设置监听器
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //通过该方法监听当前checkBox是否被选中
                if(isChecked) {
                    //获取cb1的文本并打印
                    String text = cb1.getText().toString();
                    Log.i("tag",text);
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //通过该方法监听当前checkBox是否被选中
                if(isChecked) {
                    //获取cb1的文本并打印
                    String text = cb2.getText().toString();
                    Log.i("tag",text);
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //通过该方法监听当前checkBox是否被选中
                if(isChecked) {
                    //获取cb1的文本并打印
                    String text = cb3.getText().toString();
                    Log.i("tag",text);
                }
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //通过该方法监听当前checkBox是否被选中
                if(isChecked) {
                    //获取cb1的文本并打印
                    String text = cb4.getText().toString();
                    Log.i("tag",text);
                }
            }
        });


    }
}
