package giris;
import java.util.Scanner;
public class EvenNumberCounter {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = object.nextInt();

        for (int i = 0; i<=number;i++) {
            if(i%2 == 0) {
                System.out.println(i + " ");
            }
        }


    }
}
