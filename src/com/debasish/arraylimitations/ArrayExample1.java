package com.debasish.arraylimitations;

/*
*
*   Array limitation
* 1. The size is fixed
* 2. Arrays can hold only homogeneous elements
* 3. For arrays there is no underlying data structure. We cannot use readymade method support
* 4. the developer has to write all the logic which increases complexity of code
* 5. To delete an element in an array we need to traverse through out the array so this will reduce performance.
*
*   Array advantages:
*  1. We can access any element randomly by using indexes provided by arrays.
   2. Primitive type to wrapper classes object conversion will not happen so it is fast.
   3. Array can store many number of elements at a time.

   From performance point of view collections are not recommended to use
   Arrays can hold both primitive and object types but collections can only hold object type

   Collection definition: A group of individual objects as a single entity is called  collection
   Collection framework : it defines several classes and interfaces,which can be used to represent a group of objects as single entity

   9 key interfaces of collection framework:

   1. Collection - root interface of collection framework,contains most common methods for any collection object
   2. Collection vs Collections: Collections is a utility class present in java.util package. defines several utility methods
   3. List interface: child interface of collection - insertion order is preserved and duplicates are allowed
   4. Set interface: child interface of collection - duplicates are not allowed insertion orser is not preserved
   5. SortedSet interface: child interface of set if we want to group individual object according to some sorting order
   6. NavigableSet interface: child interface of SortedSet.It provides several methods for navigation process(introduced in 1.6)
   7. Queue: Child interface of Collection- in case we want to represent group of individual objects prior to processing then we should go for Queue
   8. Map: if we want to represent a group of object as a key value pair
        a. Both key and value are objects
        b. duplicate keys are not allowed but values can be duplicated
        c. Map is not a child interface of cCollection interface
   9. SortedMap: if we want to represent a group of key value objects according to some sorting order then we should go for sorted map
        a. sorting should be based only on keys not on values
        b. SortedMap is child interface of Map
   10. NavigableMap: Child interface of SortedMap - defines several methods for navigation purposes

   Legacy classes in collection framework:

   Enumeration
   Dictionary
   Vector
   Stack
   Hashtable
   Properties

Collection interface methods:

*
* */

public class ArrayExample1 {

    static public void main(String[] args) {

    }
}
