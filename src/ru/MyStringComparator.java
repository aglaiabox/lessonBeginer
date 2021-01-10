package ru;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();


        // o1 меньше о2 если ретурн меньше 0
        // o1 == о2 если ретурн == 0
        // o1 больше о2 если ретурн больше 0
        // return 0;
    }
}
