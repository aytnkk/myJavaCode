package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin
        // ve kullaniciya istedigi islemi sorun
        // +,- ,* ve / isaretlerinden  hangisini girerse
        // 2 sayi icin o islemi yapin
        // bu isaretlerden birini girmezse
        // "yanlis islem tercihi "yazdirin

        int sayi1=20;
        int sayi2=10;

        char islem='-';

        // if else ile yapalim

        if (islem=='+'){
            System.out.println("sayilarin toplami:"+(sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Sayilarin farki :"+(sayi1-sayi2));

        }else if (islem=='*'){
            System.out.println("sayilarin carpimi :"+sayi1*sayi2);
        } else if (islem=='/') {
            System.out.println("sayilarin bolumu :"+sayi1/sayi2);

        }else{
            System.out.println("yanlis islem tercihi");
        }

        // SWITCH statements ile yapalim
        System.out.println("===============================");

        switch (islem){
            case'+' :
                System.out.println("sayilarin toplami:"+(sayi1+sayi2));
                break;
            case'-':
                System.out.println("Sayilarin farki :"+(sayi1-sayi2));
                break;
            case '*':
                System.out.println("sayilarin carpimi :"+sayi1*sayi2);
                break;
            case'/':
                System.out.println("sayilarin bolumu :"+sayi1/sayi2);
                break;
            default:
                System.out.println("yanlis islem tercihi");



        }


    }
}
