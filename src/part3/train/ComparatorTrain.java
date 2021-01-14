package part3.train;

import java.util.Comparator;

public class ComparatorTrain implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getNumber()-o2.getNumber();
    }
}
