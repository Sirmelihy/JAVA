package giris;
import java.util.Scanner;
public class CircleCalculations {



    public static void main (String[]args){

        double pi = 3.14;


        Scanner object = new Scanner(System.in);


        System.out.println("Enter the radius of the Circle");
        double radius = object.nextDouble();
        double area = radius*radius*pi;
        double circumference = 2*pi*radius;

        System.out.println("Area of the circle is" + area + "Circumference is " + circumference );


    }
}