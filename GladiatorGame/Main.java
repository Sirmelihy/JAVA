package GladiatorGame;
import java.util.Scanner;
public class Main {

    static void printWeaponMenu (String fightername) {
        System.out.println("Select " + fightername + "'s Weapon Type");
        System.out.println("1- DAGGER | Dodge chance: ***** | Damage :  * ");
        System.out.println("2- SWORD  | Dodge chance:  ***  | Damage : ***");
        System.out.println("3- AXE    | Dodge chance:   *   | Damage :*****");

    }

    static void printArmorMenu (String fightername) {
        System.out.println("Select " + fightername + "'s Armor Type");
        System.out.println("1- Fabric | Dodge chance: ***** | Armor :  25 ");
        System.out.println("2- Iron   | Dodge chance:  ***  | Armor :  50");
        System.out.println("3- Heavy  | Dodge chance:   *   | Armor :  100");

    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first gladiator name: ");
        String fighter1name = input.nextLine();
        System.out.println("Enter the second gladiator name: ");
        String fighter2name = input.nextLine();
        printWeaponMenu(fighter1name);
        int weapon = input.nextInt();
        printArmorMenu(fighter1name);
        int armor = input.nextInt();
        Fighter fighter1 = new Fighter(fighter1name,weapon,armor);
        printWeaponMenu(fighter2name);
        weapon = input.nextInt();
        printArmorMenu(fighter2name);
        armor = input.nextInt();
        Fighter fighter2 = new Fighter(fighter2name,weapon,armor);

        War war = new War(fighter1,fighter2);
        war.RunFight();









    }
}
