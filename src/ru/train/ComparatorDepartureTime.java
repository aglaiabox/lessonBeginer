package ru.train;

import java.util.Comparator;

public class ComparatorDepartureTime implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTimeDeparture()-o2.getTimeDeparture();
    }
}
