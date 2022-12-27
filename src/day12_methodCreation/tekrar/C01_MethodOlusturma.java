package day12_methodCreation.tekrar;

public class C01_MethodOlusturma {
    public static void main(String[] args) {


        // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun
        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir
        // method call icerisinde yazilan variable veya degerlere argument denir

carpYazdir(5,8);
carpYazdir(7.4,8.6);


    }
    public static void carpYazdir(double sayi1,double sayi2){
        System.out.println((sayi1*sayi2));
    }
}
