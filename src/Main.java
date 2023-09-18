import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double price = 24.99;
        double salesTax = price * .05;
        double finalPrice = price + salesTax;

        System.out.println("Price of Item: " + price);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Final Price including tax: " + finalPrice);
    }
}