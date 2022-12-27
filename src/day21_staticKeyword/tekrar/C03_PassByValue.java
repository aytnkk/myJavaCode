package day21_staticKeyword.tekrar;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s=20;

        System.out.println(s);

method1();

    }
public static void method1(){
        method2(5);
        String s="hasan";
    System.out.println(s.toLowerCase());
}
public static void method2(int s){
        s=s*s;
    System.out.println(s);
}
}

