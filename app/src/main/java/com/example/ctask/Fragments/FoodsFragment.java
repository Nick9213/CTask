package com.example.ctask.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ctask.Adapters.FoodsAdapter;
import com.example.ctask.Models.FoodModel;
import com.example.ctask.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FoodsFragment extends Fragment {

    @BindView(R.id.foodRecyclerView)
    RecyclerView foodRecyclerView;

    List<FoodModel> foodModelList;
    FoodsAdapter foodsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foods, container, false);
        ButterKnife.bind(this,view);
        initFoodArrayList();
        setRecyclerView();

        return view;
    }

    private void initFoodArrayList() {
        foodModelList = new ArrayList<>();
        foodModelList.add(new FoodModel("1","Pizza","150","4.5","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVAaQlFTqN3VzMoK1xN9zKiVCDsL2vCSvSA&usqp=CAU","Margherita")) ;
        foodModelList.add(new FoodModel("2","Pizza","150","4.0","https://cdn.tasteatlas.com/images/dishes/b7c0895adcf248ff806a9064995c1cac.jpg?w=905&h=510","Pizza Cake")) ;
        foodModelList.add(new FoodModel("3","Pizza","150","4.3","https://cdn.tasteatlas.com/images/dishes/5605e40fab254c87957b6765f721248f.jpg?w=905&h=510","Pizza alla pala")) ;
        foodModelList.add(new FoodModel("4","Pizza","150","2.9","https://cdn.tasteatlas.com/images/dishes/bb78b6dc04d242a6b295c76a9faa5c2c.jpg?w=905&h=510","Stuffed Pizza")) ;
        foodModelList.add(new FoodModel("5","Pizza","150","4.3","https://cdn.tasteatlas.com/Images/Dishes/cf14be650bf74d3483e98fa4dbaa7c0d.jpg?w=905&h=510","Pizza al padellino")) ;
        foodModelList.add(new FoodModel("6","Pizza","150","3.2","https://cdn.tasteatlas.com/Images/Dishes/ce948490b0db4c43a206d70b52e58e3d.jpg?w=905&h=510","Grilled Pizza")) ;
    }

    private void setRecyclerView() {
        foodRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        foodsAdapter = new FoodsAdapter(foodModelList, getActivity());
        foodRecyclerView.setAdapter(foodsAdapter);

    }
}