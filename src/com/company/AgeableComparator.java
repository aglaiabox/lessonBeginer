package com.company;

import java.util.Comparator;

public class AgeableComparator implements Comparator<Ageble> {
    @Override
    public int compare(Ageble o1, Ageble o2) {
        return o1.getAge() - o2.getAge();
    }
}
