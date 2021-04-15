package com.example.ctask;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.ctask.Constants.Constants;
import com.example.ctask.Fragments.AboutFragment;
import com.example.ctask.Fragments.AddFoodFragment;
import com.example.ctask.Fragments.ChefFragment;
import com.example.ctask.Fragments.FoodsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fragmentView)
    FrameLayout fragmentView;
    @BindView(R.id.bottom_navigation_nav)
    BottomNavigationView bottomNavigationNav;

    ChefFragment chefFragment;
    AboutFragment aboutFragment;
    FoodsFragment foodsFragment;
    AddFoodFragment addFoodFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initFragments();
        Constants.loadFragment(MainActivity.this, addFoodFragment, "addFoodFragment");
        bottomNavigationNav.setOnNavigationItemSelectedListener(navListner);
    }

    private void initFragments() {
        chefFragment = new ChefFragment();
        aboutFragment = new AboutFragment();
        foodsFragment = new FoodsFragment();
        addFoodFragment = new AddFoodFragment();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.bottom_nav_AddFood:
                    Constants.loadFragment(MainActivity.this, addFoodFragment, "addFoodFragment");

//                    Toast.makeText(MainActivity.this, "Add Food", Toast.LENGTH_SHORT).show();

                    return true;

                case R.id.bottom_nav_Home:
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.bottom_nav_Chef:
                    Constants.loadFragment(MainActivity.this, chefFragment, "chefFragment");
                    //    Toast.makeText(MainActivity.this, "Chef", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.bottom_nav_Charity:
                    Toast.makeText(MainActivity.this, "Charity", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.bottom_nav_Cart:
                    Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();
                    return true;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentView, selectedFragment).commit();
            return false;
        }
    };
}