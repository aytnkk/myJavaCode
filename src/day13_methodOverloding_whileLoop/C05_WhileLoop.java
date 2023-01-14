package day13_methodOverloding_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak uzere sayi alin ,
        // girilen sayilarin toplami 500 olur veya gecerse
        // "Bu kadar sayi yeter" deyip toplami yazdirin

        // bu soruyu illa forloop ile yapalim dersek
        // adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i =1; i <10000 ; i++) {
            System.out.println("toplamak uzere tamsayi giriniz");
            sayi=scan.nextInt();

            toplam += sayi;

            if (toplam>=500){
                System.out.println("Bu kadar sayi yeter.Toplamlari:" + toplam + "oldu");
                break;
            }
        }

        // whilelopp ile cozelim
        toplam=0;
        sayi=0;

        while (toplam<500){
            System.out.println("toplamak uzere tamsayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Bu kadar sayi yeter.Toplamlari:" + toplam + "oldu");
    }
}
