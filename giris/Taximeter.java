package giris;
import java.util.Scanner;
public class Taximeter {



    public static void main (String[]args){

        double KMprice = 2.2;
        double MeterPrice = KMprice/10;
        double openingPrice = 10;

        Scanner object = new Scanner(System.in);

        double KM;
        double Meter100;
        System.out.println("Enter the Travelled Distance(by Kilometer)");
        KM = object.nextDouble();
        Meter100 = KM*10;


        double bill = Meter100*MeterPrice;
        double total = openingPrice + bill;

        if (total < 20) {
            total= 20;

        }

        System.out.println("You have to pay " + total + "Euro");


    }
}