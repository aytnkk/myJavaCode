package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        /*kullanicidan bolunecek sayi ve bolecek sayiyi alip ,
         bolme isleminin sonucunu carpma islemo ile bulan ve yazdiran
        bir method olusturun.Bu islemi kullanici q 'a basincaya kadar devam ettirin.


         */
        Scanner scan = new Scanner(System.in);

        boolean devamEdelimMi = true;
        int bolunecekSayi = 1;
        int bolenSayi = 1;

        do {
            System.out.println("lutfen bolunecek tamsayiyi girin,\nbitirmek icin Q'ya basin");
            try {
                bolunecekSayi = scan.nextInt();
                System.out.println("lutfen bolecek sayiyi giriniz");
                bolenSayi = scan.nextInt();
                bolumSonucuYazdir(bolunecekSayi, bolenSayi);

            } catch (InputMismatchException e) {

                String girilenStr = scan.nextLine();
                //24.satirda nexInt() ile degeri alamadiysa, exception olusacak
                // bu satira gelecek ve biz o degeri nextline ile alacagiz

                if (girilenStr.equalsIgnoreCase("Q")) {
                    devamEdelimMi = false;

                } else {
                    System.out.println("Bolunecek sayi tamsayi olmalidir");
                }


            }

        } while (devamEdelimMi);


    }

    private static void bolumSonucuYazdir(int bolunecekSayi, int bolenSayi) {

        /*bolunecek sayi ve bolen sayi negatif veya pozitif olabilir .
         bu durumda oncelikle isaret kontrolu yapmamiz lazim
         isaaret sorununu cozmek icin once islem sonucunun isaretini belirleyip ,
        sonra sayilari isaretten bagimsiz hale getirelim.

         */
        int sonucIsareti = 1;

        if (bolunecekSayi * bolenSayi < 0) {
            sonucIsareti = -1;

        }
        // sonra sayilari isaretten bagimsiz hale getirelim
        bolunecekSayi = bolunecekSayi >= 0 ? bolunecekSayi : bolunecekSayi * (-1);
        bolenSayi = bolenSayi >= 0 ? bolenSayi : bolenSayi * (-1);

        int bolumSonucu = 1;
        while (bolumSonucu * bolenSayi < bolunecekSayi) {
            bolumSonucu++;

        }
        System.out.println("Bolme isleminin sonucu : " + bolumSonucu*sonucIsareti);
    }
}
