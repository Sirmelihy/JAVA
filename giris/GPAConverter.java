package giris;
import java.util.Scanner;
public class GPAConverter {

    public static void main(String[] args) {

        //Converting 4.0 GPA to percentile

        System.out.println("Enter Your GPA (4.0 GRADING SCALE)" );
        Scanner object = new Scanner(System.in);

        double _GPA;

        _GPA = object.nextDouble();
        double Percentage = _GPA*25;

        if (_GPA < 0 || _GPA > 4.0) {
            System.out.println("invalid value of GPA");
        }
        else{
            System.out.println("Your Grade is % "  + Percentage );
        }

    }
}