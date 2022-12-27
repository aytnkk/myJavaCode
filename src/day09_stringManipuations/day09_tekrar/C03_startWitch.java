package day09_stringManipuations.day09_tekrar;

public class C03_startWitch {
    public static void main(String[] args) {
     // starwitch stringin verilen degerle baslayip baslamadigini kontrol eder
        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("j"));//false
        System.out.println(str.startsWith("Java mutluluktur"));// true
        System.out.println(str.startsWith(" "));// true
        System.out.println(str.startsWith("mutlu",5));// true//5.index ve sonrasi mutlu ile mi bitiyor diye soriyor

        System.out.println(str.startsWith("va",2));// true
    }

}
