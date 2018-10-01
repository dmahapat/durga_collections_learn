package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
public class ComparatorExample4 {

    static public void main(String... args) {

        Comparator<String> mountainComparator = Comparator.comparing(String::toString);

        //TreeSet<String> mountainSet = new TreeSet<>(new CustomComparator()); ----- until java 8
        TreeSet<String> mountainSet = new TreeSet<>(mountainComparator.reversed()); // ---- java 8 way
        mountainSet.add("Mount Everest");
        mountainSet.add("K2");
        mountainSet.add("Lhotse");

        System.out.println("JAVA 8 iterator new method - forEachRemaining");

        mountainSet.iterator()
                .forEachRemaining(System.out::println);
    }
}
