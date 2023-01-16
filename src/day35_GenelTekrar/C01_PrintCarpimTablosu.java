package day35_GenelTekrar;

import java.util.Scanner;

public class C01_PrintCarpimTablosu {
    public static void main(String[] args) {
        // kullanicidan bir rakam alin ve caarpim taplosu olustrun

        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;

        while(girilenSayi<=1 || girilenSayi>=10){ // burasi labul edilmeyen kisim. bu yuzden or(veya) kullanilir
            System.out.println("Carpim tablosu olusturmak icin bir rakam giriniz");
            girilenSayi= scan.nextInt();
            if (girilenSayi>1 && girilenSayi<10){ // burasi istenen durum o yuzden and(ve) kullaniliz
                break;

            }
            System.out.println("Carpim tablosu icin 1'den buyuk rakam girmelisiniz");

        }
        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j = 1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%3d  ",carpim);// listeyi daha duzenli yapmamizi sagliyor.


            }
            System.out.println(" ");
        }


    }
}
