package com.example.ctask.Models;

public class FoodModel {
    private String foodId;
    private String foodCategory;
    private String foodPrice;
    private String foodRatings;
    private String foodImage;
    private String foodName;

    public FoodModel() {
    }

    public FoodModel(String foodId, String foodCategory, String foodPrice, String foodRatings, String foodImage, String foodName) {
        this.foodId = foodId;
        this.foodCategory = foodCategory;
        this.foodPrice = foodPrice;
        this.foodRatings = foodRatings;
        this.foodImage = foodImage;
        this.foodName = foodName;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodRatings() {
        return foodRatings;
    }

    public void setFoodRatings(String foodRatings) {
        this.foodRatings = foodRatings;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
