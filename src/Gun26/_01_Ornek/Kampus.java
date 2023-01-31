package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu

        Ogrenci ogr = new Ogrenci();

        ogr.okulNo =1;
        ogr.tamAd= "ISmet Temur";


        // 1. yontem
        ogr.okulu= new Okul();
        ogr.okulu.adi= "Mehmet Akif Ersoy Okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti= 50000;


        // 2. yontem                   //  bu yontem daha kolay benim icin
        Okul okull = new Okul();
        okull.adi= "Mehmet Akif Ersoy Okulu";
        okull.mudurAdi= "Merve Aslan";
        okull.ucreti=50000;
        ogr.okulu = okull;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("ogr.okulu = " + ogr.okulu);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr.okulu.ucreti = " + ogr.okulu.ucreti);

    }
}
