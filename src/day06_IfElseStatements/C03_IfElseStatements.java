package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {


    /*
     Soru 5- Kullanicidan bir harf isteyin,
     girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
     yoksa girilen harfi yazdirin
     */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
       char girilenHarf=scan.next().charAt(0);



       if (girilenHarf>='a' && girilenHarf<='z'){
           // kucuk harf ise buyuk harf olarak yazdiralim
           System.out.println((char)(girilenHarf-32)); // kucuk harf ile buyuk harf arasi fark 32 dir
       }else{
           // kucuk harf degilse girilen harfi yazdiralim
           System.out.println(girilenHarf);
       }


    }
}