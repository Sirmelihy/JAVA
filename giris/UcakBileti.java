    package giris;
    import java.util.Scanner;
    public class UcakBileti {


            public static void main (String[]args){

                double kmucret = 0.10;
                Scanner object = new Scanner(System.in);
                double fiyat;
                double mesafe;
                double yolculukindirimi;
                int yas,yolculuktipi;
                double discountype = 1;

                System.out.println("Yaşınızı girin");
                yas = object.nextInt();

                if(yas < 0) {
                    System.out.println("Hatalı yaş girdiniz indirim uygulanmayacak");
                    discountype = 1;
                }
                else if  (yas < 12 && yas > 0) {
                    discountype = 0.5;
                }

                else if (yas >=12 && yas <=24) {
                    discountype = 0.1;
                }

                else if (yas >24 && yas<65) {
                    discountype = 1;
                }
                else if (yas >= 65) {
                    discountype = 0.3;
                }

                else {
                    discountype = 1;
                }

                while(true){
                    System.out.println("Yolculuk tipi:");
                    yolculuktipi = object.nextInt();

                    if (yolculuktipi == 1) {
                        yolculukindirimi = 1;
                        break;
                    }

                    else if (yolculuktipi == 2) {
                        yolculukindirimi = 0.2;
                        break;

                    }
                    else {
                        System.out.println("Yolculuk tipi 1 veya 2 olmalıdır");
                    }
                }

                System.out.println("toplam mesafeyi giriniz");
                mesafe = object.nextDouble();
                fiyat = mesafe*kmucret;
                fiyat = fiyat-(fiyat*discountype);
                fiyat = fiyat-(fiyat*yolculukindirimi);


                System.out.println("Odemeniz gereken toplam tutar = "+ fiyat );








        }
    }
