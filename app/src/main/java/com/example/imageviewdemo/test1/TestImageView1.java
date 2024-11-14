package com.example.imageviewdemo.test1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/**
 * ImageView显示一张图片，当图片高度大于ImageView高度的时候，水平铺满，显示图片从上到下的部分，高出控件部分不显示
 */
public class TestImageView1 extends androidx.appcompat.widget.AppCompatImageView {

    public TestImageView1(Context context) {
        super(context);
    }

    public TestImageView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestImageView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int width = MeasureSpec.getSize(widthMeasureSpec);
            int drawableWidth = drawable.getIntrinsicWidth();
            int drawableHeight = drawable.getIntrinsicHeight();

            if (drawableWidth > 0 && drawableHeight > 0) {
                float aspectRatio = (float) drawableWidth / drawableHeight;

                float realHeight = (float)width / aspectRatio;
                setMeasuredDimension(width, (int)realHeight);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}