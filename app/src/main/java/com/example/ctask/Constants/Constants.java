package com.example.ctask.Constants;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ctask.R;


public class Constants {

    public static String BASE_URL = "http://admin.yee-jee.com/public/api/";

    public static SharedPreferences sp;
    ///User Details Shared Preferences
    public static String PREF = "pref";
    public static String userId = "userId";
    public static String userName = "userName";
    public static String mobileNo = "mobileNO";
    public static String location = "location";
    public static String latitude = "latitude";
    public static String longitude = "longitude";
    public static String userImage = "userImage";
    public static String biography = "biography";
    public static String isFavourite = "is_favourite";
    public static String avgRating = "avgRating";
    public static String currency = "currency";
    public static String followers = "followers";
    public static String following = "following";
    public static String hashToken = "hashToken";

    ///LoadFragment
    public static void loadFragment(Context context, Fragment fragment, String fragmentName) {
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentView, fragment).addToBackStack(fragmentName);
        fragmentTransaction.commit();
    }

    ///Remove Fragment
    public static void removeFragment(Context context, Fragment fragment) {
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
        fragmentManager.popBackStackImmediate();
    }


    public static void explicitIntent(Context context, Class<?> intentClass) {
        Intent intent = new Intent(context, intentClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void setAllDataIntoLocalDatabase(Context context, String userName, int userId, String mobileNo, String location, Double latitude, String userImage, String biography, Integer isFavourite, Integer avgRating, String currency, Integer followers, Integer followings, String hashToken) {
        sp = context.getSharedPreferences(Constants.PREF, Context.MODE_PRIVATE);
        sp.edit().putString(Constants.userName, userName).commit();
        sp.edit().putString(Constants.userId, String.valueOf(userId)).commit();
        sp.edit().putString(Constants.mobileNo, mobileNo).commit();
        sp.edit().putString(Constants.location, location).commit();
        sp.edit().putString(Constants.latitude, String.valueOf(latitude)).commit();
        sp.edit().putString(Constants.userImage, userImage).commit();
        sp.edit().putString(Constants.biography, biography).commit();
        sp.edit().putString(Constants.isFavourite, String.valueOf(isFavourite)).commit();
        sp.edit().putString(Constants.avgRating, String.valueOf(avgRating)).commit();
        sp.edit().putString(Constants.currency, currency).commit();
        sp.edit().putString(Constants.followers, String.valueOf(followers)).commit();
        sp.edit().putString(Constants.following, String.valueOf(followings)).commit();
        sp.edit().putString(Constants.hashToken, hashToken).commit();
    }
}