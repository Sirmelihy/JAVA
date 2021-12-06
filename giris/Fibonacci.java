package giris;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 11;
        int sum, temp = -1, result = 1;

        for (int i = 0; i <= n; i++) {

            sum = result + temp;
            System.out.println(sum);
            temp = result;
            result = sum;
        }
    }
}
