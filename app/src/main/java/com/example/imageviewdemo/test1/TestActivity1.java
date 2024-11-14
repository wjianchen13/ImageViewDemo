package com.example.imageviewdemo.test1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.imageviewdemo.R;

/**
 * ImageView图片太高，水平铺满，显示上面那部分
 */
public class TestActivity1 extends AppCompatActivity {

    private TestImageView1 imgvTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        imgvTest1 = findViewById(R.id.imgv_test1);
    }

    public void onTest1(View v) {
        imgvTest1.setBackgroundResource(R.drawable.bg_test1);
    }
}