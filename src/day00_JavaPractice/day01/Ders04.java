package day00_JavaPractice.day01;

public class Ders04 {
    public static void main(String[] args) {
        /*
        Soru 15-)
Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
         isim2= ali
	 Konsol => maalisa
         */

        String name1 = "meryem";
        String name2 = "senem";

        if (name1.length() % 2 == 0) {

            String name11 = name1.substring(0, name1.length() / 2).concat(name2).concat(name1.substring(name1.length() / 2));
            System.out.println(name11);

        } else {
            System.out.println("Name2 cannot be inserted in the name1");
        }
    }
}
