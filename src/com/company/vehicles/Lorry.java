package com.company.vehicles;

public class Lorry extends Car{
    int carrying;

    @Override
    public String toString() {
        String inf;
        if (carClass==null){
            inf = marka +", вес "+ weight +", грузоподъемность "+ carrying;
        }
        else {
            inf = marka + ", " + carClass + ", вес " + weight;
        }
        return inf;    }


}
