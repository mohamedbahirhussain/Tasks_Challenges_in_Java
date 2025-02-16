package DayTry.Day8.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        try {
            int a = scn.nextInt();
            System.out.println(a);
            int b = 10/0;
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter Number only");
        }
        catch (ArithmeticException changenumber){
            System.out.println("Please enter except 0 for deviding");
        }

        System.out.println("See you next time");

    }
}
