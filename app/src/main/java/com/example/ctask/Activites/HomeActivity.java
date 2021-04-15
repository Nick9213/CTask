package com.example.ctask.Activites;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import com.example.ctask.Adapters.ViewPagerAdapter;
import com.example.ctask.Fragments.AboutFragment;
import com.example.ctask.Fragments.FoodsFragment;
import com.example.ctask.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

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
    TextView userName;
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

    ViewPagerAdapter viewPagerAdapter;
    AboutFragment aboutFragment;
    FoodsFragment foodsFragment;
    @BindView(R.id.cheViewPager)
    ViewPager chefViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initFragments();
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        setUpViewPager(chefViewPager);
        chefTabLayout.setupWithViewPager(chefViewPager);
    }

    @OnClick({R.id.ivBackButton, R.id.ivBookmarksButton, R.id.btnFollow, R.id.btnSendFood, R.id.buttonLayout, R.id.userProfileDetails})
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
            case R.id.userProfileDetails:
                break;
        }
    }

    private void initFragments() {
        aboutFragment = new AboutFragment();
        foodsFragment = new FoodsFragment();
    }

    private void setUpViewPager(ViewPager viewPager) {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragmnet(aboutFragment, "About");
        viewPagerAdapter.addFragmnet(foodsFragment, "Foods");
        viewPager.setAdapter(viewPagerAdapter);
    }
}