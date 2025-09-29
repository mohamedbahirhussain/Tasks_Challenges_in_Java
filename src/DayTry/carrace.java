package DayTry;

import java.util.Scanner;

class car {
    int noOfgear;
    String color;

    car(int noOfgear, String color) {
        this.noOfgear = noOfgear;
        this.color = color;
    }

    public void printCarInfo() {
        System.out.println("noOfGear: " + noOfgear);
        System.out.println("color: " + color);
    }
}

class racecar extends car {
    int maxspeed;

    racecar(int noOfgear, String color, int maxspeed) {
        super(noOfgear, color);
        this.maxspeed = maxspeed;
    }

    public void printinfo() {
        printCarInfo();
        System.out.println("maxSpeed: " + maxspeed);
    }
}

public class carrace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int noOfgear = scn.nextInt();  // Read gear
        scn.nextLine(); // ✅ Consume the leftover newline
        String color = scn.nextLine(); // Read color (String input)
        int maxspeed = scn.nextInt();  // Read max speed

        racecar rc = new racecar(noOfgear, color, maxspeed);
        rc.printinfo();
    }
}
