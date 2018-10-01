package com.collection.set;
/*
* | Comparable                                                                                            | Comparator                                                                                         |
|-------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| For predefined comparable classes default natural sorting order is already available                  | If we need customization in the comparator logic we can go for Comparator interface implementation |
| For predefined non comparable classes default natural sorting order is not available.e.g StringBuffer | In that case we should define comparator                                                           |
*
* */

import java.util.TreeSet;

class Employee implements Comparable {
    int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int empId1 = this.employeeId;
        Employee employee = (Employee) o;
        int empId2 = employee.employeeId;

        return empId1<empId2 ? -1 : empId1>empId2 ? +1 : 0;
    }
}

public class ComparatorExample6 {
    static public void main(String... args) {
        TreeSet<Employee> employeeTreeSet = new TreeSet<>();
        employeeTreeSet.add(new Employee(100));
        employeeTreeSet.add(new Employee(700));
        employeeTreeSet.add(new Employee(600));
        employeeTreeSet.add(new Employee(500));
        employeeTreeSet.add(new Employee(400));

        employeeTreeSet.iterator()
                .forEachRemaining(System.out::println);

    }
}
