package com.example.asm;

import android.app.Application;

import org.litepal.LitePal;

public class MyApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        LitePal.initialize(this);
    }

}
