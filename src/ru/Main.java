package ru;

//TODO I
//todo method read user input 1 for date time in format 'day/month/year_hour:minute'
//todo method read user input 2 for date time in format 'day/month/year_hour:minute'
//TODO 1 print diff in number of days
//TODO 2 print in another format - 'month-day year hour-minute'


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
//       LocalDateTime dateTime1 = enterDateName();
//       LocalDateTime dateTime2 = enterDateName();
       LocalDateTime dateTime1 = enterDateName2("11/03/1976_15:20");
       LocalDateTime dateTime2 = enterDateName2("25/07/1984_11:35");
       print(dateTime1);
       print(dateTime2);
       getPeriod(dateTime1,dateTime2);

//       11/07/1987_15:30
//       15/06/1986_15:13


//       LocalDateTime = LocalDateTime.of()
   }

   private static LocalDateTime enterDateName(){
       System.out.println("Enter a date in format 'day/month/year_hour:minute'");
       Scanner scan = new Scanner(System.in);
       String time = scan.next();
       LocalDateTime parsedDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("dd/MM/yyyy_HH:mm"));
       return parsedDateTime;
   }

    private static LocalDateTime enterDateName2(String time){ ;
        LocalDateTime parsedDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("dd/MM/yyyy_HH:mm"));
        return parsedDateTime;
    }

   private static void print(LocalDateTime dateTime){
       System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy_HH:mm")));
   }


   private static void getPeriod (LocalDateTime first, LocalDateTime second){
       first.toLocalDate().getDayOfYear();

       int days = period.getDays();
       int month = period.getMonths();
       int years = period.getYears();
       period.
       System.out.println(days + " " + month + " " + years);
   }
}
