package com.example.madcat.paginglibraryexample_1.data;

import android.arch.paging.DataSource;

public class CarFactory extends DataSource.Factory<Integer, Car> {

    private final CarStorage carStorage;

    public CarFactory(CarStorage carStorage) {
        this.carStorage = carStorage;
    }

    @Override
    public DataSource create() {
        return new SimplePositionalDataSource(carStorage);
    }
}
