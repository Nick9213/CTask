package com.example.ctask.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.ctask.Adapters.ViewPagerAdapter;
import com.example.ctask.Constants.Constants;
import com.example.ctask.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChefFragment extends Fragment {

    AboutFragment aboutFragment;
    FoodsFragment foodsFragment;


    ViewPagerAdapter viewPagerAdapter;
    @BindView(R.id.ivBackButton)
    ImageView ivBackButton;
    @BindView(R.id.ivBookmarksButton)
    ImageView ivBookmarksButton;
    @BindView(R.id.relativeLayoutImage)
    RelativeLayout relativeLayoutImage;
    @BindView(R.id.userProfileImage)
    ImageView userProfileImage;
    @BindView(R.id.cardUserProfile)
    CardView cardUserProfile;
    @BindView(R.id.userName)
    TextView tvuserName;
    @BindView(R.id.userChefRatings)
    TextView userChefRatings;
    @BindView(R.id.userChefRatingsStart)
    RatingBar userChefRatingsStart;
    @BindView(R.id.chefNameLayout)
    LinearLayout chefNameLayout;
    @BindView(R.id.userChefFollowingNumber)
    TextView userChefFollowingNumber;
    @BindView(R.id.userChefFollowingText)
    TextView userChefFollowingText;
    @BindView(R.id.userChefFollowersNumber)
    TextView userChefFollowersNumber;
    @BindView(R.id.userChefFollowersText)
    TextView userChefFollowersText;
    @BindView(R.id.followingLayers)
    LinearLayout followingLayers;
    @BindView(R.id.chefDetailLayout)
    RelativeLayout chefDetailLayout;
    @BindView(R.id.btnFollow)
    Button btnFollow;
    @BindView(R.id.btnSendFood)
    Button btnSendFood;
    @BindView(R.id.buttonLayout)
    LinearLayout buttonLayout;
    @BindView(R.id.userProfileDetails)
    RelativeLayout userProfileDetails;
    @BindView(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;
    @BindView(R.id.chefTabLayout)
    TabLayout chefTabLayout;
    @BindView(R.id.cheViewPager)
    ViewPager chefViewPager;
    SharedPreferences sp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chef, container, false);
        ButterKnife.bind(this, view);
        sp = getActivity().getSharedPreferences(Constants.PREF, Context.MODE_PRIVATE);
        setAllData();
        initFragments();
        viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        setUpViewPager(chefViewPager);
        chefTabLayout.setupWithViewPager(chefViewPager);
        return view;
    }

    private void setAllData() {
        tvuserName.setText(sp.getString(Constants.userName, ""));
        userChefRatings.setText(sp.getString(Constants.avgRating, ""));
        userChefFollowersNumber.setText(sp.getString(Constants.followers, ""));
        userChefFollowingNumber.setText(sp.getString(Constants.following, ""));
        Picasso.get().load(sp.getString(Constants.userImage, "")).into(userProfileImage);

        setFavourite();
        setAvgRatingStar();
    }

    private void setFavourite() {
        if (sp.getString(Constants.isFavourite, "") == "true") {
            Picasso.get().load(R.drawable.ic_favorite_dark_24).into(ivBookmarksButton);
        } else {
            Picasso.get().load(R.drawable.ic_favorite_border_24).into(ivBookmarksButton);
        }
    }

    private void setAvgRatingStar() {
        userChefRatingsStart.setRating(Integer.parseInt(sp.getString(Constants.avgRating, "")));
    }


    private void initFragments() {
        aboutFragment = new AboutFragment();
        foodsFragment = new FoodsFragment();
    }


    private void setUpViewPager(ViewPager viewPager) {
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.addFragmnet(aboutFragment, "About");
        viewPagerAdapter.addFragmnet(foodsFragment, "Foods");
        viewPager.setAdapter(viewPagerAdapter);
    }

    @OnClick({R.id.ivBackButton, R.id.ivBookmarksButton, R.id.btnFollow, R.id.btnSendFood, R.id.buttonLayout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivBackButton:
                break;
            case R.id.ivBookmarksButton:
                break;
            case R.id.btnFollow:
                break;
            case R.id.btnSendFood:
                break;
            case R.id.buttonLayout:
                break;
        }
    }
}