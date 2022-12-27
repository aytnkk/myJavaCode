package day10_stringManipulations.day10tekrar;

public class C13_forloop_soru {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin,
        // 1'den girilen sayiya kadar (girilen sayi dahil)7 ile bolunebilen sayilari yazdirin


        int input=22;
        int bitisSayi=input;
int bolunebilenSayilar=0;
        for (int i =1; i <=bitisSayi ; i++) {
            if (i%7==0){
                System.out.print(i +" ");
            }

        }



    }
}
