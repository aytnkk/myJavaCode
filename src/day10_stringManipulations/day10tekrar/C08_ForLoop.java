package day10_stringManipulations.day10tekrar;

public class C08_ForLoop {
    public static void main(String[] args) {


        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin
      int sayilarinToplami=0;

        for (int i =1; i <=100 ; i++) {
            System.out.print(i+" ");
            sayilarinToplami +=i;
        }


    }
}