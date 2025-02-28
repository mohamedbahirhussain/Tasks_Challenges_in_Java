import java.util.Scanner;

public class Daytry {
    public static void main(String[] args){
        System.out.println("Enter name: ");
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine().trim();
        if(name.length() > 2 && name.endsWith("at")){
            System.out.println(name + " is end with at");
        }
        else {
            System.out.println(name + " is not end with at");
        }

        scn.close();
    }
}
