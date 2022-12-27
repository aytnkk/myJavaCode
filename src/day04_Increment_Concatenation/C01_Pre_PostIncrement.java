package day04_Increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {


        int sayi=20;
        // sayiyi 3 arttirin

        sayi=sayi +3;
        sayi +=3;
        sayi ++;
        sayi ++;
        sayi ++;

        System.out.println(sayi);//29

        // sayini degerini 2 azaltin

        sayi=sayi-2;
        sayi -= 2;
        sayi --;
        sayi --;
        System.out.println(sayi);//23

        // sayinin degerini 1 azaltin ve yazdirin

        sayi --;
        System.out.println(sayi);//9
        // bu islemde ekranda gordugumuz 9 ,sayinin degeri 9

        sayi=10;
        // sayiyi once yazdirin sonra ,sonra 1 azaltin

        System.out.println(sayi);//10
        sayi--;

        // ekranda gorulen 10, ama sayinin son degeri 9

        System.out.println(sayi);//9


        sayi=10;
        System.out.println(sayi++);//10
        // java ayni satirda iki islem oldugundan siralama yapar
        // eger ++ variableden sonra ise arttirma islemini sonra yapar
        //bu durumda once yazdirma sonra arttirma islemi yapar


        System.out.println(sayi);//11


        sayi=10;
        System.out.println(++sayi);//11
        // ++ variableden once ise artirma islemini once yapar
        // bu durumda java once artirma sinra yazdirma islemi yapar

        System.out.println(sayi);//11




    }
}
