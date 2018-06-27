package com.example.madcat.paginglibraryexample_1;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CarsAdapter extends PagedListAdapter<Car, CarViewHolder> {
    protected CarsAdapter(@NonNull DiffUtil.ItemCallback<Car> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_view, parent, false);
        CarViewHolder holder = new CarViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(getItem(position));
    }
}
