package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren,adana ye";
        System.out.println(str.replace('a', 'A'));// Java ogren, AdAnA ye

        System.out.println(str.replace(" ",""));// Javaogren, adanaye

        System.out.println(str.replace("Java","Yazilim"));// Yazilim ogren ,adana ye

           String telefon="555 6554 755555";
        System.out.println(str.replace("555","435"));// 435 6554 ....
        System.out.println(telefon.replace('5','9'));




        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin

        String sonuc="1-16 of over 100,000 results for \"apple\"";
        int indexOver=sonuc.indexOf("over");
        int indexResults= sonuc.indexOf("results");

        String sonucSayisiStr= sonuc.substring(indexOver+4, indexResults-1);

       System.out.println(sonucSayisiStr);// 100,000

        sonucSayisiStr=sonucSayisiStr.replace(",","");
        System.out.println(sonucSayisiStr);//100000



    }
}
