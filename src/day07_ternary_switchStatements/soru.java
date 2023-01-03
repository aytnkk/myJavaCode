package day07_ternary_switchStatements;

public class soru {
    public static void main(String[] args) {

        /*
        kullanicidan bir rakam alip , bunu yaziyla yazdirin
         */

         char rakam='4';

         switch (rakam){
             case '1':
                 System.out.println("one");
                 break;
             case '2':
                 System.out.println("two");
                 break;
             case '3':
                 System.out.println("tree");
                 break;
             case '4':
                 System.out.println("four");
                 break;
             case '5':
                 System.out.println("five");
                 break;
             case '6':
                 System.out.println("six");
                 break;
             case '7':
                 System.out.println("seven");
                 break;
             case '8':
                 System.out.println("acht");
                 break;
             case '9':
                 System.out.println("neun");
             default:
                 System.out.println("gecersiz giris");
         }

    }
}
