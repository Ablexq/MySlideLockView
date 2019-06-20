package com.xq.myslidelockview.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xq.myslidelockview.R;

public class Demo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        SlideLockView lockView = (SlideLockView) this.findViewById(R.id.lockview);
        lockView.setmLockListener(new SlideLockView.OnLockListener() {
            @Override
            public void onOpenLockSuccess() {
                System.out.println("===============onOpenLockSuccess================");
            }
        });
    }
}
