package giris;
import java.util.Scanner;
import java.lang.Math;
public class hypotenuse {



    public static void main (String[]args){

        Scanner object = new Scanner(System.in);

        int a,b;

        System.out.println("Enter the first value");
        a = object.nextInt();
        System.out.println("Enter the second value");
        b = object.nextInt();

        System.out.println("The hypotenuse is :" +   Math.sqrt(a*a + b*b));




    }
}