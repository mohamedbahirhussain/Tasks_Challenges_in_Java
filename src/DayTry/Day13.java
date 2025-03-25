package DayTry;

public class Day13 {

    public static void main(String[] args){
        int a = 50;
        int b = 30;

        System.out.println("befor swapping A = " + a + " B = " + b);

        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("After swapping A = " + a + " B = " + b);
    }
}
