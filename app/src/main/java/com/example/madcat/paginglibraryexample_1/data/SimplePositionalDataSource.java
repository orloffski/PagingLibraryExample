package com.example.madcat.paginglibraryexample_1.data;

import android.arch.paging.PositionalDataSource;
import android.support.annotation.NonNull;

import java.util.List;

public class SimplePositionalDataSource extends PositionalDataSource<Car> {

    private final CarStorage carStorage;

    public SimplePositionalDataSource(CarStorage carStorage) {
        this.carStorage = carStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Car> callback) {
        List<Car> result = carStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Car> callback) {
        List<Car> result = carStorage.getData(params.startPosition, params.loadSize);
        callback.onResult(result);
    }
}
