package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample5 {

    static public void main(String... args) {

        Comparator<String> riverComparator = (o1, o2) -> {
          int obj1Length = o1.length();
          int obj2Length = o2.length();
          return obj1Length<obj2Length ? -1 : obj1Length>obj2Length ? +1 : 0;
        };
        TreeSet<String> riverSet = new TreeSet<>(riverComparator.reversed());
        riverSet.add("Volga");
        riverSet.add("Bramhaputra");
        riverSet.add("Tigris");
        riverSet.iterator()
                .forEachRemaining(System.out::println);
    }

}
