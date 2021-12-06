package giris;
import java.util.Scanner;
public class EBOBEKOK {


    public static void main(String[] args) {

        int num1,num2;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        num1 = object.nextInt();
        System.out.println("Enter number2: ");
        num2 = object.nextInt();
        int ebob = 0,ekok = 1,biggest = 0,i;

        if(num1 > num2) {
            biggest = num1;
        }
        else {
            biggest = num2;
        }

        for( i= 1;i<=biggest;i++) {

            if(num1%i == 0) {
                if(num2%i == 0) {
                    ebob = i;
                }
                else {
                    continue;
                }
            }
        }

        for(i = 1;i<=(num1*num2);i++) {
            if(i%num1 == 0 && i%num2==0) {
                ekok = i;
            }
        }

        System.out.println("ekok = "+ ekok);
        System.out.println("ebob = " + ebob);

    }
}
