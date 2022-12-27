package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        java by pass value kullanir
        yani methodlar arasinda gonderilen variablelerin kendileri degil,
        valueleri diger methoda yollanir.
         */
        int fiyat=100;
        // fiyat uzerinden %10 indirim yapip ,indirimli fiyati donduren bir method olusturun

        System.out.println(indirimYap10(fiyat));//90  bu methodun fiyati

        System.out.println(fiyat);//100
        // bu fiyat ise mainin fiyati o yuzden karistiralamaz .
        // kendi mahalle cocugu
        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmsini istersek atama yapariz

        fiyat=indirimYap10(fiyat);
    }
    public static int indirimYap10(int fiyat){
        fiyat=fiyat*90/100;

        return fiyat;
    }
}
