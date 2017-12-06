package com.example.aman1.moviecharacters;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by aman1 on 06/12/2017.
 */

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
