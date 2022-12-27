package day13_methodOverloding_whileLoop.tekrar;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //  2 basamakli sayilardan 7 ile bolunebilenleri yazdirin


        for (int i =10; i <100 ; i++) {
            if (i%7==0){
                System.out.println(i + " ");
            }
        }
        System.out.print("");

        // ayni soruyu whileloop ile yapalim

        int sayi=10;
        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+ " ");
            }
            sayi++;
        }
        // forloop ile yapilabilecek bir soruyu while loop ile yapmak biraz zahmetli
    }
    }
