package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {

       /*
       Kullanicidan bir arrayin boyutunu ve tum elementlerini alarak bir array olusturup ,
       bu arrayi bize donduren bir method olusturun.

        */

       int[] sayilar=arrayOlustur();

        System.out.println(Arrays.toString(sayilar));

    }

    private static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kaca elemanli bir array olusturmami istersiniz");
        int uzunluk=scan.nextInt();

        int[] olusturulan=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i]=scan.nextInt();

        }
        return olusturulan;
    }
}
