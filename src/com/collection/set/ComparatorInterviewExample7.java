package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeObj /*implements Comparable*/ {

    private String name;
    private Integer id;

    public EmployeeObj(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

/*    @Override
    public int compareTo(Object o) {
        EmployeeObj employeeObj1 = this;
        EmployeeObj employeeObj2 = (EmployeeObj) o;
        if(employeeObj1.getId() == employeeObj2.getId()){
            return employeeObj1.getName().compareToIgnoreCase(employeeObj2.getName());
        }
        return employeeObj1.getId().compareTo(employeeObj2.getId());
    }*/

    @Override
    public String toString() {
        return "EmployeeObj{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class ComparatorInterviewExample7 {

    static public void main(String... args) {

        // Implementing logic java 8 way
        Comparator<EmployeeObj> employeeComparator = Comparator.comparing(EmployeeObj::getId)
                .thenComparing(EmployeeObj::getName);
        TreeSet<EmployeeObj> employeeObjTreeSet = new TreeSet<>(employeeComparator);

        employeeObjTreeSet.add(new EmployeeObj("John Cleese",1));
        employeeObjTreeSet.add(new EmployeeObj("Steve Martin",2));
        employeeObjTreeSet.add(new EmployeeObj("Martin Lawrence",2));

        System.out.println(employeeObjTreeSet);
    }
}
