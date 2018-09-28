package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
* LinkedHashSet
* 1. Child class of HashSet
*
| HashSet                          | LinkedHashSet                                             |
|----------------------------------|-----------------------------------------------------------|
| Underlying DS is HashTable       | Underlying DS is combination of HashTable and LinkedList  |
| Insertion order is not Preserved | Insertion order preserved                                 |
| Introduced in 1.2 V              | Introduced in 1.4V                                        |

****Application area of LinkedHashSet and LinkedHashMap****
* 1. Cache applications where duplicates are not allowed and insertion order must be preserved

* */
public class LinkedHashSetExample2 {

    static public void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("Avengers");
        set.add("Mission Impossible FALLOUT");
        set.add("Deadpool");
        set.add(1);
        set.add(null); //null insertion is possible
        set.add(10);

        System.out.println("Iterating the set in java 8 way: ");
        set.stream()
                .forEach(System.out::println);
    }
}
