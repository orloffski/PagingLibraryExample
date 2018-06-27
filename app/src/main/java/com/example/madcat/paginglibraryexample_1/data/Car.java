package com.example.madcat.paginglibraryexample_1;

import java.util.Objects;

public class Car {
    private int id;
    private String mark;
    private String model;

    public Car(int id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                mark == car.mark &&
                model == car.model;
    }
}
