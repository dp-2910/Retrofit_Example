package com.retrofitwithgsonexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Dhaval Patel on 13/12/17.
 */
public interface ApiInterface {

    @GET("users/{user}/repos")
    Call<List<RepoModel>> listRepos(@Path("user") String user);
}