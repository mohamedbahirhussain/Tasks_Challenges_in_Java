package DayTry.Day10;

import java.util.Scanner;

public class TestPayment {
    public static void main(String[] args){
        PaymentMessage pymnt = new PaymentMessage();
        pymnt.sucpymntmessage();
    }

    void paytmfunction(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = scn.nextInt();
        System.out.println("Your amount is " + amount);

    }
}
