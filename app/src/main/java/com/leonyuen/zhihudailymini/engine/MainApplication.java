package com.leonyuen.zhihudailymini.engine;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * Created by leon-yuen on 16-4-9.
 */
public class MainApplication extends Application {

    private static MainApplication mainApplication;
    private static ImageLoader mImageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        mainApplication = this;
        initImageLoader(mainApplication.getApplicationContext());
    }

    public static MainApplication getInstance() {
        return mainApplication;
    }

    public void initImageLoader(Context context) {
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration
                                        .Builder(context)
                .denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .build();
        mImageLoader = ImageLoader.getInstance();
        mImageLoader.init(configuration);
    }

    public static ImageLoader getImageLoader() {
        return mImageLoader;
    }
}
