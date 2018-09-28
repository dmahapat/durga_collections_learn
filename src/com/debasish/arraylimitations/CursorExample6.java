package com.debasish.arraylimitations;

import java.util.Enumeration;
import java.util.Vector;

/*
* Cursors:
* 1. If we want to get objects one by one from collection we should go for cursor
* 2. 3 types of cursors
*       a. Enumeration
*       b. Iterator
*       c. ListIterator
*
*       Enumeration : it is applicable for legacy class
*
* */
public class CursorExample6 {

    static public void main(String[] args) {

        Vector<String> strings = new Vector<>();
        strings.addElement("Debasish");
        strings.addElement("Neelima");
        strings.addElement("Ansuman");

        Enumeration enumeration = strings.elements();

        while (enumeration.hasMoreElements()) {
            String temp = (String) enumeration.nextElement();
            System.out.println(temp);
        }
    }
}
/*
*  Limitation of enumeration
*  1. applicable for only legacy classes
*  2. we get only read access, no remove operations
*  3. to overcome these "Iterator" got introduced in 1.2 version
* */