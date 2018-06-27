package com.example.madcat.paginglibraryexample_1.data;

import java.util.List;

public class CarData {
    private int position;
    private List<Car> data;
    private int count;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
