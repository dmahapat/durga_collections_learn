package com.collection.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/*
* TreeSet:
*
* 1. Underlying DS is balanced tree
* 2. Duplicate objects are not allowed
* 3. Insertion order is not preserved
* 4. Heterogeneous objects are not allowed - as we have to sort here so similar objects have to be there
* 5. Upon pushing heterogeneous objects we get ClassCastException
*
*
* */
public class TreeSetExample4 {

    static public void main(String[] args) {
        List<String> heroineList = Arrays.asList("Jessica","Emma","Scarlett","Angelina");
        TreeSet treeSet = new TreeSet(heroineList);

        //treeSet.add(10); - uncommenting this gives ClassCastException
        //treeSet.add(null); - uncommenting this gives NullPointerException

        System.out.println(treeSet);

        TreeSet<String> treeSet1 = new TreeSet((o1, o2) -> o2.toString().compareToIgnoreCase(o1.toString()));
        treeSet1.addAll(heroineList);
        System.out.println(treeSet1);



        /*
        * If we are depending on default natural sorting order
        *  - objects have to be homogeneous
        *  - and comparable
        *  - otherwise there will be ClassCastException
        *  - object is said to be Comparable if the corresponding class implements ComparableInterface
        *  - String and all other wrapper class already implement Comparable
        *  - StringBuffer does not implement Comparable
        * */
        TreeSet treeSet2 = new TreeSet();
/*        treeSet2.add(new StringBuffer("Kevin"));
        treeSet2.add(new StringBuffer("Brad"));
        treeSet2.add(new StringBuffer("Denzel"));*/

        //System.out.println(treeSet2);

        /*
        * Uncommenting above would give ClassCastException
        * */




    }
}
