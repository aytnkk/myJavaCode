package day00_ahmetHocaDersleri.day21_Arrays;

public class yenilenenKarakteriDondurme {
    public static void main(String[] args) {


        /*
        Soru 30-)
         Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
         ( mülakat sorusu )
         Örnek:
         String str="Javacokkolay"
         Yinelenen karakterler : [a, o, k]
         İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp
            konteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
         */

        String str="Javacokkolay";



        YinelenenKarakterler(str);
    }

    private static void YinelenenKarakterler(String str) {

        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <=(i) ; j++) {
                String[] ynlnKrktr=new String[0];

            }
        }
    }
}
