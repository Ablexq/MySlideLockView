package com.xq.myslidelockview.demo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xq.myslidelockview.R;

public class Demo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        SlideRightViewDragHelper dragHelper;
        dragHelper = (SlideRightViewDragHelper) findViewById(R.id.get_order_drag_helper);
        dragHelper.setOnReleasedListener(new SlideRightViewDragHelper.OnReleasedListener() {
            @Override
            public void onReleased() {
                //TODO
            }
        });
    }
}