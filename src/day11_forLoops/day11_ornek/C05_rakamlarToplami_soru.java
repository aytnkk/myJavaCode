package day11_forLoops.day11_ornek;

public class C05_rakamlarToplami_soru {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip,rakamlar toplamini yazdirin


        int sayi=15;

        int toplam=0;

        for (int i =0; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println("sayilarin toplami:"+toplam);

    }
}
