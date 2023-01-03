package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        //bu metindeki sayilardan kurtulalim

        String str="Ja1va 56Guz,zel-dir";
        System.out.println(str.replace("1","")
                .replace("5","").replace("6",""));


        str="Ja1va4 567Gu,z9el-d0ir8";
        /*
        replace()zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
        eger genellemeyi  butun sayilari ,butun spaceleri, butun ozel karakterleri
        gibi genisletmek istersek replace() yerine replaceAll kullaniriz
        Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlanmistir
        butun \\d: butun digitler:sayilar
         */


        str=str.replaceAll("\\d","");
        System.out.println(str);

        // ozel karakterlerden de kurtulalim
        // space de ozel karakter oldugundan bu durumda space'nin yok olmamasi icin
        //once space yerine metinde olmayan bir deger atayalim

        //digits sayi demektir rakamlar

        str=str.replace(" ","5");

        str=str.replaceAll("\\W","");// javaGuzeldir
        str=str.replaceAll("5"," ");
        System.out.println(str);


        // buradaki harf sayisini bulun
        String input3="Ali Can,Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());//22


    }
}
