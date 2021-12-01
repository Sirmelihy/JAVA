package giris;
import java.util.Scanner;
public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while(true){
            System.out.println("Enter a number");
            number = object.nextInt();

            if (number >= 0) {
                if(number %2 == 1) {
                    sum += number;
                }
            }

            else {
                break;
            }

        }

        System.out.println(sum);


    }
}
