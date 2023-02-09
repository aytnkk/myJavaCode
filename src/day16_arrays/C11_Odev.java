package day16_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // kulanicidan yeni isimler alip ,varolan bir array'e ekleyen bir method olusturun
        // kullanici yeni deger verdigi muddetce C10'daki hazir methodu kulllanarak eklemeye devam edin
        // kullanici Q'ye bastiginda ,array'in son halini dondurun

         List<String> isimlerListesi=isimlerListesiOlustur();
        System.out.println(isimlerListesi);


    }

    private static List<String> isimlerListesiOlustur() {

        List<String> isimListesi=new ArrayList<>();

        String eklenenecekisimler="";
        Scanner scan=new Scanner(System.in);

        while (!eklenenecekisimler.equalsIgnoreCase("q")){
            System.out.println("lutfen listeye eklemek icin isim girin\nBitirmek icin q'ye basiniz");
       eklenenecekisimler= scan.nextLine();

       if (!eklenenecekisimler.equalsIgnoreCase("q")){
           isimListesi.add(eklenenecekisimler);
       }
        }
        return  isimListesi;

    }
}
