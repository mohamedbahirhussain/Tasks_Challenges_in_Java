package ConstructorPractice;

import java.util.Scanner;

class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class Taskfive {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Product[] products = new Product[3];

        for(int i=0; i< products.length; i++){

            System.out.println("Enter Product Details..." + (i+1));

            System.out.println("Id: ");
            int id = scn.nextInt();
            scn.nextLine();

            System.out.println("Name: ");
            String name = scn.nextLine();

            System.out.println("Price:");
            double price = scn.nextDouble();

            //create and store product object
            products[i] = new Product(id, name, price);

        }
        System.out.println("\nAll Product Details:\n");

        //displaying all product details
        for(Product p : products){
            p.showDetails();
        }
    }
}
