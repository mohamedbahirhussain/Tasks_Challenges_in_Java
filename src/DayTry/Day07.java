package DayTry;

import java.util.Scanner;

public class Day07 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name  = scn.nextLine().toLowerCase().trim();
        System.out.println(name);

        if(name.length() > 2 && name.endsWith("at")){
            System.out.println(name + " end with at");
        }
        else {
            System.out.println(name + " not end with at");
        }
    }
}
