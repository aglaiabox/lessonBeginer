package ru;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LessonLocalDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1986, 11, 21);
        System.out.println(date);
        LocalDate parsedDate = LocalDate.parse("2019-01-04");
        System.out.println(parsedDate);
        LocalDate parsedFormat = LocalDate.parse("01.05.1999", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(parsedFormat);

        System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        //immutable
        LocalDate dateModifyed = date.plusDays(7);
        System.out.println(dateModifyed);

        LocalTime time = LocalTime.of(10, 11, 44);
        time.plusMinutes(1);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2012, 11, 10, 10, 44);

        //TODO I
        ///todo method read user input 1 for date time in format 'day/month/year_hour:minute'
        ///todo method read user input 2 for date time in format 'day/month/year_hour:minute'
        //TODO 1 print diff in number of days
        //TODO 2 print in another format - 'month-day year hour-minute'


        //TODO II
        //todo change train time of departure
        //todo add time in trip
        //todo read user input for date and print datetimeof arrival
    }
}
