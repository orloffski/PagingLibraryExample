package com.example.madcat.paginglibraryexample_1;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {

    private List<Car> cars;

    public CarStorage() {
        this.cars = new ArrayList<>();
    }

    private void init(){
        this.cars.add(new Car(1, "Audi", "100"));
        this.cars.add(new Car(2, "Audi", "80"));
        this.cars.add(new Car(3, "Audi", "A4"));
        this.cars.add(new Car(4, "Audi", "A6"));
        this.cars.add(new Car(5, "Audi", "RS6"));
        this.cars.add(new Car(6, "Audi", "A8"));
        this.cars.add(new Car(7, "Audi", "Steppenwolf"));
        this.cars.add(new Car(8, "Audi", "R8"));
        this.cars.add(new Car(9, "Audi", "TT"));
        this.cars.add(new Car(10, "Audi", "R8 LMP Edition"));
    }

    public List<Car> getData(int startPosition, int positionCountToLoad){
        List<Car> cars = new ArrayList<>();

        return cars;
    }
}
