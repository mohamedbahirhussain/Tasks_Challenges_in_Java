package DayTry;

import java.util.Scanner;

class checkinput{
    static void checkin(){
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        if(input.matches("a-zA-Z")){
            System.out.println("✅ You entered letters only: " + input);
        } else {
            System.out.println("❌ Invalid input. Please enter letters only!");
        }
    }
}

public class Day18 {
    public static void main(String[] args){

        checkinput ck = new checkinput();
        
        Scanner scn = new Scanner(System.in);
        int number;

        while (true){
            System.out.println("Enter number");
            String input = scn.nextLine();

            if(input.matches("\\d+")){
                number = Integer.parseInt(input);
                break;
            }
            else {
                System.out.println("❌ Invalid input. Please enter numbers only!");
            }
        }
        System.out.println("✅ You entered number: " + number);



        int num[] = {5, 8, 1, 4, 7, 3, 9, 2, 6};

        // Bubble Sort (Descending)
        for(int i = 0; i < num.length - 1; i++){
            for(int j = 0; j < num.length - i - 1; j++){
                if(num[j] < num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted (Descending): ");
        for(int n : num){
            System.out.print(n + " ");
        }
    }
}
