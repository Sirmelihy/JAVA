package giris2;
import java.util.Scanner;
import java.lang.Math;

public class BetterCalculator {

      static double Addition(double n1,double n2) {

        double result = n1+n2;
        return result;

    }

    static double Substraction(double n1,double n2) {
          double result = n1-n2;
          return result;
    }

    static double Multiplication (double n1,double n2) {
          double result = n1*n2;
          return result;

    }

    static double Division(double n1,double n2) {
          double result = n1/n2;
          return result;

    }

    static double ExponentialCalculation(double n1,double n2) {
          double result = Math.pow(n1,n2);
          return result;
    }

    static double FactorialCalculation(double n1) {

          double result = 1;
          for(int i = 1;i<=n1;i++) {

              result *=i;
          }
          return result;
    }

    static double ModeRetrieval(double n1,double n2) {
          return n1%n2;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1,number2,result;

        int select;
        System.out.println("1-Addition\n2-Subtraction\n3-multiplication\n4-division\n5-Exponential Calculation\n6-Factorial Calculation\n7-Mode Retrieval\n");
        System.out.println("Please Select: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Enter first number :");
                number1 = input.nextDouble();
                System.out.println("Enter second number :");
                number2 = input.nextDouble();
                result = Addition(number1,number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case 2:

                System.out.println("Enter first number :");
                number1 = input.nextDouble();
                System.out.println("Enter second number :");
                number2 = input.nextDouble();
                result = Substraction(number1,number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case 3:
                System.out.println("Enter first number :");
                number1 = input.nextDouble();
                System.out.println("Enter second number :");
                number2 = input.nextDouble();
                result = Multiplication(number1,number2);
                System.out.println(number1 + " x " + number2 + " = " + result);
                break;

            case 4:
                System.out.println("Enter first number :");
                number1 = input.nextDouble();
                System.out.println("Enter second number :");
                number2 = input.nextDouble();
                result = Division(number1,number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case 5:

                System.out.println("Enter the number :");
                number1 = input.nextDouble();
                System.out.println("Enter power of the number :");
                number2 = input.nextDouble();
                result = ExponentialCalculation(number1,number2);
                System.out.println(number1 + " ^ " + number2 + " = " + result);
                break;

            case 6:

                System.out.println("Enter the number :");
                number1 = input.nextDouble();
                result = FactorialCalculation(number1);
                System.out.println(number1 + "! = " + result);
                break;

            case 7:

                System.out.println("Enter the first number :");
                number1 = input.nextDouble();
                System.out.println("Enter the second number :");
                number2 = input.nextDouble();
                result = ModeRetrieval(number1,number2);
                System.out.println(number1+"= " + result+"(mod"+number2+")");
                break;



            default:
                System.out.println("You entered a wrong number");
                break;
        }


    }


}
