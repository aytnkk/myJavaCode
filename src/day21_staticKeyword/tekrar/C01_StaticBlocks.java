package day21_staticKeyword.tekrar;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");
    }
    static {
        System.out.println("Static method calisti");
    }
    static {
        System.out.println("alttaki static block calisti");
    }


}
