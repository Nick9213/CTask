package com.example.ctask.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.ctask.Constants.Constants;
import com.example.ctask.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.ctask.Constants.Constants.sp;

public class AboutFragment extends Fragment {


    @BindView(R.id.txtUserChefData)
    TextView txtUserChefData;

    SharedPreferences sharedPreferences;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        ButterKnife.bind(this,view);
        sharedPreferences=getActivity().getSharedPreferences(Constants.PREF, Context.MODE_PRIVATE);
        txtUserChefData.setText(sharedPreferences.getString(Constants.biography,""));
        return view;
    }
}