package com.debasish.arraylimitations;

import java.util.Stack;

/*
* Stack:
* 1. This is child class of Vector
* 2. Has only one constructor
* */
public class StackExample5 {
    static public void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println("Search position of element A: "+stack.search("A")); // it returns the offset
        System.out.println("Search position of element which is not is the stack: "+stack.search("Z"));// returns -1 for such operations

        System.out.println("Iterating in java 8 way: ");
        stack.stream()
                .forEach(System.out::println);

    }
}
