package day11_forLoops.day11_ornek;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        int input=4737;
        String sonuc="Asal sayi";
        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                sonuc="Sayi asal degil";
                break;
            }
        }
        System.out.println(sonuc);


    }
}
