package day00_ahmetHocaDersleri.day21_Arrays;

import java.util.Scanner;

public class ders06_karakter {
    public static void main(String[] args) {


        /*
        Soru 20-)
      Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
      Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
      Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
      aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
      yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
                Örnek:
                giriş: ama
        çıkış: Dizede yinelenen karakterler var
                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("bakmak istediğiniz karakteri giriniz");
        char karakter = scan.next().charAt(0);

        if (isim.length() <= 3) {
            if (isim.indexOf(karakter) != isim.lastIndexOf(karakter)) {
                System.out.println("dizide yinelenen karakterler var");
            } else System.out.println("dizide yinelenen karakter yok");
        } else System.out.println("bu kadar uzun cümleyi anlamam");


        System.out.println("***************2.cozum");

        String word = "ece";
        String yenilenenKarakter = "";
        int count = 0;
        if (word.length() <= 3) {
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.substring(i, i + 1).equals(word.substring(j, j + 1))) {
                        yenilenenKarakter += word.substring(j, j + 1);
                        count++;
                    }
                }
            }
        } else {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }if(count>=1){
            System.out.println("yenilenen karakter var");
            System.out.println("yenilenen karakter= "+yenilenenKarakter);
        }else {
            System.out.println("yenilenen karakter yok");
        }
    }
}