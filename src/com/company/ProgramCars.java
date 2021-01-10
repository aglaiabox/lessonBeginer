package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

import java.util.List;

public class ProgramCars {
    public static void main(String[] args) {

        Person volodya = new Driver();
        volodya.setAge(65);
        Engine motor1 = new Engine();
        Car lada = new SportCar();
        lada.setAge(25);
        lada.printFullInfo();
        System.out.println();

        // todo делаю интерфейс ageble и имплемитирую этот интерфейс для персона и кара
        // todo делаю метод, который принимает объект типа эйджибл и получает у него эйдж и печатает его
        // в программе вызываю этот метод 2 раза: один раз для кара, другой для персоны

//        getAge1(volodya);
//        getAge1(lada);
//        getAge1(motor1);

        getAge2(volodya);
        getAge2(motor1);




    }

//    public static void getAge1(Ageble ageble){
//        int age = ageble.getAge();
//        System.out.println(age);
//    }
//
//    public static void getAge1(Object obj){
//        System.out.println( "я не могу вернуть возраст этого объекта");
//    }


    // todo etage принимал объект обжект, проверял является ли он agevl и если да, то выводил age
    // почитать про интерфейсы, книгу про классы и наследование и интерфейсы

    public static void getAge2 (Object obj){
        if (obj instanceof Ageble){
            Ageble a = (Ageble) obj;
            int age = ((Ageble) obj).getAge();
            System.out.println(age);
        }
        else {
            System.out.println("у этого объекта возраст не предусмотрен");
        }
    }


    public static void sortAgeable(List<Ageble> list){
        list.sort(new AgeableComparator());
    }
}
