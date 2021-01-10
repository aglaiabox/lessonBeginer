package ru.train;

// TODO: Создайте класс Train, содержащий поля:
//  название пункта назначения, номер поезда, время отправления.
//  Создайте лист из пяти элементов типа Train,
//  добавьте возможность сортировки элементов массива по номерам поездов.
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем,
//  добавьте возможность сортировки листа по пункту назначения,
//  причем поезда с одинаковым пунктом назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;

public class Programm {
    static ArrayList<Train> list = new ArrayList<Train>();

    public static void main (String[] args){
        Train a = addTrain("New York", 564738, 1145);
        Train b = addTrain("Washington", 534537, 1245);
        Train c = addTrain("New Jersey", 345624, 1014);
        Train d = addTrain("Chicago", 425375, 1534);
        Train e = addTrain("Orlando", 882736, 1900);

        System.out.println(list);
    }

    private static Train addTrain(String destinationName, int trainNumber, int departureTime){
        Train a=new Train(destinationName, trainNumber, departureTime);
        list.add(a);
        return a;
    }

    private static void sortListByTrainNumbers(ArrayList list){
        ArrayList<Train> listForCopy = new ArrayList<Train>();
        Train a =

    }
}
