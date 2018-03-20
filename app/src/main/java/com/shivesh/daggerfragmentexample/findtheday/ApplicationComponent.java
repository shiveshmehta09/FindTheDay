package com.shivesh.daggerfragmentexample.findtheday;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shivesh on 1/27/2018.
 */
@Singleton
@Component(modules = ChooserModule.class)
public interface ApplicationComponent {

    void inject(DayFragment dayFragment);

}
