package com.example.madcat.paginglibraryexample_1.utils;

import android.support.v7.util.DiffUtil;

import com.example.madcat.paginglibraryexample_1.data.Car;

public class CarDiffUtilCallback extends DiffUtil.ItemCallback<Car> {

    @Override
    public boolean areItemsTheSame(Car oldItem, Car newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(Car oldItem, Car newItem) {
        return oldItem.equals(newItem);
    }
}
