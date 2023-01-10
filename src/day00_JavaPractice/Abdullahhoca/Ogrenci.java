package day00_JavaPractice.Abdullahhoca;

public class Ogrenci {
    /*
    ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
   1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR.
   KAYITLARDA ŞU BİLGİLER OLMALIDIR:
	-AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.
    2. ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK İÇİN,
 NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */

    private String ad;
    private String sAd;
    private String tcNo;
    private int yas;
    private int numara;
    private  String sinif;

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return
                "OGRENCININ ADI'" + ad + '\'' +
                "ÖGRENCININ SOYADI='" + sAd + '\'' +
                "ÖGRENCININ TC NUMARASI='" + tcNo + '\'' +
                "ÖGRENCININ YASI=" + yas +
                "ÖGRENCININ NUMARASI=" + numara +
                "ÖGRENCININ SINIFI='" + sinif + '\'' +
                '}';
    }

    public Ogrenci(String ad, String sAd, String tcNo, int yas, int numara, String sinif) {
        this.ad = ad;
        this.sAd = sAd;
        this.tcNo = tcNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getsAd() {
        return sAd;
    }

    public void setsAd(String sAd) {
        this.sAd = sAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }






    }

