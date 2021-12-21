package SalaryThingy;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee ply = new Employee("kemal" ,2000,45,1985);


        ply.tax();
        ply.bonus();
        ply.raiseSalary(ply.HireYear);
        ply.print();


    }
}
