package MineSweeper;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {


        int m = 1;
        int row ;
        int columns ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the game :");
        row = input.nextInt();
        columns = row;
        System.out.println("enter amount of mines: " );
        m = input.nextInt();


    minesweeper mns = new minesweeper(row,columns,m,new String[row][columns]);
    mns.createMap();
    mns.GameOn();



    }
}
