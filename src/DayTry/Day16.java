package DayTry;

import java.util.Scanner;


class Solution {
     static boolean isEven(int n) {
        // code here
        if(n%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

public class Day16 {

    public static void main(String[] args){
        String name = "Bahir !";
        System.out.println(name);
        System.out.println(name.length());
        int lettercount = 0;
        for(char ch: name.toCharArray()){
            if(Character.isLetter(ch)){
                lettercount++;
            }
        }
        System.out.println(lettercount);

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        Solution fn = new Solution();
        fn.isEven(num);

    }

}
