package day21_staticKeyword;

public class C01_StaticBlocks {

    C01_StaticBlocks() {
        System.out.println("Constructor calisti");

    }

    public static void main(String[] args) {

        System.out.println("Main method calismaya basladi");
    }
    static {
        // static bloklar class'daki tum yapilardan ,hatta mainmethod'tan bile once calisir.
        // static blocklarda istedigimiz bir variable'a baslangic degerinin atamasi
        // kullanicidan ytetki sorgulamasi gibi islemler yapilabilir.
        // main method calismadan once yapilmasi gereken islem oldugunda kullanilir
       // methodlarin ve static bloklarin siralamasi java acisindan onemli degildir
        // ancak birden fazla static block varsa , kendi aralarinda once ustteki calisir.
        System.out.println("Static method calisti");
    }
    static {
        System.out.println("alttaki static block calisti");
    }
}





