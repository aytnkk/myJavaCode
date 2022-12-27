package day03_dataCasting_MatematikselIslemler.prc.C02_DataCasting;

import java.util.Scanner;

public class prc {
    public static void main(String[] args) {


        //soru 4: kullanicidan iki double sayi alin ,ilk sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonunucunun tamsayi kismina yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ondalikli iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("ilk sayinin ikinci sayiya bolumu:"+(int)(sayi1/sayi2));






    }
}
