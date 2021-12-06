package giris;
import java.util.Scanner;
public class MinAndMax {


    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int n = object.nextInt();
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,temp;

        if(n>1) {

            for (int i = 1; i <= n; i++) {
                System.out.println(i + ". Enter the number: ");
                temp = object.nextInt();

                if (temp > max) {
                    max = temp;
                }

                if (temp < min) {
                    min = temp;
                }
            }
        }

        else {
            System.out.println("Enter the number: ");
            temp = object.nextInt();;
            min = temp;
            max = temp;
        }

        System.out.println("min = "+min);
        System.out.println("max = "+max );
    }
}
