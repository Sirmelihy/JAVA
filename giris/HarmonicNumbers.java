package giris;
import java.util.Scanner;

public class HarmonicNumbers {


    public static void main(String[] args) {

        double n;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = object.nextDouble();

        double sum = 0;
        double i = 1;


        for(i = 1;i<=n;i++) {
            sum += (1/i);
        }

        System.out.println("result is " + sum);


    }
}
