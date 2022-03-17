package com.example.weatherforcast17032022.di.module;

import com.example.weatherforcast17032022.ui.features.current_temp.CurrentTempActivity;
import com.example.weatherforcast17032022.ui.features.current_temp.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


//subconponent cho acticity
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    public abstract CurrentTempActivity bindContributeCurrentActivity();

    @ContributesAndroidInjector
    public abstract MainActivity bindContributeMainActivity();

}
