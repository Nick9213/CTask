package com.example.ctask.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.xml.transform.Result;

public class GetLoginData {
    @SerializedName("Status")
    @Expose
    public Boolean status;
    @SerializedName("Message")
    @Expose
    public String message;
    @SerializedName("Result")
    @Expose
    public Result result;
    @SerializedName("Error")
    @Expose
    public List<Object> error = null;

}
