package day02_variables_scanner.prc;

import java.util.Scanner;

public class C010_Scanner {
    public static void main(String[] args) {

  /*
  soru:7   kullanicidan iki sayi alip ,ucuncu bir degisken kullanmadan
  ikisinin yerini degistirin

   */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi1'i giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lutfen sayi2'yi giriniz");
        int sayi2=scan.nextInt();



        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;



        System.out.println("swap'tan sonra sayi1:"+sayi1);
        System.out.println("swap'tan sonra sayi2:"+sayi2);





    }
}
