package ru.train;

// TODO: Создайте класс Train, содержащий поля:                                     DONE
//  название пункта назначения, номер поезда, время отправления.                    DONE
//  Создайте лист из пяти элементов типа Train,                                     DONE
//  добавьте возможность сортировки элементов массива по номерам поездов.           DONE
//  Добавить выбор - как будем сортировать и сортировку по выбранному признаку.     DONE
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем,   DONE
//  добавьте возможность сортировки листа по пункту назначения,                             DONE
//  причем поезда с одинаковым пунктом назначения должны быть упорядочены по времени отправления. DONE

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TODO II
//todo change train time of departure                           DONE
//todo add time in trip                                         DONE
//todo read user input for date and print datetimeof arrival

//TODO III
// todo в программе с трейнами сделать мапу, которая хранит трейны по номеру поезда.    DONE
//  И еще функцию, которой я передаю номер поезда и печатаю по номеру поезда            DONE
// todo add map train by destination
                    // сделать мапу которая будет добавлять по дестинейшен нейму
// todo method print train by destination name from this map
                    //печатает по дестинейшен нейму
//todo bonus: add map trains by desination
//те ключем являетяс дестинейшен, а значением является список тех поездов, которые связаны с этим дестинейшеном.



public class Program {
    static ArrayList<Train> list = new ArrayList<Train>();
    public static Map<Integer, Train> trainMap = new HashMap<>();
    public static Map<Destination, Train> trainMapByDestination = new HashMap<>();

    public static void main (String[] args){
        Destination newYork = addDestination("New York", "3:15");
        Destination washington = addDestination("Washington", "6:20");
        Destination chikago = addDestination("Chicago", "4:45");
        Destination orlando = addDestination("Orlando", "9:25");


        Train a = addTrain(newYork, 564738, 11, 45, 13,15);
        Train b = addTrain(washington, 534537, 12, 45, 6, 20);
        Train c = addTrain(newYork, 345624, 10, 14, 3, 25);
        Train d = addTrain(chikago, 425375, 15, 34, 4, 45);
        Train e = addTrain(orlando, 882736, 19, 00, 8, 26);
        printListLineByLine();

        printArraivalTime();
        printInfAboutTrainThroughMap();

        sort();

        printInfAboutTrainByIterator();


    }
// todo QUESTION могу ли я здесь получить данные, которые обрабатываются в методе трейн? (дату отправления?)
    private static void printArraivalTime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a train number");
        int number = scan.nextInt();
        if (!trainMap.containsKey(number)){
            System.out.println("not exist");
        } else {
            Train a=trainMap.get(number);
            LocalDateTime arrivalDateTime = a.getTimeArrival();
            System.out.println("Time of departure is: "+a.timeDeparture.format(DateTimeFormatter.ofPattern("HH:mm"+" ")));
            System.out.println("Time of arriving is: "+arrivalDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
        }
            }

    private static Train addTrain(Destination destination, int trainNumber, int hour, int min, int hoursInWay, int minInTrip){
        Train a=new Train(destination, trainNumber, hour, min, hoursInWay, minInTrip);
        list.add(a);
        trainMap.put(a.getNumber(),a);
        trainMapByDestination.put(a.destination,a);
        return a;
    }

    private static void printListLineByLine(){
        Iterator<Train> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static Destination addDestination (String name, String destinationTime){
        Destination a=new Destination(name,destinationTime);
        return a;
    }

    private static void printInfChooseByDestination(){          // todo ПРОВЕРИТЬ
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a destination name");
        String nameDest = scan.next();
// ИСПОЛЬЗОВАНИЕ ИТЕРАТОРА ВВОДА
        Iterator iterator = trainMapByDestination.keySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
        }
    }

    private static void printInfAboutTrainByIterator(){
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
                System.out.println("not exist");
            }
        }
    }
    private static void printInfAboutTrainThroughMap (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a train number. I'll find a train by the map");
        int n = scan.nextInt();

        if(!trainMap.containsKey(n)) {
            System.out.println("not exist");
        } else {
            Train train = trainMap.get(n);
            System.out.println(train);
        }
    }

    private static void sort (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to sort by name of the destination, 2 to sort by train number, 3 to sort by departure time");
        int choose = scan.nextInt();
        if (choose==1){
            ComparatorDestinationName comparatorDestination = new ComparatorDestinationName();
            list.sort(comparatorDestination);
            printListLineByLine();
        } else if (choose==2){
            ComparatorTrain comparatorTrain = new ComparatorTrain();
            list.sort(comparatorTrain);
            printListLineByLine();
        } else if (choose==3){
            ComparatorDepartureTime comparatorDepartureTime = new ComparatorDepartureTime();
            list.sort(comparatorDepartureTime);
            printListLineByLine();
        }else {
            System.out.println("uncorrent choose");
        }

    }





}
