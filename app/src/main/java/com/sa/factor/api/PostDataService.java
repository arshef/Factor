package com.sa.factor.api;

import com.sa.factor.LoginResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PostDataService {
    @POST("Login/Login")
    Call<LoginResponse> Login(@Query("phone") String phone);
}
