package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

     /*

    Soru 2- Kullanicidan bir double,
    bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.


     */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ondalikli sayi giriniz");
        double sayiDbl=scan.nextDouble();
        System.out.println("lutfen bir tamsayi giriniz");
        int sayiInt=scan.nextInt();

        System.out.println("sayilarin toplami:"+(sayiDbl+sayiInt));

        System.out.println("sayilarin carpimi:"+ sayiDbl*sayiInt);


    }
}
