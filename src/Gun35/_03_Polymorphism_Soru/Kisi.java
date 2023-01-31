package Gun35._03_Polymorphism_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }
    public static void kimlikYaz(Kisi gelenKisi)  // static yazinca classa ait oluyor ve tekrardan yeni nir nesne olusturmamiza gerek kalmiyor
                                                  // static yapmazsak new ile yeni bir nesne olusturmak zorunda klacaktir
    {
        System.out.println("\n***** Kimlik Belgesi ****");
        System.out.println("ad = " + gelenKisi.getAd());
        System.out.println("soyad = " + gelenKisi.getSoyad());
        System.out.println("görevi = " + gelenKisi.getGorevi());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Şubesi:"+ ((Ogrenci)gelenKisi).getSubesi());
        // eger gelenKisinin Ogrenci tipinde ise ( cunku bilmiyorum ) ogrencinin subesini yaz

        else
        if (gelenKisi instanceof Calisan)
        // degilse eger gelenKisi Calisan tipinde mi ona bak, calisan tipinde ise calisan in departmanini yaz.

            System.out.println("Departmanı:"+ ((Calisan)gelenKisi).getDepartmani());
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }



}
