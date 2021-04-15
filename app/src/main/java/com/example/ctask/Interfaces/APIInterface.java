package com.example.ctask.Interfaces;

import com.example.ctask.Models.UserData;
import com.example.ctask.Responses.GetLoginData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("login")
    Call<UserData> sendUserDetails(@Body UserData userData);
}
