package com.retrofitwithgsonexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Dhaval Patel on 13/12/17.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<List<RepoModel>> call = apiService.listRepos("aliasgar0512");
        call.enqueue(new Callback<List<RepoModel>>() {
            @Override
            public void onResponse(Call<List<RepoModel>> call, Response<List<RepoModel>> response) {
                List<RepoModel> repoModelList = response.body();
                Log.e(TAG, "onResponse: =====repoModelList======" + repoModelList.size());
                if (repoModelList.size() > 0) {
                    for (RepoModel repoModel : repoModelList) {
                        Log.e(TAG, "===========onResponse:=========" + repoModel.getRepoOwner().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<RepoModel>> call, Throwable t) {

            }
        });

    }
}
