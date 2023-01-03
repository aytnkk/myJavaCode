package day10_stringManipulations;

public class C06_sifresoru {
    public static void main(String[] args) {

        /*
       Soru 4 : Kullanicidan bir sifre isteyip,
       asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
       eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
         - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

         */
        String sifre="abc1453";

        /*
        Bu soruda sartlari bagimsiz if cumlesi ile yapmak
        veya if else ile yapmak mumkundur
        Eger if else ile yaparsak ilk hatayi yazdirir
        geriye kalanlara bakmaz
        avantaji ise hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir.

        Bagimsiz if cumlelerinde tum hatalari bir kere de soyleyebiliriz.
        ancak bagimsiz if cumleleri kodun geriye kalaniyla ilgilenmediginden
        basarili sifre olusturuldugunu bizim ayri mekanizma ile konrol etmemiz gerekir
         */

        /*
        Sonucta basarili sifre olusturuldu demek icin bir kontrol mekanizmasi olusturmamiz gerekir
        ya her adimda arttiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
        veya basta verdigimiz deger olumsuz bir durum oldugunda arttirilir
        en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur diyebiliriz

         */

        int flag=0;


        //- ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
            //ilk harf kucuk harf degilse hatayi yazdir
            //charAt(0)>='a' || sifre.charAt(0)<='z'
            System.out.println("ilk harf kucuk harf olmali");
            flag++;// bir ceza puani aldi
        }
        //- son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){

            // son rakam rakam degilse rapor yazdir
            System.out.println("son karakter rakam olmali");
            flag++;
        }
            // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

       // - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }

    }
}
