package giris;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number;
        number = object.nextInt();
        int digits = 0,digitsTemp = 0;
        int numbertemp =0;
        int mTen = 10;
        double sum = 0;

        do{

            numbertemp = number%mTen;
            mTen *=10;
            digits++;

        }while(numbertemp!=number);

        mTen = 10;
        digitsTemp = digits;


        while(digitsTemp!=0) {

            numbertemp = (number%mTen)/(mTen/10);
            sum += Math.pow(numbertemp,digits);
            mTen *=10;
            System.out.println(numbertemp);
            System.out.println(sum);
            digitsTemp--;

        }

        if(sum == number) {
            System.out.println(number + " is an Armstrong Number");
        }

        else {
            System.out.println(number + " is not an Armstrong Number");
        }




    }
}
