package ru.train;

import java.util.Comparator;

public class ComparatorDestinationName implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getDestinationName().compareTo(o2.getDestinationName()); // WHY!????????
    }
}
