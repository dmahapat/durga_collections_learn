package com.collection.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Human{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SortingWithMultipleConditionExample {

    static public void main(String[] args) {
        List<Human> humans = Arrays.asList(
          new Human("Kevin",38),
          new Human("Jim",38),
          new Human("Adam",45)
        );

        /*humans.sort((lhs, rhs) ->{
            if(lhs.getName().equals(rhs.getName())){
                return lhs.getAge() - rhs.getAge();
            }else {
                return lhs.getName().compareTo(rhs.getName());
            }
        });*/
        Comparator<Human> humanComparator = Comparator.comparing(Human::getAge)
                .thenComparing(Human::getName);
        humans.sort(humanComparator);
        //humans.forEach(System.out::println);

        //Iterator iterator = humans.iterator();
        /*
        * Java 8 iterator addition
        * */
        System.out.println("JAVA 8 iterator new method - forEachRemaining");
        humans.iterator()
              .forEachRemaining(System.out::println);

    }
}
