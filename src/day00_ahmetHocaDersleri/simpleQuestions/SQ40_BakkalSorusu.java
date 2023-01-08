package day00_ahmetHocaDersleri.simpleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SQ40_BakkalSorusu {


    /*
            Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
        yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
        method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
        gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
         kazandığını gösteren bir method yazınız.

     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
       2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
       3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
       4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
       5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
        for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
                 kazançtan yüksekse o günleri return yap.
       6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
        for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                 ortalama kazançtan aşağıysa o günleri return yap.
         */
    public static void main(String[] args) {

        // 1. Adım: Günleri içeren bir tane ArrayList oluşturun. (gunler)
        ArrayList<String> gunler = new ArrayList<>();

        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        // 2. Adım: Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();

        // 3. Adım: While döngüsü ile kullanıcıdan 7 günlük kazançları tek tek alıp gunlukKazanclar ArrayList'e ekle.
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <=7) {
            System.out.println(gunler.get(i) + " gününde kazancınızı giriniz: ");
            double kazanc = sc.nextDouble();
            gunlukKazanclar.add(kazanc);
            i++;
        }

        // 4. Adım: getOrtalamaKazanc() adlı method ile ortalama kazancı alın.




        // 5. Adım: getOrtalamaninUstundeKazancGünleri() adlı method oluşturun

        String ortalamaninUstundeKazancGünleri = "";
        System.out.println(Arrays.toString(ortalamaninUstundeKazancGünleri.toCharArray()));


        //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.

    }


    public static String getOrtalamaninAltindaKazancGünleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalamaKazanc) {

        String ortalamaninAltindaKazancGünleri = String.valueOf(new List[0]);

        for (int i = 0; i < gunler.size(); i++) {
            if (gunler.size() < ortalamaKazanc) {
                ortalamaninAltindaKazancGünleri = String.valueOf(gunler.size());
            }


        }


        return ortalamaninAltindaKazancGünleri;
    }

    }






