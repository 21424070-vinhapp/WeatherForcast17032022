package com.example.weatherforcast17032022.ui.features.current_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.weatherforcast17032022.R;
import com.example.weatherforcast17032022.ui.MyApplication;

import javax.inject.Inject;

import dagger.android.DaggerActivity;
import retrofit2.Retrofit;


public class CurrentTempActivity extends DaggerActivity {
    Retrofit retrofit;

    Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_temp);
        retrofit = ((MyApplication) getApplication()).mRetrofit;
        Log.d("BBB",retrofit.toString());

        mBtn=findViewById(R.id.btnNavigationSceen2);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrentTempActivity.this,MainActivity.class));
            }
        });
    }
}