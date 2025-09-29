package ConstructorPractice;

import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person{
    int salary;
    Employee(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Taskfour {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int age = scn.nextInt();
        int salary = scn.nextInt();

        Employee emp = new Employee(name, age, salary);
        emp.showInfo();
    }
}
