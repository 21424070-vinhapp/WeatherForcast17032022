package com.example.weatherforcast17032022.ui;
import com.example.weatherforcast17032022.di.component.AppComponent;
import com.example.weatherforcast17032022.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import retrofit2.Retrofit;

public class MyApplication extends DaggerApplication {

    @Inject
    public Retrofit mRetrofit;

    AppComponent mAppcomponent;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        mAppcomponent= DaggerAppComponent.builder().application(this).build();
        return mAppcomponent;
    }
}