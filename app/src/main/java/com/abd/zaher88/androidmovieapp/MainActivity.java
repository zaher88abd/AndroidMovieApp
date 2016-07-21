package com.abd.zaher88.androidmovieapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.abd.zaher88.androidmovieapp.DataObject.Movie;
import com.abd.zaher88.androidmovieapp.DataObject.MovieList;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getMoviePopular() {
        Call<MovieList> call = new RestClient().getApiService().getPopular(getString(R.string.movie_api_key));
        call.enqueue(new Callback<MovieList>() {
            @Override
            public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                if (response.isSuccessful()) {
                    Log.d("moveList", String.valueOf(response.body().getResults().size()));
                    setUpList(response.body().getResults());
                } else Log.d("moveList", response.message() + response.errorBody());
            }

            @Override
            public void onFailure(Call<MovieList> call, Throwable t) {
                Log.e("moveList", t.getMessage());

            }
        });
    }

    private void setUpList(ArrayList<Movie> results) {
    }
}
