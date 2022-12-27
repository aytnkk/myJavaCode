package day23_dateTime_varargs.tekrar;

import java.security.spec.RSAOtherPrimeInfo;

public class C05_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayiyi toplayip yazdiran bir method olusturun

      topla(5,8);
      topla(5,7,3);
      topla(6,8,3);
      topla(6,9,7,5);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));

    }
}
