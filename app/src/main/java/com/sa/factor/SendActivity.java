package com.sa.factor;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.sa.factor.api.PostDataService;
import com.sa.factor.api.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        PostDataService service = RetrofitClientInstance.getRetrofitInstance().create(PostDataService.class);
        Call<LoginResponse> call = service.Login("09120332353");
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                String token = response.body() != null ? response.body().token : "";
                Log.wtf("token", token);
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }
}
