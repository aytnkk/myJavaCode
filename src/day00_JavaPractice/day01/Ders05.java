package day00_JavaPractice.day01;

import java.util.Scanner;

public class Ders05 {
    public static void main(String[] args) {

       /* Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
       Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!


        */
        Scanner scan = new Scanner(System.in);
        String isim;
        String isimYeni;
        do {

            isimYeni = "";
            System.out.println("Lütfen bir isim giriniz\nisim uzunlugu en az 5 karakter olmalıdır: ");
            isim = scan.nextLine();

            for (int i = 0; i <= 2; i++) {
                isimYeni += isim.substring(isim.length() - 3);
            }

        } while (isim.length() < 5);
        System.out.println(isimYeni);


    }
}
