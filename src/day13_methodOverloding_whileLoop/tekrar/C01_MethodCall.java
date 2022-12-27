package day13_methodOverloding_whileLoop.tekrar;

import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377


        // asagida verilen cumleyi tersine yazdirin

        String str="Bir kere kod yaparim,sonra keyfime bakarim ";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));
        // iki sekilde de yazdirabiliriz

        //asagida verilen cumleyi tersine cevirin
        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);


        // asagida verilen cumlenin palindrome olup olmadigini yazdirin

        str="java candir";
        tersStr=C07_TerseCevirme.metniTerseCevir(str);// ridnac avaj

        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else System.out.println("polinrome degil");


        // asagida verilen sayinin asal sayi olup olmadigini yazdirin

        int sayi=23;
        System.out.println(C03_AsalSayi.asalSayiMi(sayi));// true
        // kullanici true ve false den birsey anlamaz, acik sekilde yazalim dersek

        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi);//true

        if (sonuc){
            System.out.println("Girilen " + sayi + " asal.");
        }else System.out.println("Girilen " + sayi + " asal sayi degil.");







    }

}
