package GladiatorGame;
import java.util.Random;

public class War {

    Random rnd = new Random();

    Fighter f1;
    Fighter f2;


    public War (Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    void RunFight() {

        System.out.println(f1.name + " has "+ f1.sumHealth + " health");
        System.out.println(f2.name + " has "+ f2.sumHealth + " health");



        while(f1.sumHealth > 0 && f2.sumHealth >0) {

          // System.out.println(f1.name + " hitted " + f2.name + " " + f1.damage() + " damage. ");
            f1.hitEnemy(f2,f1.damage());
            f2.PrintFullHealth();

            if(f2.sumHealth <= 0) {
                break;
            }

            f2.hitEnemy(f1,f2.damage());
           // System.out.println(f2.name + " hitted " + f1.name + " " + f2.damage() + " damage.");
            f1.PrintFullHealth();
            if(f1.sumHealth <= 0) {
                break;
            }
        }





        if(f1.sumHealth > 0) {
            f1.PrintFullHealth();
        }
        if(f2.sumHealth > 0) {
            f2.PrintFullHealth();
        }

        if(f1.sumHealth > f2.sumHealth) {
            System.out.println(f1.name + " won the fight");
        }

        else {
            System.out.println(f2.name + " won the fight");
        }

    }






}
