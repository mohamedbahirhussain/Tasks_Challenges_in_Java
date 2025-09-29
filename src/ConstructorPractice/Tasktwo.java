package ConstructorPractice;

import java.util.Scanner;

class Book{
    String title;
    String author;

    //default constructor
    Book(){
        this.title = "unknown";
        this.author = "unknown";
    }

    //parameterized constructor
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void showdetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Tasktwo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String title = scn.nextLine();
        String author = scn.nextLine();

        Book bk1 = new Book();

        Book bk2 = new Book(title, author);

        bk1.showdetails();
        bk2.showdetails();
    }
}
