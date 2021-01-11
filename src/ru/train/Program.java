package ru.train;

// TODO: Создайте класс Train, содержащий поля:
//  название пункта назначения, номер поезда, время отправления.
//  Создайте лист из пяти элементов типа Train,
//  добавьте возможность сортировки элементов массива по номерам поездов.
//  Добавить выбор - как будем сортировать и сортировку по выбранному признаку.
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем,
//  добавьте возможность сортировки листа по пункту назначения,
//  причем поезда с одинаковым пунктом назначения должны быть упорядочены по времени отправления.



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Program {
    static ArrayList<Train> list = new ArrayList<Train>();

    public static void main (String[] args){
        Train a = addTrain("New York", 564738, 1145);
        Train b = addTrain("Washington", 534537, 1245);
        Train c = addTrain("New York", 345624, 1014);
        Train d = addTrain("Chicago", 425375, 1534);
        Train e = addTrain("Orlando", 882736, 1900);

        System.out.println(list);
        sort();

        printInfAboutTrain();

    }

    private static Train addTrain(String destinationName, int trainNumber, int departureTime){
        Train a=new Train(destinationName, trainNumber, departureTime);
        list.add(a);
        return a;
    }

    private static void printInfAboutTrain (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a train number");
        int n = scan.nextInt();
        Iterator<Train> iterator = list.iterator();
        while (iterator.hasNext()){
            Train a = iterator.next();
            if (a.getNumber() == n){
                System.out.println(a);
                break;
            }
            if (!iterator.hasNext()){
                System.out.println("Number of train isn't valid. Try again");
                printInfAboutTrain();
            }
        }
    }

    private static void sort (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to sort by name of the destination, 2 to sort by train number, 3 to sort by departure time");
        int choose = scan.nextInt();
        if (choose==1){
            ComparatorDestinationName comparatorDestination = new ComparatorDestinationName();
            list.sort(comparatorDestination);
            System.out.println(list);
        } else if (choose==2){
            ComparatorTrain comparatorTrain = new ComparatorTrain();
            list.sort(comparatorTrain);
            System.out.println(list);
        } else if (choose==3){
            ComparatorDepartureTime comparatorDepartureTime = new ComparatorDepartureTime();
            list.sort(comparatorDepartureTime);
            System.out.println(list);
        }else {
            System.out.println("uncorrent choose");
        }

    }


}
