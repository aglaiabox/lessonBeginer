package ru;

//TODO I
//todo method read user input 1 for date time in format 'day/month/year_hour:minute'    DONE
//todo method read user input 2 for date time in format 'day/month/year_hour:minute'    DONE
//TODO 1 print diff in number of days                                                   DONE
//TODO 2 print in another format - 'month-day year hour-minute'                         DONE


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LessonLocalDateTime2 {
   public static void main(String[] args){
//       LocalDateTime dateTime1 = enterDateName();
//       LocalDateTime dateTime2 = enterDateName();
       LocalDateTime dateTime1 = enterDateName2("11/03/1976_15:20");
       LocalDateTime dateTime2 = enterDateName2("05/04/1976_11:35");
       print(dateTime1);
       printAnotherFormat(dateTime1);
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

   private static void printAnotherFormat(LocalDateTime dateTime){
       System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MM-dd yyyy HH-mm")));
   }


   private static void getPeriod (LocalDateTime first, LocalDateTime second){
       long f = first.toEpochSecond(ZoneOffset.UTC);
       System.out.println(f);
       long s = second.toEpochSecond(ZoneOffset.UTC);
       System.out.println(s);

       long res = s-f;
       res/=60;
       res/=60;
       res/=24;
       System.out.println(res);

   }
}
