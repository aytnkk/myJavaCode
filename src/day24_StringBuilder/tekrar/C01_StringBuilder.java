package day24_StringBuilder.tekrar;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2);
        System.out.println(sb2.capacity());//11

        StringBuilder sb3=new StringBuilder("java candir");
        System.out.println(sb3);// java candir
        System.out.println(sb3.capacity());//27

        sb2.append("java");
        System.out.println(sb2);//java
        System.out.println(sb2.capacity());//11

        sb2.append("candir");
        System.out.println(sb2);//java candir
        System.out.println(sb2.capacity());//11


        sb2.append(".");
        System.out.println(sb2); // Java Candir.
        System.out.println(sb2.capacity()); // 24 = 2 * 11 +2

    }
}
