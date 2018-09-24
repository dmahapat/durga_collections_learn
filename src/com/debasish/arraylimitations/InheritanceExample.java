package com.debasish.arraylimitations;
/*
* We have 3 Classes A, B an InheritanceExample. Class C extends Class B and Class B extends
Class A. Each class has an method foo(), is there a way to call A's foo() method from
Class C?*
* */
class A{
    void foo() {
        System.out.println("Foo A");
    }
}
class B extends A{
    void foo() {
        super.foo();
        //System.out.println("Foo B");
    }
}
public class InheritanceExample extends B {
    void foo() {
        super.foo();
        //System.out.println("Foo InheritanceExample");
    }

    static public void main(String[] args) {
         InheritanceExample inheritanceExample = new InheritanceExample();
         inheritanceExample.foo();
    }
}
