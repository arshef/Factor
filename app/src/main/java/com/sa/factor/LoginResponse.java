package com.sa.factor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("token")
    @Expose
    public String token;
}
