package MineSweeper;
import java.util.Random;
import java.util.Scanner;

public class minesweeper {

    Scanner input = new Scanner(System.in);

    int row, columns;
    String rarr[][];
    int varr[][];
    boolean up,down,right,left;
    boolean isLose = false;
    boolean isWin = false;
    String zarr[][];
    int opened = 0;
    int mine = 0;





    public minesweeper(int row,int columns,int mine,String rarr[][]) {


        this.mine = mine;
        this.rarr = rarr;
        this.zarr = new String[row][columns];
        this.row = row;
        this.columns = columns;
        this.varr = new int[row][columns];



    }




    void Open (int i,int k) {

        if(zarr[i-1][k-1] == "-") {


            String s = String.valueOf(varr[i-1][k-1]);
            zarr[i-1][k-1] = s;
            this.opened++;


        }



    }

    public void CheckWin () {
        if(this.opened >= ((this.row)*(this.columns) - this.mine)) {
            this.isWin = true;
            yazdir();
            System.out.println("YOU WON!");
        }

        else {
            this.isWin = false;
        }
    }


    public void GameOn () {


        yazdir();
        while(isLose == false && isWin == false) {
            CheckWin();
            System.out.println("Enter the coordinates of the box you want to open(row): ");
            int i = input.nextInt();
            System.out.println("(column): ");
            int k = input.nextInt();

            if(i<= row && k <= columns) {
                if (rarr[i-1][k-1] != "*") {
                    Open(i, k);
                    yazdir();
                } else {
                    isLose = true;

                    zarr[i-1][k-1] = rarr[i-1][k-1];
                    yazdir();
                    System.out.println("YOU LOST THE GAME");
                }
            }
        }



    }






    public void createMap() {

        int i = 0,k = 0;
        int mines = this.mine;





        for ( i = 0; i < this.row; i++) {
            for ( k = 0; k < this.columns; k++) {
                zarr[i][k] = "-";
                rarr[i][k] = "-";
                varr[i][k] = 0;
            }
        }

        Random rnd = new Random();


        while(true) {
            i = rnd.nextInt(0,row);
            k = rnd.nextInt(0,columns);
//            System.out.println(i+1 + " " + (k+1));




            if(rarr[i][k] != "*"){

                if(i == 0) {
                    this.up = true;
                }

                if(i == this.row-1) {
                    this.down = true;
                }

                if(k == 0) {
                    this.left = true;
                }

                if(k == this.columns-1) {
                    this.right = true;
                }

                rarr[i][k] = "*";
                if(this.up) {
                    varr[i+1][k]++;
                }
                else if(this.down) {
                    varr[i-1][k]++;
                }
                else {
                    varr[i+1][k]++;
                    varr[i-1][k]++;
                }

                if(this.left) {
                    varr[i][k+1]++;
                }
                else if(this.right) {
                    varr[i][k-1]++;
                }
                else{
                    varr[i][k+1]++;
                    varr[i][k-1]++;
                }

                if(i == 0 && k == 0) {
                    varr[i+1][k+1]++;
                }
                else if(i==this.row-1 && k == 0) {
                    varr[i-1][k+1]++;
                }
                else if(i == 0 && k==this.columns-1) {
                    varr[i+1][k-1]++;
                }
                else if (i == this.row-1 && k==columns-1){
                    varr[i-1][k-1]++;
                }
                else if (this.up) {
                    varr[i+1][k-1]++;
                    varr[i+1][k+1]++;
                }
                else if (this.down) {
                    varr[i-1][k-1]++;
                    varr[i-1][k+1]++;
                }
                else if (this.left) {
                    varr[i+1][k+1]++;
                    varr[i-1][k+1]++;
                }
                else if (this.right) {
                    varr[i-1][k-1]++;
                    varr[i+1][k-1]++;
                }
                else {
                    varr[i-1][k-1]++;
                    varr[i-1][k+1]++;
                    varr[i+1][k-1]++;
                    varr[i+1][k+1]++;
                }
                mines--;
                this.up = false;
                this.down = false;
                this.right = false;
                this.left = false;
            }

            if(mines == 0) {
                break;
            }
        }

    }

    public void yazdir() {

        for (int i = 0; i < this.row; i++) {
            for (int k = 0; k < this.columns; k++) {
                System.out.print(zarr[i][k] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
/*
        for (int i = 0; i < this.row; i++) {
            for (int k = 0; k < this.columns; k++) {
                System.out.print(rarr[i][k]);
                System.out.print("\t");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println();



        for (int i = 0; i < this.row; i++) {
            for (int k = 0; k < this.columns; k++) {
                System.out.print(varr[i][k]);
                System.out.print("\t");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println(this.opened);
 */

    }





}
