package giris;
import java.util.Scanner;
public class TriangleStars {


    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number;");
        int n = object.nextInt();
        int i,j,k,a;
        a=n;

        for(i = 1;i<=n;i++) {

            for(k=a;k>=1;k--) {

                System.out.print("-");
            }


            for(j=1;j<=(i+(i-1));j++){
                System.out.print("*");
            }

            for(k=a;k>=1;k--) {

                System.out.print("-");
            }

            a--;
            System.out.println("");

        }

    }
}
