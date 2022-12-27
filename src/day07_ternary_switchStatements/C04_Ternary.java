package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        // kullanicidan alinan  deger
        // 100'den buyukse sayiyi 2 ile capin
        // 100'den kucukse sayiya 10 ekleyin


        int input=145;

        // if else ile yapalim

        if (input>100){
            input*=2;

        } else  {
            input+=10;

        }
        System.out.println("if else ile: "+input);

        // ternary ile yapilirsa

        input=145;
        input=input>100 ?input*2:input+10;
        System.out.println("ternary ile:"+input);
        /*
        verilen input'u inceleyin eger 100'den buyukse bunu 5'e bolup ,
       bolum sonucunun tek sayi olup olmadigini kontrol edin
       eger 100'den buyuk degilse , 10 ile bolumunden kalani bulup ,
       bu kalani 5 arttirin


       not: bu tur sorulari ternary ile yapmayiz


         */

    }
}
