package day24_StringBuilder.tekrar;

public class D {
    private String isim = "Mustafa";
    public String isimDefault = "Furkan";
    public static String isimDefaultStatic = "Sevilay";

    public static void main(String[] args) {
        // System.out.println(isim); static olmadigindan, static main method icinde direk kullanilamaz
        day24_StringBuilder.D obj1 = new day24_StringBuilder.D();
        System.out.println(obj1.isim);
        staticMethod();
        System.out.println(obj1.isim);
    }

    private void staticOlmayanMethod() {
        isim = "Huseyin";
        System.out.println(isim);
    }

    public void defaultStaticOlmayanMethod() {
        System.out.println("default access modifier'li static olmayan method calisti");
    }

    public static void defaultStaticMethod() {
        System.out.println("default access modifier'li static method calisti");
    }

    private static void staticMethod() {
        day24_StringBuilder.D obj1 = new day24_StringBuilder.D();
        obj1.isim = "Zafer";
        System.out.println(obj1.isim);
    }
}