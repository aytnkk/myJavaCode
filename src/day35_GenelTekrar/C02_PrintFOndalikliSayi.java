package day35_GenelTekrar;

import java.util.Scanner;

public class C02_PrintFOndalikliSayi {
    public static void main(String[] args) {

        /*
            vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi 30 veya daha buyukse obez, 25-30 arasi ise kilolu,
         20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

         */



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu kg giriniz ");
        double kilo= scan.nextDouble();

        System.out.println("lutfen boyunuzu cm giriniz");
        double boy= scan.nextDouble();

        double vke=kilo*1000/ (boy*boy);

        // System.out.println("vucut kitle indeksiniz:"+ vke);
        System.out.printf("vucut kitle indeksiniz: %.2f %n",vke);

        if (vke>=30) System.out.println("Obezsiniz");
        else if (vke>=25) System.out.println("Kilolusunuz, rejime baslamalisiniz");
        else if (vke>=20) System.out.println("Kilonuz normal, boyle devam edin");
        else System.out.println("Zayifsiniz,kilo almalisiniz");




    }
}
