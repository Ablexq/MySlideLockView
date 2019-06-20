package com.xq.myslidelockview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xq.myslidelockview.demo1.Demo1Activity;
import com.xq.myslidelockview.demo2.Demo2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, Demo1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, Demo2Activity.class));
                break;
        }
    }
}
