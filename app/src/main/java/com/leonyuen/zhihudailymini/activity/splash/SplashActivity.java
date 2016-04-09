package com.leonyuen.zhihudailymini.activity.splash;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.leonyuen.zhihudailymini.R;
import com.leonyuen.zhihudailymini.base.BaseActivity;
import com.leonyuen.zhihudailymini.engine.MainApplication;
import com.nostra13.universalimageloader.core.ImageLoader;

public class SplashActivity extends BaseActivity {

    private static String mImageUrl = "https://pic3.zhimg.com/2d16f25c61e0323babf2f8ff5eb94d9f.jpg";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mImageView = (ImageView) findViewById(R.id.iv_splash);

        AnimationSet animationSet = new AnimationSet(true);

        // 缩小动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        AlphaAnimation outAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(3000L);
//        animationSet.addAnimation(outAnimation);
//        animationSet.setDuration(2000L);
        mImageView.startAnimation(animationSet);

    }
}
