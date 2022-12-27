package day13_methodOverloding_whileLoop;

import java.util.Scanner;

public class C06_sifrekontrolu {
    public static void main(String[] args) {
        // kulanıcıdan bir şifre isteyip aşağıdaki şartları kontrol edin
        //ve düzetmesi gereken tüm eksikleri söyleyin.
        //

        // ilk harf küçük olmalı
        // son karakter rakam olmalı
        //şifre bosluk içermemeli
        //uzunluğu en az 10 karakter olmalı

        // şifre kontrolünü bir method da yapıp true false döndürün
        // main method da dönen sonucu kontrol edip başarı ile oluşturuldu yazıncaya kadar
        // şifreyi tekrar isteyin

        Scanner scan=new Scanner(System.in);
        boolean tekrersifreiste=true;
        String sifre="";
        while (tekrersifreiste){
            System.out.println("lütfen sifrenizi giriniz");
            sifre=scan.nextLine();
            if (sifrekontrolet(sifre))// sifre kontrolü true dönerse
            {
                System.out.println("başarı ile oluşturuldu");
                //break;ya da alttaki
                tekrersifreiste=false;
            }
        }

    }
    public static boolean sifrekontrolet(String sifre) {
        int flag = 0;

        // ilk harf küçük olmalı
        if (sifre.charAt(0) < 'a' || sifre.charAt(0) > 'z') {
            System.out.println("ilk harf kücük olmalı");
            flag++;
        }
        // son karakter rakam değilse
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && (sifre.charAt(sifre.length() - 1) <= '9'))) {
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        //sifre bosluk içermesin
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk içermemeli");
            flag++;
        }
        //uzunluğu en az 10 karakter olmalı
        if (!(sifre.length() >= 10)) {
            System.out.println("en az 10 karakter olalı");
            flag++;
        }
        if (flag==0){
            return true;
        }else return false;

    }
}