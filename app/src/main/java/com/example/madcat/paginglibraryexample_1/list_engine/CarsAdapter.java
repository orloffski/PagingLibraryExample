package com.example.madcat.paginglibraryexample_1.list_engine;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.madcat.paginglibraryexample_1.R;
import com.example.madcat.paginglibraryexample_1.data.Car;

import static com.example.madcat.paginglibraryexample_1.CarApplication.getContext;

public class CarsAdapter extends PagedListAdapter<Car, CarViewHolder> {
    public CarsAdapter(@NonNull DiffUtil.ItemCallback<Car> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.car_view, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = getItem(position);
        if(car != null)
            holder.bindTo(car);
        else
            holder.clear();
    }
}
