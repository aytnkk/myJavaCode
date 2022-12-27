package day11_forLoops.day11_ornek;

public class C12_Nestedforloop {
    public static void main(String[] args) {


     /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */

        int input = 5;
        for (int i =1; i <=input ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
        for (int i =input-1; i <=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }

    }

}
