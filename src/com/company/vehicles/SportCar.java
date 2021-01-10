package com.company.vehicles;

public class SportCar extends Car{
    int speed;

    @Override
    public String toString() {
        String inf;
        if (carClass==null){
            inf = marka +", вес "+ weight +", грузоподъемность "+ speed;
        }
        else {
            inf = marka + ", " + carClass + ", вес " + weight;
        }
        return inf;    }
}
