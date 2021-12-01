package giris;
import java.util.Scanner;


public class LeapYear {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int year;
        boolean check = false;
        System.out.println("Enter a year: ");
        year = object.nextInt();

        if(year%100 == 0){
            if(year%400 == 0){
                check = true;
            }

            else {
                check = false;
            }
        }
        else if (year%4 == 0) {
            check = true;
        }

        else {
            check = false;
        }

        if(check == true) {
            System.out.println(year + " is a leap year!");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }



}
