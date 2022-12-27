package day13_methodOverloding_whileLoop;

public class C02_MethodOverLoading {
    public static void main(String[] args) {

        String str="Java cok guzel";
        System.out.println(str.substring(5));// cok guzel
        System.out.println(str.substring(3,5));//a

        // eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ve ayni isimdeki methodlardan hangisinin calisacagina argument/parametre uyumu karar verir

        toplama(5,6);//11
        toplama(5,3,1);//9
        /*
        java ayni class icerisinden ayni isim ve ayni data turunden
        parametre sayisi ile 2 method olusturmaniza izin vermez

        1-ismini degistirebiliriz ancak bu durumda overloading olmaz:
        OVERLOADING ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
        2-parametre sayisini degistirebiliriz
        3-ayni sayida parametre yazip ,parametrelerin data turunu degistirebiliriz
        4-ve ya farkli data turndeki parametrelerinin yerini degistirebiliriz
         */
        toplama(6,6);//
        toplama(4.5,5);//9.5
        toplama(4.5,6.7);//11.2
    }
    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tamsayinin toplami:" + (sayi1+sayi2));
    }

    public static void toplama(int sayi1,int sayi2, int sayi3){
        System.out.println("3 tamsayinin toplami :" +(sayi1+sayi2+sayi3));

    }
    public static void toplama(double sayi1 ,int sayi2){
        System.out.println("double ve int toplami:" + (sayi1+sayi2));
    }
    public  static  void toplama(int sayi2 , double sayi1){
        System.out.println("int ve double toplami:\" + (sayi1+sayi2)");
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami:" + (sayi1+sayi2));
    }
}
