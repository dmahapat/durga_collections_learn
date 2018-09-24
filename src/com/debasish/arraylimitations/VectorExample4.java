package com.debasish.arraylimitations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/*
* Vector
* 1. Underlying DS is growable array
* 2. Insertion order is preserved
* 3. Duplicate objects are allowed
* 4. Null insertion is possible
* 5. Heterogeneous objects are allowed
* 6. Implements Serializable,Clonable and RandomAccessInterfaces
* 7. Best choice when frequent operation is retrival
* 8. Worst choice when frequent operation is insertion and deletion in the middle
* 9. Every method in vector is synchronised. Hence vector is threadsafe
*
* */
public class VectorExample4 {

    static public void main(String[] args) {
        Vector v = new Vector(); // creates empty vector object with default initial capacity 10.
        // once the vector reaches its max capacity a new vector object will be created
        // new capacity = 2 * Current capacity

        Vector vector = new Vector(5); // Creates a vector with specific initial capacity
        Vector vector1 = new Vector(5,10);
        ArrayList arrayList = new ArrayList();
        Set set = new HashSet<>();
        Vector vector2 = new Vector(set); // creates an equivalent vector for given collection


        /*
        * Add methods in vector
        * */
        vector.add(1);
        vector.add(1,"Debasish");
        vector.add("Roshni");

        System.out.println(vector);

        /*
        * Remove methods in vector
        * */

        vector.remove("Roshni");// argument is object
        vector.removeElement("Debasish");
        vector.remove(0);

        vector.add("Deepankar");
        vector.removeElementAt(0);

        vector.add("Deepankar");
        vector.add("Sandeep");
        vector.removeAllElements();
        vector.clear();

        System.out.println("After remove operation the vector is: "+vector);


        vector.add("Deepankar");
        vector.add("Sandeep");
        vector.add("Preeta");

        System.out.println("0th element: "+ vector.get(0));
        System.out.println("1 index element: "+ vector.elementAt(1));
        System.out.println("1st element: "+vector.firstElement());
        System.out.println("Last element: "+vector.lastElement());

        vector.clear();
        for (int i = 0; i < 10 ; i++) {
            vector.add(i);
        }
        System.out.println("Capacity of vector is: "+vector.capacity());
        vector.addElement("Debasish");
        System.out.println("Updated Capacity: "+vector.capacity());// upon adding one more element it made the capacity twice
        System.out.println("The entire vector is: "+vector);


    }
}
