package com.example.ctask.Models;

public class Result {
    private int userId;
    private String username;
    private String mobileNo;
    private String location;
    private Double latitude;
    private String userImage;
    private String biography;
    private Integer isFavourite;
    private Integer avgRating;
    private String currency;
    private Integer followers;
    private Integer followings;
    private String hashToken;

    public Result(int userId, String username, String mobileNo, String location, Double latitude, String userImage, String biography, Integer isFavourite, Integer avgRating, String currency, Integer followers, Integer followings, String hashToken) {
        this.userId = userId;
        this.username = username;
        this.mobileNo = mobileNo;
        this.location = location;
        this.latitude = latitude;
        this.userImage = userImage;
        this.biography = biography;
        this.isFavourite = isFavourite;
        this.avgRating = avgRating;
        this.currency = currency;
        this.followers = followers;
        this.followings = followings;
        this.hashToken = hashToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
