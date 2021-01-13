package ru.train;
// TODO: Создайте класс Train, содержащий поля:                     DONE
//  название пункта назначения, номер поезда, время отправления.    DONE

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Train {
//    private String destinationName;
    public Destination destination;
    private int number;
    int hour;
    int min;
    LocalTime timeDeparture;
    int hoursInWay;
    int minInWay;
    private LocalTime timeArrival;
    //todo read user input for date and print datetimeof arrival

    public LocalDateTime getTimeArrival(){
        Scanner scan = new Scanner(System.in);
        System.out.println("To know a time of arriving, please, enter a departure date on format date.month (count). year");
        String date = scan.next();
        String dateTime = date + "."+hour+":"+min;
        LocalDateTime departDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd.MM.yyyy.HH:mm"));
        LocalDateTime arrivalDateTime = departDateTime.plusHours(hoursInWay).plusMinutes(min);
        return arrivalDateTime;
    }

    public Train(Destination destination, int number, int hour, int min, int hoursInWay, int minInWay){
        this.destination = destination;
        this.number = number;
        this.min = min;
        this.hour = hour;
        this.timeDeparture =LocalTime.of(hour,min);
        this.hoursInWay = hoursInWay;
        this.minInWay = minInWay;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }





    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "train to "+destination+", number "+number+", time of departure is "+timeDeparture;
    }

//    public int compareTo (Train train){
//        if (this.number == train.number){
//            return 0;
//        } else if(this.number < train.number){
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
