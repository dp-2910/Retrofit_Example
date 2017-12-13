package com.example.serpentcs.retrofitwithgsonexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("users/{user}/repos")
    Call<List<RepoModel>> listRepos(@Path("user") String user);

//    @GET("movie/{id}")
//    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}