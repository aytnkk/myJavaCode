package day09_stringManipuations;

public class C02_contains {
    public static void main(String[] args) {


        String str="Java ogren, mutlu ol";

        // str mutlu iceriyor mu?

        System.out.println(str.contains("mutlu"));//true


        //charSequence=char dizisi

        System.out.println(str.contains("j"));// false
        System.out.println(" ");// true

        // contains metodu kac tane olduguna degil
        // sadece var olup olmadigina bakar

        System.out.println(str.contains("java") && str.contains("mutlu"));// true


    }
}
