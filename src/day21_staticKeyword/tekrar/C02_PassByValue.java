package day21_staticKeyword.tekrar;

public class C02_PassByValue {
    public static void main(String[] args) {

     int fiyat=100;

        System.out.println(indirimYap10(fiyat));//90
        System.out.println(fiyat);//100


      fiyat=indirimYap10(fiyat);

    }

    public static int indirimYap10(int fiyat) {

        fiyat=fiyat*90/100;
        return fiyat;
    }

}
