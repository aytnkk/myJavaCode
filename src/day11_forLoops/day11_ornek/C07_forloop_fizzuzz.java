package day11_forLoops.day11_ornek;

public class C07_forloop_fizzuzz {
    public static void main(String[] args) {
          /* Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin,
        sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        */


        int input=153;
        for (int i =1; i <=input ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizzz");

            } else if (i%5==0) {
                System.out.println("buzz");
            }else System.out.println(i+"");
        }
    }
}
