package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi=10;
        int toplam=0;

        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("lutfen toplamak icin bir tamsayi giriniz");
            girilenSayi=scan.nextInt();

            toplam +=girilenSayi;

        }
        System.out.println("Girilen sayilarin  toplami: " + toplam);
        /*
        While loopun iki tane negatif yonu vardir
        1-loop'tan once olusturdugumuz ve loop'da kullanacagimiz variablelere yanlis bir deger verirsek,
        loop body'si hic calismayabilir
         2- loop condition'i loop body'sinden bir kez fazla calisir
            bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
            ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz


         */
    }
}
