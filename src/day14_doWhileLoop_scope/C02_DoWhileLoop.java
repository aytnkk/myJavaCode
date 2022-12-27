package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {


        // kullanicidan istedigi kadar sayi alin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("lutfen toplanmak icin tamsayi giriniz");
            girilenSayi= scan.nextInt();
            toplam +=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println("Girilen sayilarin toplami :" + toplam);

        /*
        while loop'ta ilk sart saglanmazsa loop body hic calismaz
        ama do while loop'ta once body calistigi icin ,sart yanlis olsa bile loop body'si en az 1 kere
        calismis olur.

         */

    }
}
