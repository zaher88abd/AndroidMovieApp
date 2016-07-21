package com.abd.zaher88.androidmovieapp;

import com.abd.zaher88.androidmovieapp.DataObject.MovieList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Zaher on 2016-07-19.
 */
public interface MovieDBInterface {
    @GET("movie/popular")
    Call<MovieList> getPopular(@Query("api_key") String apiKey);
}
