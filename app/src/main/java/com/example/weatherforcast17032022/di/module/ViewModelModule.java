package com.example.weatherforcast17032022.di.module;

import androidx.lifecycle.ViewModelProvider;

import com.example.weatherforcast17032022.di.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelModule {
//    @Binds
//    @IntoMap
//    @ViewModelKey(ProfileViewModel.class)
//    abstract ViewModel bindProfileViewModel(ProfileViewModel profileViewModel);


    //@@@=-=-=-=@@@
    //Thay vi khoi tao doi tuong la @provide
    //VD
//    @Provides
//    public abstract Object provideObject()
//    {
//        return new Object();
//    }
    //Thi nen thay bang thang @Binds cho gon
    //VD
//    @Binds
//    public  abstract Object provideObject();
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}


// Các 1 :
//@Module
//public class NetWorkModule {
//
//    @Provides
//    public static Object provideObject() {
//        return new Object();
//    }
//}

//@Module
//public abstract class NetWorkModule {
//
//    @Binds
//    public abstract Object provideObject();
//}