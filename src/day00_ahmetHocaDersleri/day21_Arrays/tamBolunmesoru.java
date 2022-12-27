package day00_ahmetHocaDersleri.day21_Arrays;

public class tamBolunmesoru {
    public static void main(String[] args) {

        /*
       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.
       Problem Tanımı
        90 dan 0'a kadar 12'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */

        int toplam = 0;

        for (int i = 90; i > 0; i--) {


            if (i % 12 == 0) {
                toplam += i;

                System.out.println(i + "sayisi 12'e tam bolunur.");
            }


        }
        System.out.println("toplam:" + toplam);

    }
}
