package DayTry;

import java.util.Scanner;

public class Day15 {
    public static void main(String args[]){
        int num1 = 45;
        int num2 = 25;

        System.out.println("Before Swapping..");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        for(int i=0; i<1; i++){
            int num = num1;
            num1 = num2;
            num2 = num;
        }
        System.out.println("After Swapping..");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        Scanner scn = new Scanner(System.in);


        System.out.println("Enter name: ");
        String name = scn.nextLine();
        System.out.println("Enter age: ");
        int age = scn.nextInt();

        System.out.println("My name is "+ name + ". My age is " + age);

    }
}
