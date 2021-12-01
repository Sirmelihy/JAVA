package giris;
import java.util.Scanner;
public class GroceryCalculator {

    public static void main (String[]args){
        //Grocery calculator
        double pearP = 2.14;
        double appleP = 3.67;
        double tomatoP = 1.11;
        double bananaP = 0.95;
        double aubergineP = 5;

        double pearKG;
        double appleKG;
        double tomatoKG;
        double bananaKG;
        double aubergineKG;
        double total;

        Scanner object = new Scanner(System.in);

        System.out.println("How many kg of Pear :" );
        pearKG = object.nextDouble();
        System.out.println("How many kg of Apple :");
        appleKG = object.nextDouble();
        System.out.println("How many kg of Tomato :");
        tomatoKG = object.nextDouble();
        System.out.println("How many kg of Banana :");
        bananaKG = object.nextDouble();
        System.out.println("How many kg of Aubergine :");
        aubergineKG = object.nextDouble();

        total = (pearKG*pearP) + (appleKG*appleP) + (tomatoKG*tomatoP) + (bananaKG*bananaP) + (aubergineP*aubergineKG);

        System.out.println("Order Total" + total);

    }
}