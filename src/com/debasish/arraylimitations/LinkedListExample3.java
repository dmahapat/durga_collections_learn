package com.debasish.arraylimitations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListExample3 {

    static public void main(String[] args) {
        /*
         * If our frequent operation is to insert and delete in the middle,then ArrayList is not recommended
         * For that we have LinkedList
         *
         * */
        /*
        * LinkedList
        *
        * 1. Underlying DS is doubleLinkedList
        * 2. Insertion order is preserved
        * 3. Duplicate objects are allowed
        * 4. Heterogeneous objects are allowed
        * 5. Null insertion is possible
        * 6. Implements serializable and clonable interfaces but not random access interface
        * 7. Worst choice if our frequent operation is retrival
        * */

        /*
        * Constructors
        * */
        LinkedList linkedList = new LinkedList(); // This creates an empty linkedList

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList1 = new LinkedList(arrayList); //for conversion between Collection objects
        /*
        * Usually we use LinkedList to implement stack and queue interface. to support this requirement LinkedList has following
        * 6 methods
        * void addFirst(Object o);
        * void addLast(Object o);
        * Object removeFirst();
        * Object removeLast();
        * Object getFirst();
        * Object getLast();
        * */

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("Debasish");
        linkedList2.add(30);
        linkedList2.add(null);
        linkedList2.add("Debasish");
        linkedList2.set(0,"Jagan");
        linkedList2.add(0,"Kuntala");
        linkedList2.removeLast();
        linkedList2.addFirst("Kuntala");

        System.out.println("The linked list is: "+linkedList2);
        System.out.println("Printing linked list in java 8 way: ");
        linkedList2.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }
}
