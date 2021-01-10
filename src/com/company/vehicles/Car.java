package com.company.vehicles;

import com.company.Ageble;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Car implements Ageble {
    private int age;

    String carClass;
    String marka;
    int weight;
    Driver driver;
    Engine engine;

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void start(){
        System.out.println("Поехали");
    };
    public void stop(){
        System.out.println("Останавливаемся");
    };
    public void turnRight(){
        System.out.println("Поворот направо");
    };
    public void turnLeft (){
        System.out.println("Поворот налево");
    };



    public void printFullInfo(){
        System.out.print("Полная информация: "+this.toString() + " т.; " + engine + "; " + driver + ".");
    }


    @Override
    public String toString() {
        String inf;
        if (carClass==null){
            inf = marka +", вес "+ weight;
        }
        else {
            inf = marka + ", " + carClass + ", вес " + weight;
        }
                return inf;

    }
}
