package ConstructorPractice;

import java.util.Scanner;

class student{
    String name;
    int rollNumber;

    student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class Taskone {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int rollnumber = scn.nextInt();

        student std = new student(name, rollnumber);
        std.displayinfo();
    }
}
