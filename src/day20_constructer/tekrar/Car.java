package day20_constructer.tekrar;

public class Car {


    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int km;
    String renk="Renk secilmedi";

    public Car(String model, String marka, int km, String renk) {

        this.marka=marka;
        this.model=model;
        this.km=km;
        this.renk=renk;



    }

    public Car() {

    }

    public Car(String marka, String model, int yil) {

        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }

    public Car(String mrk,String mdl,int yl,int kmetre,String rnk){
       marka=mrk;
       model=mdl;
       yil=yl;
       km=kmetre;
       renk=rnk;


}

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }
}
