import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double price;
        double salesTax;
        double total;

        System.out.println("Input a price: ");
        Scanner input = new Scanner(System.in);

        price = input.nextDouble();

        salesTax = (price * 0.05);
        total = (price + salesTax);

        System.out.println("The base price is: " + price);
        System.out.println("The sales tax is: " + salesTax);
        System.out.println("The total is: " + total);
    }
}