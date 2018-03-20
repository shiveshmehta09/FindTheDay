package com.shivesh.daggerfragmentexample.findtheday;

import android.app.Application;

/**
 * Created by Shivesh on 1/27/2018.
 */

public class MyApp extends Application {

    private static MyApp myApp;
    private ApplicationComponent applicationComponent;

    public static MyApp getMyApp() {
        return myApp;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        myApp = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .chooserModule(new ChooserModule())
                .build();
    }
}
