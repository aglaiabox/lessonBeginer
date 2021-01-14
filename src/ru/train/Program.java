package ru.train;

// TODO: Создайте класс Train, содержащий поля:                                     DONE
//  название пункта назначения, номер поезда, время отправления.                    DONE
//  Создайте лист из пяти элементов типа Train,                                     DONE
//  добавьте возможность сортировки элементов массива по номерам поездов.           DONE
//  Добавить выбор - как будем сортировать и сортировку по выбранному признаку.     DONE
//  Добавьте возможность вывода информации о поезде, номер которого введен пользователем,   DONE
//  добавьте возможность сортировки листа по пункту назначения,                             DONE
//  причем поезда с одинаковым пунктом назначения должны быть упорядочены по времени отправления. DONE

import ru.LessonFile1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TODO II
//todo change train time of departure                           DONE
//todo add time in trip                                         DONE
//todo read user input for date and print datetimeof arrival    DONE

//TODO III
// todo в программе с трейнами сделать мапу, которая хранит трейны по номеру поезда.    DONE
//  И еще функцию, которой я передаю номер поезда и печатаю по номеру поезда            DONE
// todo add map train by destination                                                    DONE
                    // сделать мапу которая будет добавлять по дестинейшен нейму
// todo method print train by destination name from this map                            DONE
                    //печатает по дестинейшен нейму
//todo bonus: add map trains by desination                                              DONE
//те ключем являетяс дестинейшен, а значением является список тех поездов, которые связаны с этим дестинейшеном.



public class Program {
    static ArrayList<Train> list = new ArrayList<Train>();
    public static Map<Integer, Train> mapTrain = new HashMap<>();
    public static Map<Destination, Train> mapTrainByDestination = new HashMap<>();
    public static Map<Destination,List<Train>> mapListTrainByDestination = new HashMap<>();

    public static void main (String[] args) throws Exception {
        Destination newYork = addDestination("New York", "3:15");
        Destination washington = addDestination("Washington", "6:20");
        Destination chikago = addDestination("Chicago", "4:45");
        Destination orlando = addDestination("Orlando", "9:25");


        Train a = addTrain(newYork, 564738, 11, 45, 13,15);
        Train b = addTrain(washington, 534537, 12, 45, 6, 20);
        Train c = addTrain(newYork, 345624, 10, 14, 3, 25);
        Train d = addTrain(chikago, 425375, 15, 34, 4, 45);
        Train e = addTrain(orlando, 882736, 19, 00, 8, 26);

        LessonFile1.writeToFile(list);
        printListLineByLine();
        System.out.println(mapListTrainByDestination);
//        System.out.println(trainMap);
//        System.out.println(trainMapByDestination);
//        System.out.println(trainMapByDestination.get(newYork));
        System.out.println("<><><><><><><><><><>");
        printInfChooseByDestination("Chicago");
        printInfChooseByDestination("New York");


//        printArraivalTime();
//        printInfAboutTrainThroughMap();
//        sort();
//        printInfAboutTrainByIterator();


    }

    private static void printInfChooseByDestination(String nameDest){ //
        Iterator iterator = mapTrainByDestination.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            Destination a = (Destination) iterator.next();
            if(a.name==nameDest) {
                System.out.println( mapTrainByDestination.get(a));
                i++;
            }
        }
        if (i==0)
            System.out.println("destination not exist");
    }

    private static void printInfChooseByDestination(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a destination name");
        String nameDest = scan.next();
// ИСПОЛЬЗОВАНИЕ ИТЕРАТОРА ВВОДА
        Iterator iterator = mapTrainByDestination.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            Destination a = (Destination) iterator.next();
            if(a.name==nameDest) {
                System.out.println( mapTrainByDestination.get(a));
                i++;
            }
        }
        if (i==0)
            System.out.println("destination not exist");
    }

    private static void printArraivalTime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("To know a time of arriving, please, enter a departure date on format date.month (count). year");
        String date = scan.next();


        System.out.println("enter a train number");
        int number = scan.nextInt();
        if (mapTrain.containsKey(number)){
            System.out.println("not exist");
        } else {
            Train a= mapTrain.get(number);
            LocalDateTime arrivalDateTime = a.getTimeArrival(date);
            System.out.println("Time of departure is: "+date+" "+a.timeDeparture.format(DateTimeFormatter.ofPattern("HH:mm"+" ")));
            System.out.println("Time of arriving is: "+arrivalDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
        }
            }

    private static Train addTrain(Destination destination, int trainNumber, int hour, int min, int hoursInWay, int minInTrip){
        Train a=new Train(destination, trainNumber, hour, min, hoursInWay, minInTrip);
        list.add(a);
        mapTrain.put(a.getNumber(),a);
        mapTrainByDestination.put(a.destination,a);

        boolean hasKey = mapListTrainByDestination.containsKey(a.destination);
        if (hasKey){
            List<Train> listTrainsByDest= mapListTrainByDestination.get(a.destination);
            listTrainsByDest.add(a);
        } else {
            List<Train> listTrainsByDest = new LinkedList<>();
            listTrainsByDest.add(a);
            mapListTrainByDestination.put(a.destination,listTrainsByDest);
        }

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
        List<Train> trains = new LinkedList<Train>();
        return a;
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

        if(!mapTrain.containsKey(n)) {
            System.out.println("not exist");
        } else {
            Train train = mapTrain.get(n);
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
