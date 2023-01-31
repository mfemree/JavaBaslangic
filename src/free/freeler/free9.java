package free.freeler;

public class free9 {
    public static void main(String[] args) {

        // 0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        // 4-9 arası nasıl ürettirirdim?
        // Yöntem şu : önce aralık arasindaki fark kadar uretirdik yeni (9-4) arasi, yani 0-5 arasi uretiyor.
        // sonra uretilmis sayıya min sayıyı ekleriz, uretimis sayi + 4
        //  (int)(Math.Random()*(max-min))+min

        //Girilen max ve min aralığında random sayı ürettiririniz.


        // girilen max ve min araliginda random sayi uretiniz

        /*Scanner oku= new Scanner(System.in);
        System.out.print("min sayi= ");
        int minSayi= oku.nextInt();

        System.out.print("max sayi= ");
        int maxSayi= oku.nextInt();

        int randomSayi= (int) (Math.random()*( maxSayi-minSayi)) +minSayi;

        System.out.println("tahmininiz= " + randomSayi);*/

        /*--------------------------------------------------------------------*/

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("sayi1 giriniz= ");
        int sayi1= oku.nextInt();

        System.out.print("sayi2 giriniz= ");
        int sayi2= oku.nextInt();

        System.out.println("toplama icin T");
        System.out.println("cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");
        System.out.print("Seciniz= ");

        Scanner oku2= new Scanner(System.in);
        String secim= oku2.next();

         if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam= " + (sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("C"))
                System.out.println("Fark= " + (sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Carpim= " + (sayi1 *sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bolme= " + sayi1/sayi2);
                    else
                        System.out.println("yanlis secim");*/


        // 2. yontem

       /* boolean varMi  = secim.contains("T");
        boolean varMi2 = secim.contains("t");

        if (secim.contains("t") && secim.contains("T"))
            (varMi == true && varMi2 == true)

                 System.out.println("Toplam= "+ (sayi1+sayi2));
        else System.out.println("yanlis secim");


           secim.replaceFirst("t", "T");
        }
        else
            if( varMi == true)

        System.out.println("Toplam= "+ (sayi1+sayi2));
        else
        if ( varMi == true)
            System.out.println("Fark= " + (sayi1-sayi2));
        else
            if ( varMi == true)
            System.out.println("Carpim= " + (sayi1 *sayi2));
            else
        if ( varMi == true)
            System.out.println("Bolme= " + sayi1/sayi2);
        else System.out.println("yanlis secim");*/


/* -------------------------------------------------------------- */

        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("ders ve notunuzu giriniz= ");
        String dersVeNot= oku.nextLine();

        int index= dersVeNot.indexOf(":");
        String not= dersVeNot.substring(index+1);
        int sayiNot= Integer.parseInt(not);

        // ya da  int sayiNot= Integer.parseInt(dersVeNot.substring(index+1));
        // ya da int sayiNot= Integer.parseInt(dersVeNot.replaceAll("[^0-9]",""));

        if (sayiNot >= 90)
            System.out.println("A");
        else
            if (sayiNot >= 80)
        System.out.println("B");
            else
                if (sayiNot >= 70)
        System.out.println("C");
                else
                if (sayiNot >= 60)
                    System.out.println("D");
                else
                if (sayiNot >= 40)
                    System.out.println("E");
                else
                if (sayiNot < 40)
                    System.out.println("Kaldiniz");
*/
/*
        ----------------------------------------------------------------------------
*/

        // kullanicinin girdigi gun numarasina karsilik gelen gunun adini yaziniz.

       /* Scanner oku = new Scanner(System.in);
        System.out.print("Bir gun sayisi giriniz= ");
        int gun = oku.nextInt();

        if (gun == 1)
            System.out.println("pazartesi");
        else if (gun == 2)
            System.out.println("sali");
        else if (gun == 3)
            System.out.println("carsamba");
        else if (gun == 4)
            System.out.println("persembe");
        else if (gun == 5)
            System.out.println("cuma");
        else if (gun == 6)
            System.out.println("cumartesi");
        else if (gun == 7)
            System.out.println("pazar");
        else
            System.out.println("yanlis sayi girdiniz");*/

        // 2.yol

     /*   switch (gun) {

            case 1:
                System.out.println("pazaresi"); break;
            case 2:
                System.out.println("sali"); break;
            case 3:
                System.out.println("carsamba"); break;
            case 4:
                System.out.println("persembe"); break;
            case 5:
                System.out.println("cuma"); break;
            case 6:
                System.out.println("cumartesi"); break;
            case 7:
                System.out.println("pazar"); break;
            default:
                System.out.println("yanlis numara girdiniz"); // case lerin disindakiler } */

/*
                ----------------------------------------------------------------------------
*/
                // Daha önce çözdüğünüz hesap makinesi sorusunu,
                // switch ile çözünüz.

                // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
                // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
                // harflerini alarak isteğe uygun olan işlemi yaptırıp
                // sonucu yazdırınız.

        /*Scanner oku = new Scanner(System.in);
        System.out.print("sayi1 giriniz= ");
        int sayi1 = oku.nextInt();

        System.out.print("sayi2 giriniz= ");
        int sayi2 = oku.nextInt();

        System.out.println("toplama icin T");
        System.out.println("cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");
        System.out.print("Seciniz= ");

        Scanner oku2 = new Scanner(System.in);
        String secim = oku2.next();

        secim = secim.toUpperCase();

        switch (secim) {

            case "T":
                System.out.println("Toplam= " + (sayi1 + sayi2));
                break;

            case "C":
                System.out.println("Fark= " + (sayi1 - sayi2));
                break;

            case "P":
                System.out.println("Carpim= " + (sayi1 * sayi2));
                break;

            case "B":
                System.out.println("Bolum= " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("yanlis harf girdiniz"); } */

/*
        ------------------------------------------------------------------
*/
        // girilen bir sayinin birler basamaginin degerini yazi ile yazdiriniz.
        // 234 -> birler basamagi -> 4

        /*Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = oku.nextInt();

        int birlerBasamagi = (sayi % 10);

        switch (birlerBasamagi) {

            case 1:
                System.out.println("girdiginiz sayinin birler basamagi= bir");
                break;

            case 2:
                System.out.println("girdiginiz sayinin brler basamagi= iki");
                break;

            case 3:
                System.out.println("girdiginiz sayinin brler basamagi= uc");
                break;

            case 4:
                System.out.println("girdiginiz sayinin brler basamagi= dort");
                break;
            case 5:
                System.out.println("girdiginiz sayinin brler basamagi= bes");
                break;

            case 6:
                System.out.println("girdiginiz sayinin brler basamagi= alti");
                break;

            case 7:
                System.out.println("girdiginiz sayinin brler basamagi= yedi");
                break;
            case 8:
                System.out.println("girdiginiz sayinin brler basamagi= sekiz");
                break;
            case 9:
                System.out.println("girdiginiz sayinin brler basamagi= dokuz");
                break;
            case 0:
                System.out.println("girdiginiz sayinin brler basamagi= sifir");
                break;
                }
*/




        }



        }



