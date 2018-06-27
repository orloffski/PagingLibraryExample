package com.example.madcat.paginglibraryexample_1;

import android.arch.paging.PositionalDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

public class SimplePositionalDataSource extends PositionalDataSource<Car> {

    private static final String TAG = "log";
    private final CarStorage carStorage;

    public SimplePositionalDataSource(CarStorage carStorage) {
        this.carStorage = carStorage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Car> callback) {
        Log.d(TAG, "loadInitial, requestedStartPosition = " + params.requestedStartPosition +
                ", requestedLoadSize = " + params.requestedLoadSize);
        List<Car> result = carStorage.getData(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(result, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Car> callback) {
        Log.d(TAG, "loadRange, startPosition = " + params.startPosition + ", loadSize = " + params.loadSize);
        List<Car> result = carStorage.getData(params.startPosition, params.loadSize);
        callback.onResult(result);
    }
}
