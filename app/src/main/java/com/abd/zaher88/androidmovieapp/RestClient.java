package com.abd.zaher88.androidmovieapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Zaher on 02/05/2016.
 */
public class RestClient {
    private static final String BASE_URL = "http://api.themoviedb.org/3/";
    private  MovieDBInterface movieService;


    public RestClient() {
//        final OkHttpClient okHttpClient = new OkHttpClient();
//        okHttpClient.setConnectTimeout(60, TimeUnit.SECONDS);
//        okHttpClient.setReadTimeout(60,TimeUnit.SECONDS);
//        okHttpClient.setWriteTimeout(60,TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        movieService = retrofit.create(MovieDBInterface.class);
    }

    public MovieDBInterface getApiService() {
        return movieService;
    }
}
