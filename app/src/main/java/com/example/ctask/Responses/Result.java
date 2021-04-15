package com.example.ctask.Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("UserId")
    @Expose
    public Integer userId;
    @SerializedName("Username")
    @Expose
    public String username;
    @SerializedName("MobileNo")
    @Expose
    public String mobileNo;
    @SerializedName("Location")
    @Expose
    public String location;
    @SerializedName("Latitude")
    @Expose
    public Double latitude;
    @SerializedName("Longitude")
    @Expose
    public Double longitude;
    @SerializedName("UserImage")
    @Expose
    public String userImage;
    @SerializedName("Biography")
    @Expose
    public String biography;
    @SerializedName("is_favourite")
    @Expose
    public Integer isFavourite;
    @SerializedName("avg_rating")
    @Expose
    public Integer avgRating;
    @SerializedName("Currency")
    @Expose
    public String currency;
    @SerializedName("Followers")
    @Expose
    public Integer followers;
    @SerializedName("Followings")
    @Expose
    public Integer followings;
    @SerializedName("HashToken")
    @Expose
    public String hashToken;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Integer getIsFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(Integer isFavourite) {
        this.isFavourite = isFavourite;
    }

    public Integer getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Integer avgRating) {
        this.avgRating = avgRating;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowings() {
        return followings;
    }

    public void setFollowings(Integer followings) {
        this.followings = followings;
    }

    public String getHashToken() {
        return hashToken;
    }

    public void setHashToken(String hashToken) {
        this.hashToken = hashToken;
    }
}
