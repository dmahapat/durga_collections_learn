package com.debasish.arraylimitations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
*ArrayList:
*  1. The underlying DS is growable array
*  2. Insertion order is preserved
*  3. Duplicate objects are allowed
*  4. Heterogeneous objects are allowed
*  5. Null insertion is possible
*
* In every collection toString method has been overridden to give the formats in specified way
*
* Every collection class implements serilizable and clonable interfaces
*
*  a. ArrayList and Vector classes implement RandomAccessInterface - so that any random element can be accessed with same speed
*  b  If our frequent operation is retrival then we should go for ArrayList
*  c. If Frequent operation is insertion or deletion in the middle then ArrayList is worst choice
*
| ArrayList                                                          | Vector                                                                      |
|--------------------------------------------------------------------|-----------------------------------------------------------------------------|
| No method is synchronized                                          | Every method is synchronized                                                |
| Multiple threads can access Arraylist. Hence,it is not thread safe | Only one thread is allowed to operate on vector.Hence vector is thread safe |
| Threads do not have to wait. Hence,performance is high             | It increases waiting time of threads.Hence, performance time is low         |
| Included in 1.2 version                                            | Included in 1.0 version                                                     |
*
*
* */
public class ArrayListExample2 {
    static public void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        /*
        * 1. the above creates an empty arraylist object with default initial capacity 10
        * 2. once arraylist reaches its maximum capacity then a new AL is created with
        *       newCapacity = currentCapacity * 1.5 + 1
        * */

        ArrayList arrayList1 = new ArrayList(5);
        /*
        * The above creates an arraylist with initial capacity of 5
        * */

        ArrayList arrayList2 = new ArrayList(arrayList);
        /*
        * Creates an equivalent arraylist object for the given collection object
        * this constructor is for dancing between collection objects
        *
        * */

        arrayList.add("Debasish");
        arrayList.add(10);
        arrayList.add('A');
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(2,"Roshni");
        arrayList.add("Deepankar");
        arrayList.add("Sandeep");
        arrayList.add("Anjan");
        System.out.println(arrayList);
        arrayList1.addAll(arrayList);
        System.out.println("Added all elemnts of arrayList to ArrayList1: "+arrayList1 );

        /*
        * Java 8 way of printing - only prints non null entries
        * */
        arrayList.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);


        /*
        * Process to get a synchronized arrayList - use synchronizedList in Collections class
        * Similarly we can get synchronized version of Set and Map
        *
        * */
        List arrayList3 = Collections.synchronizedList(arrayList);


        /*
        * If our frequent operation is to insert and delete in the middle,then ArrayList is not recommended
        * For that we have LinkedList
        *
        * */



    }
}
