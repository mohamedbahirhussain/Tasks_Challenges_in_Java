package DayTry.Day8.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
//
//        try {
//            int a = scn.nextInt();
//            System.out.println(a);
//            int b = 10/0;
//        }
//        catch (InputMismatchException e){
//            System.out.println("Please Enter Number only");
//        }
//        catch (ArithmeticException changenumber){
//            System.out.println("Please enter except 0 for deviding");
//        }
//
//        System.out.println("See you next time");


        try{
            int num1 = scn.nextInt();
            System.out.println("Entered number:" + num1);
            int num2 = scn.nextInt();
            System.out.println("Entered number:" + num2);
            int sum = num1/num2;
            System.out.println("Sum = " + sum);
        }catch (InputMismatchException wronginput){
            System.out.println("Enter numbers only");
        }
        catch (ArithmeticException fornum2enterexcept0){
            System.out.println("Don't enter 0 for num 2");
        }

    }
}
