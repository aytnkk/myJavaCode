package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class terseCevirme {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int sayi = scan.nextInt();
        int tersSayi=0;
        while ((sayi>0)){  // sayi Buyuktur sifir sarti olustugu surece donguyu calistir.
            System.out.print(sayi % 10);
            sayi= sayi/10;


            System.out.println("===========================");


            // çözüm 1: for loops
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi=scanner.nextInt();
        int tersi=0;


        for (int i = 0; i <=sayi ; i++) {
           tersi=tersi*10+(sayi%10);
            sayi=sayi/10;

        }
        System.out.println(tersi);
        */

            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen bir sayı giriniz : ");
            int sayi1=scanner.nextInt(); System.out.println(1%10);
            int ters = 0;

            while (sayi1 != 0) {
                ters = ters * 10 + sayi1 % 10;
                sayi1 /= 10;
            }

            System.out.println("Sayının tersi: " + ters);
        }


    }
}
