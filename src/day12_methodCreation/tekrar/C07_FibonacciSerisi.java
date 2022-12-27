package day12_methodCreation.tekrar;

public class C07_FibonacciSerisi {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 ........

        fobonaccidenSayiYazdir(16);

    }
    public static void fobonaccidenSayiYazdir(int adet){
        // Kullanicinin girdigi sayi 0 veya negatifse

        if (adet<=0){
            System.out.println("gecersiz giris");
        } else if (adet==1) {
            System.out.println("0");

        } else if (adet==2) {
            System.out.println("0 1");

        }else {

            int  sayi1=0;
            int sayi2=1;
            int sayi3=0;
            System.out.println("0 1 ");
            for (int i = 3; i <=adet ; i++) {
                sayi3=sayi1+sayi2;
                System.out.println(sayi3+ " ");
                sayi1=sayi2;
                sayi2=sayi3;
            }


        }
    }
}
