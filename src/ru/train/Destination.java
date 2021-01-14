package ru.train;

import java.util.LinkedList;

public class Destination {
    final String name;
//    Time transitTime;
////    Time time = Time.valueOf(timeInTrip);



    public Destination(String name, String transitTime) {
        this.name = name;
//        TimeFo
//        this.transitTime = Time.valueOf(transitTime)

    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Destination is "+name;
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() !=obj.getClass())
            return false;
        Destination other = (Destination) obj; //приведение типов
        if (name != other.name)
            return false;
        return true;
    }
}


//todo override equals & hashCode       DONE

