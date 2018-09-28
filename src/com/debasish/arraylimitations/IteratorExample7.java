package com.debasish.arraylimitations;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/*
* 1. Iterator can be applied to any collection object
* 2. remove operation can also be done
* 3. we get Iterator object with collectionObj.iterator()
*
* Limitation of iterator:
* 1. traversing backward is not possible
* 2. these cursors(Enumeration,Iterator) are unidirectional cursor,not bidirectional
* 3. we can only read or remove while using iterator
*
* ListIterator:
* 1. child interface of iterator
* 2. we can move in either direction - forward and backward
* 3. while iterating we can perform replacement,and addition of new objects
*
*
* */
public class IteratorExample7 {

    static public void main(String[] args) {
/*
        HashSet hashSet = new HashSet();
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add(null);
        hashSet.add(10);*/

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        //Java 8 way of removing elements from list safely

        arrayList.removeIf(integer -> integer%2 != 0);

        System.out.println("List after java 8 safe removal: "+arrayList);


        //uncommenting below would give concurrentmodification exception
        /*for (Integer i: arrayList ) {
            arrayList.remove(i);
        }*/

/*        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            if(integer % 2 == 0){
                System.out.println(integer);
            }else {
                iterator.remove();
            }
        }*/
        System.out.println(arrayList);
        /*
        * ListIterator Example
        *
        * */
        LinkedList linkedList = new LinkedList();
        linkedList.add("Predator");
        linkedList.add("Bucket list");
        linkedList.add("Avatar");

        System.out.println("Original Linked list : "+linkedList);

        ListIterator listIterator = linkedList.listIterator();
        Predicate<String> isStringEqualsToPredator = s -> s.equalsIgnoreCase("Predator");
        Predicate<String> isStringEqualsToBucketList = s -> s.equalsIgnoreCase("Bucket list");
        Predicate<String> isStringEqualsToAvatar = s -> s.equalsIgnoreCase("avatar");
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            if(isStringEqualsToPredator.test(str)){
                listIterator.remove();
            }
            if(isStringEqualsToBucketList.test(str)){
                listIterator.set("Black Panther");
            }
            if(isStringEqualsToAvatar.test(str)){
                listIterator.add("Ant-man and the wasp");
            }

        }
        /*
        * ListIterator is applicable only for list
        *
        * */
        System.out.println("Linked list after ListIterator cursor manipulation: "+linkedList);



    }
}
