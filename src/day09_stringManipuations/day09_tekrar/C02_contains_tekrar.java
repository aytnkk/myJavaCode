package day09_stringManipuations.day09_tekrar;

public class C02_contains_tekrar {
    public static void main(String[] args) {

        String str="Java ogren, mutlu ol";

        // str mutlu iceriyor mu?

        System.out.println(str.contains("mutlu"));// true

        System.out.println(str.contains("j"));//false
        System.out.println(" ");// true

        System.out.println(str.contains("Java")&&str.contains("mutlu"));//true

    }
}
