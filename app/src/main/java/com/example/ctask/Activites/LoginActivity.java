package com.example.ctask.Activites;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ctask.Constants.Constants;
import com.example.ctask.Interfaces.APIInterface;
import com.example.ctask.MainActivity;
import com.example.ctask.Models.Result;
import com.example.ctask.Models.UserData;
import com.example.ctask.R;
import com.example.ctask.Responses.GetLoginData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.edEmail)
    EditText edEmail;
    @BindView(R.id.edPassword)
    EditText edPassword;
    @BindView(R.id.loginbtn)
    Button loginbtn;

    String email, password;
    SharedPreferences sp;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        sp = getSharedPreferences(Constants.PREF, MODE_PRIVATE);
        progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setMessage("Please wait..");
        progressDialog.setCancelable(false);
    }


    @OnClick({R.id.edPassword, R.id.loginbtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.edPassword:
                break;
            case R.id.loginbtn:
                getStringFromEditText();
                break;
        }
    }

    private void getStringFromEditText() {
        email = edEmail.getText().toString().trim();
        password = edPassword.getText().toString().trim();
        if (email.isEmpty()) {
            edEmail.setError("Email is required");
        } else if (password.isEmpty()) {
            edPassword.setError("Password is required");
        } else {
            UserData userData = new UserData(email, password);
            sendRequest(userData);
            progressDialog.show();
        }
    }

    private void sendRequest(UserData userData) {
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        APIInterface client = retrofit.create(APIInterface.class);
        Call<UserData> call = client.sendUserDetails(userData);
        call.enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {
                String userName = response.body().getResult().getUsername();
                int userId = response.body().getResult().getUserId();
                String mobileNo = response.body().getResult().getMobileNo();
                String location = response.body().getResult().getLocation();
                Double latitude = response.body().getResult().getLatitude();
                String userImage = response.body().getResult().getUserImage();
                String biography = response.body().getResult().getBiography();
                Integer isFavourite = response.body().getResult().getIsFavourite();
                Integer avgRating = response.body().getResult().getAvgRating();
                String currency = response.body().getResult().getCurrency();
                Integer followers = response.body().getResult().getFollowers();
                Integer followings = response.body().getResult().getFollowings();
                String hashToken = response.body().getResult().getHashToken();
                Constants.setAllDataIntoLocalDatabase(LoginActivity.this, userName, userId, mobileNo, location, latitude, userImage, biography, isFavourite, avgRating, currency, followers, followings, hashToken);
                progressDialog.dismiss();
                Constants.explicitIntent(LoginActivity.this, MainActivity.class);
                finish();
            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                //Log.d("Error", t.toString());
                progressDialog.dismiss();
                Toast.makeText(LoginActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setAllDataIntoLocalDatabase(String userName, int userId, String mobileNo, String location, Double latitude, String userImage, String biography, Integer isFavourite, Integer avgRating, String currency, Integer followers, Integer followings, String hashToken) {
    }
}