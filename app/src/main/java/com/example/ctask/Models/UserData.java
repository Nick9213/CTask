package com.example.ctask.Models;

import com.example.ctask.Responses.Result;
import com.google.gson.annotations.SerializedName;

public class UserData {
    private String email;
    private String password;

    @SerializedName("Result")
    private com.example.ctask.Responses.Result result;

    public UserData(String email, String password, com.example.ctask.Responses.Result result) {
        this.email = email;
        this.password = password;
        this.result = result;
    }

    public UserData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
