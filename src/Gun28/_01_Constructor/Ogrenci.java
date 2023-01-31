package Gun28._01_Constructor;

public class Ogrenci {

    int ID;
    String ad;
    String soyad;
    int sinifi;


    public Ogrenci(){   // yapici metodlar: Constructor metodlar
        System.out.println("nesne olusturuldu");

        // nesne olusturulurken yapmak istediklerin icin burayi kullan

    }


    public Ogrenci ( int ID, String ad, String soyad, int sinifi){ // yapici

        this.ID=ID;  // this.ID: bu clasin ID si, ID local degisken parametre
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }

    public Ogrenci ( int ID, String ad, String soyad ){
     this ( ID, ad, soyad, 0);

//        this.ID=ID;
//        this.ad=ad;
//        this.soyad=soyad;
//        this.sinifi=sinifi;

    }
}

//    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//    buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//    yapıldığı metos ise Constructor yani yapıcı metodlar
