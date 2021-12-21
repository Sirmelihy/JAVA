package SalaryThingy;
import java.time.Year;

public class Employee {

    String name;
    double salary;
    int workHours;
    int HireYear;
    int workingYear = Year.now().getValue() - HireYear;
    double taxPrice;
    double bonus;
    double raiseAmount;


    public Employee (String name,int salary,int workHours,int HireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.HireYear = HireYear;

    }


    void tax () {;
        if(salary > 1000) {
             taxPrice =  salary * 0.03;
        }
        else {
            taxPrice = 0;
        }

        //System.out.println("Tax = "  + taxPrice);



    }


    void bonus(){
        if(workHours > 40) {
            bonus = (workHours-40)*30;

            //System.out.println("bonus = " + bonus+"TL");
        }
    }

    void raiseSalary(int hireYear) {
        if (workingYear < 10) {

            raiseAmount = salary*0.05;

        }

        else if (workingYear< 20) {
            raiseAmount = salary*0.1;
        }

        else {
            raiseAmount = salary * 0.15;
        }

    }

    double sumSalary() {
        return salary + bonus + raiseAmount - taxPrice;
    }

    void print() {

        System.out.println("name : " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("starting year : " + this.HireYear);
        System.out.println("tax : " + this.taxPrice);
        System.out.println("bonus : " + this.bonus);
        System.out.println("raise amonut : " + this.raiseAmount);
        System.out.println("sum salary : " + sumSalary());

    }



}
