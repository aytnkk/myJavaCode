package day28_exceptions.tekrar;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi alip
        // sayilari birbirine bolup, sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bolmek icin 2 tamsayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        try {
            System.out.println("Iki sayinin bolumu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
