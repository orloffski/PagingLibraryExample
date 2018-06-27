package com.example.madcat.paginglibraryexample_1;

import android.app.Application;
import android.content.Context;

public class CarApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        initContext();
    }

    private void initContext() {
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
