package com.example.madcat.paginglibraryexample_1;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.madcat.paginglibraryexample_1.data.Car;
import com.example.madcat.paginglibraryexample_1.data.CarFactory;
import com.example.madcat.paginglibraryexample_1.data.CarStorage;
import com.example.madcat.paginglibraryexample_1.list_engine.CarsAdapter;
import com.example.madcat.paginglibraryexample_1.utils.CarDiffUtilCallback;

import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.cars_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CarStorage carStorage = new CarStorage();

        CarFactory carFactory = new CarFactory(carStorage);

        PagedList.Config config = new PagedList.Config.Builder()
                .setEnablePlaceholders(true)
                .setPageSize(5)
                .build();

        LiveData<PagedList<Car>> pagedListLiveData = new LivePagedListBuilder<>(carFactory, config)
                .setFetchExecutor(Executors.newSingleThreadExecutor())
                .setInitialLoadKey(40)
                .build();

        final CarsAdapter carsAdapter = new CarsAdapter(new CarDiffUtilCallback());

        pagedListLiveData.observe(this, new Observer<PagedList<Car>>() {
            @Override
            public void onChanged(@Nullable PagedList<Car> cars) {
                carsAdapter.submitList(cars);
            }
        });

        recyclerView.setAdapter(carsAdapter);
    }
}
