package day14_doWhileLoop_scope.tekrar;

public class C04_DoWhileloop {
    public static void main(String[] args) {

           /*  Soru 3- Kullanicidan bir pozitif sayi isteyin,
      sayının tam kare olup olmadığını bulunuz,
      tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4

       */

        int input=36;
        int kareKok=1;
        boolean sonuc=false;

        while (kareKok*kareKok<=input){
            if (kareKok*kareKok==input){
                System.out.println("girilen sayinin karekoku:" + kareKok);
                sonuc=true;
                break;
            }else{
                kareKok++;
            }
        }
        System.out.println(sonuc);

        // do while loop ile yapalim
        input = 36;
        kareKok = 1;
        sonuc = false;
        do {
            if (kareKok*kareKok==input){
                System.out.println("girilen sayinin karekoku:" + kareKok);
                sonuc=true;
                break;
            }else{
                kareKok++;
            }
        }
        while (kareKok*kareKok<=input);
        System.out.println(sonuc);
    }
}
