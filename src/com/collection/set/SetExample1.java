package com.collection.set;

import java.util.HashSet;
/*
* Set:
* 1. Child interface of collection
* 2. duplicates are not allowed
* 3. insertion order is not preserved
* 4. set interface does not contain any method. we got to use Collection interface method
*
* HashSet:
* 1. underlying DS is HashTable
* 2. Duplicate objects are not allowed
* 3. if we add duplicate,we get no error.the add() returns false
* 4. insertion order is not preserved
* 5. heterogeneous objects are allowed
* 6. null insertion is possible
* 7. HashSet implements Serializable and Clonable interfaces
*
*
* */
public class SetExample1 {
    static public void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add("Avengers");
        hashSet.add("Mission Impossible FALLOUT");
        hashSet.add("Deadpool");
        hashSet.add(1);
        hashSet.add(null); //null insertion is possible
        hashSet.add(10);
        boolean isAdded = hashSet.add("Deadpool");//Adding a duplicate.No compilation error.But add() returns false
        System.out.println("\"Deadpool\" added for 2nd time: "+isAdded);

        System.out.println("All the elements of hashset: "+ hashSet);

        /*
        * Iterating over the hashset in java 8 way
        * */

        System.out.println("Iterating over the hashset in java 8 way: ");
        hashSet.stream()
                .forEach(System.out::println);
    }


}
