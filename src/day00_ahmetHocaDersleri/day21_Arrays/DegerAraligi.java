package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class DegerAraligi {
    public static void main(String[] args) {

    /*Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
    ile 127 arasindaki bir sayiya donusturup yazdirin

   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        double sayi=scanner.nextDouble();
        byte yeniSayi= (byte)sayi;

        System.out.println("yeni sayi:"+yeniSayi);


        }




    }
