package day16_arrays;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // kulanicidan yeni isimler alip ,varolan bir array'e ekleyen bir method olusturun
        // kullanici yeni deger verdigi muddetce C10'daki hazir methodu kulllanarak eklemeye devam edin
        // kullanici Q'ye bastiginda ,array'in son halini dondurun

       String[] isimler={"Ali","Veli","Cem"};

       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yeni isimler giriniz");
       String yeniIsimler=scan.nextLine();


       String[] arr=new String[0];

       C10_ArrayeBirElementEkleme.arrayeElementEkleme(arr,yeniIsimler);



    }
}
