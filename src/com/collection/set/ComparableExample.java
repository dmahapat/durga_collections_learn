package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/*
* Comparable
*  - interface is present in java.lang package
*  - contains compareTo()
*  - obj1.compareTo(obj2)
*  - returns -ve if obj1 has to come before obj2
*  - returns +ve if obj1 has to come after obj2
*  - returns 0 if obj1 = obj2
*
*  We can customize the sorting order if the natural sorting order is unavailable or we need a different order
*  - Comparable interface is for default natural sorting order
*  - Comparator interface is for customized sorting order
*
*  Comparator
*   - interface is present in java.util package
*   - it has 2 methods
*   - public int compare(Object obj1,Object obj2)
*       . returns -ve if obj1 has to come before obj2
*       . returns +ve if obj1 has to come after obj2
*       . returns 0 if obj1 = obj2
*   - public boolean equals (Object obj)
*       . whenever we implement Comparator we have to give implementation for compare()
*       . equals() implementation does not have to be given
*       . implementation comes from Object class through inheritance
* */
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer intObj1 = (Integer) o1;
        Integer intObj2 = (Integer) o2;
        //return intObj1>intObj2 ? -1 : (intObj1<intObj2) ? +1 : 0;
        //return intObj2.compareTo(intObj1);
        //return -intObj1.compareTo(intObj2);
        //return -1; // returns reverse insertion order
        //return 1; //returns insertion order
        return 0; // returns the first element
    }
}
public class ComparableExample {

    static public void main(String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("K"));
        System.out.println("A".compareTo("A"));

        //TreeSet integerTreeSet = new TreeSet(new MyComparator());
        //Java 8 way of implementing comparator


        Comparator<Integer> reverseIntegerComparision = (o1, o2) -> o1>o2 ? -1 : (o1<o2) ? +1 : 0;
        TreeSet<Integer> integerTreeSet = new TreeSet<>(reverseIntegerComparision.reversed());
        integerTreeSet.add(10);
        integerTreeSet.add(20);
        integerTreeSet.add(0);
        integerTreeSet.add(5);

        System.out.println(integerTreeSet);
    }
}
