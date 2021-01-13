package ru.train;

import java.time.LocalTime;
import java.util.Comparator;

public class ComparatorDestinationName implements Comparator<Train> {


    @Override
    public int compare(Train o1, Train o2) {

        if (o1.destination.equals(o2.destination)) {
            return o1.timeDeparture.compareTo(o2.getTimeDeparture());
        } else {
            return o1.destination.getName().compareTo(o2.destination.getName());
        }
    }
}
