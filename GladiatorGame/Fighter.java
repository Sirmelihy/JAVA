package GladiatorGame;
import java.util.Random;

public class Fighter {

    Random rnd = new Random();

    int defence;
    int health = 100;
    int sumHealth = health + defence;
    String name;
    int armorType;
    int weaponType;

    public Fighter (String name,int weaponType,int armorType) {

        this.name = name;
        this.weaponType = weaponType;
        if(armorType == 1) {
            this.defence = 25;
            this.sumHealth = this.defence + this.health;
        }
        else if(armorType == 2) {
            this.defence = 50;
            this.sumHealth = this.defence + this.health;
        }

        else if (armorType == 3){
            this.defence = 100;
            this.sumHealth = this.defence + this.health;
        }

        this.armorType = armorType;
    }


    public void hitEnemy (Fighter enemy,int damage) {

        enemy.sumHealth -= damage;
        if(enemy.sumHealth < 0) {
            enemy.sumHealth = 0;
        }
        System.out.println(this.name + " hitted " + enemy.name +" " + damage + " damage! ");

    }

    public void PrintFullHealth() {

        System.out.println("'" + this.name + "'" +  " has "+ this.sumHealth+" Health");
    }


    public boolean missed() {

        if(weaponType == 1) {
            if (rnd.nextInt(100) <= 15) {
                return true;
            }

            else {
                return false;
            }
        }

        else if (weaponType == 2) {
            if (rnd.nextInt(100) <= 35) {
                return true;
            }
            else {
                return false;
            }
        }

        else {
            if (rnd.nextInt(100) <= 65) {
                return true;
            }
            else {
                return false;
            }
        }



    }


    public int damage() {
        if(this.weaponType == 1) {

            if(missed() == true) {
                return 0;
            }

            else {
                return rnd.nextInt(15);
            }

        }
        else if (this.weaponType == 2) {
            if(missed() == true) {
                return 0;
            }

            else {
                return rnd.nextInt(25) + 5;
            }
        }


        else if (this.weaponType == 3)  {
            if(missed() == true) {
                return 0;
            }
            else {
                return rnd.nextInt(30) + 20;
            }
        }

        else {
            return 0;
        }
    }




}
