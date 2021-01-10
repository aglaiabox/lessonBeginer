package com.company.details;

public class Engine {
    int power = 0;
    String company = "не определена";


    @Override
    public String toString() {
        String a = "ошибка вывода";
        if (power == 0){
            a = "мотор: мощность не определена, марка "+ company;
        }
        else {
            a = "мотор: мощность " + power +"марка " + company;
        }
        return a;
    }

    }
