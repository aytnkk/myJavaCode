package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini alin
        //ve girilen ismi buyuk harflerle yaziniz
        // kullanicidan deger almak icin 3 islem yapmamiz lazim
        // 1.adim scanner objesi olusturmak



        Scanner scan=new Scanner(System.in);

        // kullaniciya ne istediginizi soyleyin

        System.out.println("lutfen isminizi giriniz");

        // 3.adim kullaicinin girecegi degeri kaydedeceginiz bir variable olusturun
        // scan objesi ile ilgili methodu  kullanarak kullanicinin girdigi degeri
        // olusturdugunuz variable'a atayin

        String girilenIsim=scan.nextLine();

        // Artik kullanicinin girdigi deger girilenisim variable'inde kayitli

        System.out.println(girilenIsim.toUpperCase());






    }
}
