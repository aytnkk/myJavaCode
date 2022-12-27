package day00_ahmetHocaDersleri.day21_Arrays;

public class dogalSayilarinToplmami {
    public static void main(String[] args) {

        /*
        Soru29-)
          1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
          İpucu: Loop kulanabilirsiniz

         */


        int toplam=0;

        dogalSayilarinToplami(toplam);
        }

    private static void dogalSayilarinToplami(int toplam) {
        int toplam1=0;

        for (int i = 1; i <=100 ; i++) {
            toplam +=i;
    }


        System.out.println(toplam);


    }
}
