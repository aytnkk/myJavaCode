package day09_stringManipuations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";

        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("j"));// false

        System.out.println(str.startsWith("Java mutluluktur"));//true

        System.out.println(str.startsWith(""));//true

        // baslangicinin neyle basladigini onemsiyor

        System.out.println(str.startsWith("mutlu",5));// 5.ci index ve sonrasi mutlu
        // ile mi basliyor diye soruyor// true

        System.out.println(str.startsWith("va",2));// true


    }
}
