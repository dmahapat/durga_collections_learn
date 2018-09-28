package com.collection.set;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

/*
* SortedSet:
*
* 1. Child interface of Set
* 2. if we want to represent a group of individual object according to some sorting order we should use it
* 3.
*
* */
public class SortedSetExample3 {

    static public void main(String[] args){
        SortedSet<String> stringSortedSet = new TreeSet<>();
        stringSortedSet.add("Cabin Crew");
        stringSortedSet.add("Bad Girl");
        stringSortedSet.add("Avengers");
        stringSortedSet.add("Daddy Day Care");

        System.out.println(stringSortedSet);

        System.out.println("First Element: "+stringSortedSet.first());
        System.out.println("Last Element: "+stringSortedSet.last());
        System.out.println("Set elements before to \"Cabin Crew\": "+((TreeSet<String>) stringSortedSet).headSet("Cabin Crew"));
        System.out.println("Set elements before to \"Avengers\": "+((TreeSet<String>) stringSortedSet).headSet("Avengers"));
        System.out.println("Set elements after to \"Avengers\": "+((TreeSet<String>) stringSortedSet).tailSet("Avengers"));
        System.out.println("Set elements after to \"Cabin Crew\": "+((TreeSet<String>) stringSortedSet).tailSet("Cabin Crew"));
        System.out.println("Set elements between \"Avengers\" and \"Daddy Day Care \" :" +((TreeSet<String>) stringSortedSet).subSet("Avengers","Daddy Day Care"));
/*        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Debasish",1);
        hashMap.put("Debasish",1000);
        hashMap.put(null,null);
        hashMap.put(null,234);
        hashMap.put(null,null);
        System.out.println(hashMap);*/


    }
}
