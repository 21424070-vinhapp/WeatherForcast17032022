package com.example.weatherforcast17032022.ui.features.current_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.weatherforcast17032022.R;
import com.example.weatherforcast17032022.ui.MyApplication;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit=((MyApplication) getApplication()).mRetrofit;
        Log.d("BBB",retrofit.toString());

    }
}