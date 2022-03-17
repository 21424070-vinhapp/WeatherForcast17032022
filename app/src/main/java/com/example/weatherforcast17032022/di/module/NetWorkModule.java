package com.example.weatherforcast17032022.di.module;

import com.example.weatherforcast17032022.data.remote.ApiService;
import com.example.weatherforcast17032022.ultils.AppConstant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public  class NetWorkModule {

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                .build();
    }

    @Singleton
    @Provides
    public static Gson provideGson(){
        return new GsonBuilder().setLenient().disableHtmlEscaping().create();
    }

    @Singleton
    @Provides
    public static Retrofit provideRetrofit(Gson gson, OkHttpClient okhttpClient)
    {
        return new Retrofit.Builder()
                .baseUrl(AppConstant.BASE_URL)
                .client(okhttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }


    @Singleton
    @Provides
    public static ApiService provideApiService(Retrofit retrofit)
    {
        return retrofit.create(ApiService.class);
    }

}
