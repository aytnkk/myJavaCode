package day34_Maps_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
/*
    Asagidaki bod'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
            "checkin" : "2021-06-01",
                    "checkout" : "2021-06-10"
        },
            "additionalneeds" : "wi-fi" }

 */
        Map<String,String> bookingdatesMap=new HashMap<>();

        bookingdatesMap.put("checkout" , "2021-06-10");
        bookingdatesMap.put(  "checkin" ,"2021-06-01");

        Map<String,Object> bookingMap=new HashMap<>();
        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put( "lastname" , "Bulut");
        bookingMap.put(   "totalprice" ,500);
        bookingMap.put( "depositpaid" ,false);
        bookingMap.put( "bookingdates" ,bookingdatesMap);
        bookingMap.put( "additionalneeds" , "wi-fi");

        System.out.println(bookingMap);

        // isim bilgsini yazdiralim

        System.out.println(bookingMap.get("firstname"));// ahmet

        // additionalneeds yazdirn
        System.out.println(bookingMap.get("additionalneeds"));//wi-fi

        //check-in bilgisini yazdirin
        // boooking mapindeki value data turu object sectik
        //dolayisiyla bookingdates key'ine ait value'yi object olarak sectik
        // ama biz onun map oldugunu biliyoruz
        // casting yapabiliriz

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));//2021-06-01

       // check-out tarihini yazdiralim

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout"));//2021-06-10

    }
}
