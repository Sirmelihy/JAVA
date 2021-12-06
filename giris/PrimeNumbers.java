package giris;
public class PrimeNumbers {

    public static void main(String[] args) {

        int n = 100;
        boolean unprime = false;

        for(int i = 2;i<=n;i++) {
            for(int j=2;j<=i;j++) {

                if(j!=i && j!=1) {

                    if(i%j == 0) {
                        unprime = true;
                        break;
                    }
                }
            }
            if (unprime == false) {
                System.out.println(i);
            }
            unprime = false;
        }
    }
}
