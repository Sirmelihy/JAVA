package giris;
import java.util.Scanner;
public class TaxCalculator {


    static double taxCalculation (double Price) {

        Price += (Price * 18 / 100);
        return Price;

    }

    public static void main (String[]args){


        System.out.println("Enter the price of the product before tax:");

        Scanner object = new Scanner(System.in);

        double ProductPrice;
        ProductPrice = object.nextDouble();

        System.out.println("After tax new price of the product is " + taxCalculation(ProductPrice));

    }
}