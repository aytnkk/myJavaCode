package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        /*
        Ternary isleminin sonucunu yazdiracaksak
        booolean sartin true veya false olmasi durumunda yazdiracagimiz datalar farkli
        data turunde olabilir

        Ancak atama yapacaksak
        true veya false olmasi durumunda alacagi degerler
        atayacagim variablenin data turune uygun olmalidir
         */

        int sayi=2;

        System.out.println(sayi>10 ? "buyuk sayi": sayi+2);

       //int b=sayi>10 ? "buyuk sayi":sayi+2;// int data turu ile baslayan variable'e  string girilemez
       //String c= sayi>10 ? "buyuk sayi":sayi+2;//string ile baslayan data turune int deger verilemez


    }
}