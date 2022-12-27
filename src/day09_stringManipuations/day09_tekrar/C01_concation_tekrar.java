package day09_stringManipuations.day09_tekrar;

public class C01_concation_tekrar {
    public static void main(String[] args) {
        String str1="Java";
        String str2="candir";

        System.out.println(str1.concat(str2));
        System.out.println(str1.concat("").concat(str2));// arada bosluk birakip yazar
    }
}
