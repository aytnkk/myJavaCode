package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

      /*  Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin,
         ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)

        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz.
         İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
       */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz" );
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int ebob=1;
        int ekok=0;

        for (int i = 1; i <=sayi1 ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;


        }

        }
        System.out.println(sayi1+"ve"+sayi2+"icin EBOB :"+ebob);
        System.out.println(sayi1+"ve"+sayi2+"icin EKOK :"+(sayi1*sayi2/ebob));
    }
}





