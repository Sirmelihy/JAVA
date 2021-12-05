package giris;
import java.util.Scanner;
public class ATM {


    public static void main(String[] args) {

        String userName,password;
        Scanner object = new Scanner(System.in);
        int balance = 1500;
        int select;

        while(true){
            System.out.println("Enter your username: ");
            userName = object.nextLine();
            System.out.println("Enter your Password");
            password = object.nextLine();

            if(userName.equals("Asymptote") && password.equals("1234")){
                System.out.println("Welcome to the Asymptote Bank!");

                do {
                    System.out.println("1-Deposit Cash\n" +
                            "2-Withdraw Cash\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select the action you want to do : ");
                    select = object.nextInt();

                    switch(select) {

                        case 1:
                            System.out.print("Enter the deposit amount: ");
                            balance += object.nextInt();
                            break;

                        case 2:
                            System.out.print("Enter the withdraw amount: ");
                            int price = object.nextInt();
                            if (price > balance) {
                                System.out.println("Withdraw amount can not be bigger than balance!");
                                select = 4;
                            }
                            break;

                        case 3:
                            System.out.println("Cash = " + balance);
                            break;
                        case 4:
                            System.out.println("Exit....");
                            break;

                        default:
                            System.out.println("Incorrect type of process..");
                            select=4;
                            break;
                    }





                }while (select!=4);


            }

            else {
                System.out.println("Your username or password is incorrect");
            }
        }

    }
}
