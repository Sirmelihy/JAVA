package giris;
import java.util.Scanner;
public class bmiCalculator {

    public static void main (String[]args){


        //Body Mass index calculator

        Scanner object = new Scanner(System.in);

        System.out.println("Please enter your mass(KG)");
        double mass = object.nextDouble();
        System.out.println("Please enter your height (meter)");
        double height = object.nextDouble();


        double BMI;
        BMI = mass/(height*height);

        System.out.println("Your BMI is : " + BMI);
    }
}
