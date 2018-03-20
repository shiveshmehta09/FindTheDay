package com.shivesh.daggerfragmentexample.findtheday;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shivesh on 1/27/2018.
 */
@Module
public class ChooserModule {

    @Singleton
    @Provides
    DayChooser provideDayChooser() {


        return new DayChooser();
    }
}
