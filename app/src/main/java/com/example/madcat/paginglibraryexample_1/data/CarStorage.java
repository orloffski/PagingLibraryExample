package com.example.madcat.paginglibraryexample_1.data;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {

    private List<Car> cars;

    public CarStorage() {
        this.cars = new ArrayList<>();
        init();
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
        this.cars.add(new Car(12, "Audi", "100 Avant"));
        this.cars.add(new Car(13, "BMW", "100 X1"));
        this.cars.add(new Car(14, "BMW", "100 X2"));
        this.cars.add(new Car(15, "BMW", "100 X3"));
        this.cars.add(new Car(16, "BMW", "100 X4"));
        this.cars.add(new Car(17, "BMW", "100 X5"));
        this.cars.add(new Car(18, "BMW", "100 X6"));
        this.cars.add(new Car(19, "BMW", "M4"));
        this.cars.add(new Car(20, "BMW", "M4 Cabrio"));
        this.cars.add(new Car(21, "BMW", "M4 Competition"));
        this.cars.add(new Car(22, "BMW", "M5 Competition"));
        this.cars.add(new Car(23, "BMW", "X5 M"));
        this.cars.add(new Car(24, "BMW", "X6 M"));
        this.cars.add(new Car(25, "BMW", "i3"));
        this.cars.add(new Car(26, "BMW", "i8 Coupe"));
        this.cars.add(new Car(27, "BMW", "i8 Roadster"));
        this.cars.add(new Car(28, "Volvo", "C30"));
        this.cars.add(new Car(29, "Volvo", "V40"));
        this.cars.add(new Car(30, "Volvo", "C70"));
        this.cars.add(new Car(31, "Volvo", "V40 CROSS COUNTRY"));
        this.cars.add(new Car(32, "Volvo", "V90 CROSS COUNTRY"));
        this.cars.add(new Car(33, "Volvo", "XC40"));
        this.cars.add(new Car(34, "Volvo", "XC60"));
        this.cars.add(new Car(35, "Volvo", "XC70"));
        this.cars.add(new Car(36, "Volvo", "XC90"));
        this.cars.add(new Car(37, "Volvo", "V50"));
        this.cars.add(new Car(38, "Volvo", "V60"));
        this.cars.add(new Car(39, "Volvo", "V70"));
        this.cars.add(new Car(40, "Volvo", "S40"));
        this.cars.add(new Car(41, "Volvo", "S60"));
        this.cars.add(new Car(42, "Volvo", "S80"));
        this.cars.add(new Car(43, "Volvo", "S90"));
        this.cars.add(new Car(44, "Volvo", "V60 CROSS COUNTRY"));
        this.cars.add(new Car(45, "VW", "AMAROK"));
        this.cars.add(new Car(46, "VW", "ARTEON"));
        this.cars.add(new Car(47, "VW", "ATLAS"));
        this.cars.add(new Car(48, "VW", "BEETLE"));
        this.cars.add(new Car(49, "VW", "BORA"));
        this.cars.add(new Car(50, "VW", "CADDY"));
        this.cars.add(new Car(51, "VW", "CROSS GOLF"));
        this.cars.add(new Car(52, "VW", "CROSS POLO"));
        this.cars.add(new Car(53, "VW", "GOLF"));
        this.cars.add(new Car(54, "VW", "GOLF ALLTRACK"));
        this.cars.add(new Car(55, "VW", "GOLF GTI"));
        this.cars.add(new Car(56, "VW", "GOLF PLUS"));
        this.cars.add(new Car(57, "VW", "GOLF R"));
        this.cars.add(new Car(58, "VW", "GOLF SPORTSVAN"));
        this.cars.add(new Car(59, "VW", "JETTA"));
        this.cars.add(new Car(60, "VW", "LAVIDA"));
        this.cars.add(new Car(61, "VW", "PASSAT"));
        this.cars.add(new Car(62, "VW", "PASSAT ALLTRACK"));
        this.cars.add(new Car(63, "VW", "PASSAT CC"));
        this.cars.add(new Car(64, "VW", "PASSAT GTE"));
        this.cars.add(new Car(65, "VW", "PHAETON"));
        this.cars.add(new Car(66, "VW", "POLO"));
        this.cars.add(new Car(67, "VW", "POLO SEDAN"));
        this.cars.add(new Car(68, "VW", "SCIROKKO"));
        this.cars.add(new Car(69, "VW", "TIGUAN"));
        this.cars.add(new Car(70, "VW", "TOUAREG"));
        this.cars.add(new Car(71, "VW", "TOURAN"));
        this.cars.add(new Car(72, "VW", "TRANSPORTER"));
        this.cars.add(new Car(73, "CHEVROLET", "ALERO"));
        this.cars.add(new Car(74, "CHEVROLET", "AVEO"));
        this.cars.add(new Car(75, "CHEVROLET", "CAMARO"));
        this.cars.add(new Car(76, "CHEVROLET", "CAPTIVA"));
        this.cars.add(new Car(77, "CHEVROLET", "COBALT"));
        this.cars.add(new Car(78, "CHEVROLET", "CORVETTE"));
        this.cars.add(new Car(79, "CHEVROLET", "CRUZE"));
        this.cars.add(new Car(80, "CHEVROLET", "EPICA"));
        this.cars.add(new Car(81, "CHEVROLET", "IMPALA"));
        this.cars.add(new Car(82, "CHEVROLET", "LACETTI"));
        this.cars.add(new Car(83, "CHEVROLET", "LANOS"));
        this.cars.add(new Car(84, "CHEVROLET", "MALIBU"));
        this.cars.add(new Car(85, "CHEVROLET", "NIVA"));
        this.cars.add(new Car(86, "CHEVROLET", "ORLANDO"));
        this.cars.add(new Car(87, "CHEVROLET", "REZZO"));
        this.cars.add(new Car(88, "CHEVROLET", "SILVERADO"));
        this.cars.add(new Car(89, "CHEVROLET", "SPARK"));
        this.cars.add(new Car(90, "CHEVROLET", "SPIN"));
        this.cars.add(new Car(91, "CHEVROLET", "SS"));
        this.cars.add(new Car(92, "CHEVROLET", "TAHOE"));
        this.cars.add(new Car(93, "CHEVROLET", "TRACKER"));
        this.cars.add(new Car(94, "CHEVROLET", "TRAILBLAZER"));
        this.cars.add(new Car(95, "CHEVROLET", "TRAVERSE"));
        this.cars.add(new Car(96, "CHEVROLET", "VOLT"));
        this.cars.add(new Car(97, "TOYOTA", "AURIS"));
        this.cars.add(new Car(98, "TOYOTA", "CELICA"));
        this.cars.add(new Car(99, "TOYOTA", "COROLLA"));
        this.cars.add(new Car(99, "TOYOTA", "RAV4"));
    }

    public List<Car> getData(int startPosition, int positionCountToLoad){
        if(startPosition + positionCountToLoad > this.cars.size() -1)
            return this.cars.subList(this.cars.size() - positionCountToLoad - 1, this.cars.size() - 1);

        return this.cars.subList(startPosition, startPosition + positionCountToLoad);
    }

    public int getCount(){
        return this.cars.size();
    }

    public List<Car> getCars(){
        return this.cars;
    }
}
