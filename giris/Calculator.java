package giris;
import java.util.Scanner;
public class Calculator {

    public static void main (String[]args){

        //Calculator

        Scanner object = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        double val1 = object.nextDouble();
        char operation;
        while(true) {
            System.out.println("Enter the type of operation(top multiply please select '*' )");
            operation = object.next().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                break;
            }
            else {
                System.out.println("Wrong character entered. Please try again!\n");
            }
        }

        System.out.println("Enter the second value");
        double val2 = object.nextDouble();
        double result;
        switch (operation){
            case '+' :
                result = val1+val2;
                break;

            case '-' :
                result = val1-val2;
                break;

            case '*':
                result = val1*val2;
                break;

            case '/':
                result = val1/val2;
                break;

            default:
                result= 0;
        }

        System.out.println("The result is : " + result);


    }
}