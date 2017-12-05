package com.example.aman1.moviecharacters.services;

import com.example.aman1.moviecharacters.constants.Api_Constants;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aman1 on 05/12/2017.
 */

public class RequestConnection {
    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;

    public static RequestInterface getConnection(){
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(Api_Constants.URL)
                .build();

        return retrofit.create(RequestInterface.class);
    }
}
