package ODEVLER.digerOdevler;

public class odev_28_11_2022 {
    public static void main(String[] args) {

        // Aşağıdaki tüm sorularda sayı okutuldukdan sonra sayı formatı ile çözmeye çalışalım, yani Stringe çevirerek değil.
        // elbette daha sonra String çevirimi ile de çözebilirsiniz.

        // 1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

       /*Scanner read= new Scanner(System.in);

        int given;
        int count= 0;
        int total= 0;

        while ( count < 20) {

            System.out.print( count+1 + ".sayiyi giriniz= ");
            given= read.nextInt();

            if (given % 2 == 1 ) // bir sayiin
                total= total+given;

            count++;
        }
        System.out.println("Total= " + total);
        System.out.println("finish");*/

        // 2.yol

        /*Scanner input = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;
        while(sayac <= 20){
            System.out.print(sayac+".Sayıyı giriniz = ");
            int sayi = input.nextInt();
            if(sayi % 2 != 0) {
                toplam += sayi;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);*/


        /* -------------------------------------------------------- */

        // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        /*Scanner read = new Scanner(System.in);

        int genelGenelSayac = 0;
        int sayacTekSAyilar = 0;

        while (genelGenelSayac < 5) {

            System.out.print(genelGenelSayac + 1 + ".sayiyi giriniz= ");
            int sayi = read.nextInt();

            if (sayi % 2 == 1)
                sayacTekSAyilar++;
            genelGenelSayac++;
        }
            System.out.println("Yazdiginiz sayilardan tek sayi olanlarin toplam sayisi= " + sayacTekSAyilar);*/

        // 2.yol

        /*Scanner input = new Scanner(System.in);
        int s1 = 1;
        int s2 = 0;
        while(s1 <= 20){
            System.out.print(s1+".Sayıyı giriniz = ");
            int sayi = input.nextInt();
            if(sayi % 2 != 0) {
                s2++;
            }
            s1++;
        }
        System.out.println("tek sayıların adeti = " + s2);
        */


        /* -------------------------------------------------------------------- */

        // 3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.


        /*Scanner read= new Scanner(System.in);
        System.out.print("kac sayi girmek istediginizi lutfen konsola yaziniz= " );

        int kacSayiGirilecek= read.nextInt();
        int sayac=1;
        int toplam=0;

        while( sayac <= kacSayiGirilecek){

            Scanner read2= new Scanner(System.in);
            System.out.print("simdi sayilari yaziniz= ");

            int girilenSayilar = read2.nextInt();

            if (sayac == girilenSayilar);

            toplam= toplam + girilenSayilar;
            sayac++;

        }

        System.out.println("Toplam= " + toplam);
*/

        // 2.yol

        /*Scanner read= new Scanner(System.in);
        System.out.print("kac sayi girmek istediginizi lutfen konsola yaziniz= " );

        int kacSayiGirilecek= read.nextInt();
        int sayac=0;
        int toplam=0;

        do {
            Scanner read2= new Scanner(System.in);
            System.out.print("simdi sayilari yaziniz= ");

            int girilenSayilar = read2.nextInt();

            toplam= toplam + girilenSayilar;

            sayac++;

        }  while(sayac != kacSayiGirilecek);

            System.out.println("Toplam= " + toplam );

        }*/


        /* -------------------------------------------------------------------- */


        // 4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        /*Scanner read = new Scanner(System.in);

        int count = 1;
        int total = 0;

        while (count <= 5) {

            System.out.print( count + ".sayiyi giriniz= ");
            int given= read.nextInt();

            if (given > 10 && given < 30)
                total= given+total;

            count++;
        }

        System.out.println(" 10 ile 30 arasindaki sayilarin toplami=" + total);
*/

        // 2.yol

      /*  Scanner read = new Scanner(System.in);

        int count = 0;
        int total = 0;

        do {

            System.out.print(count+1 + ".sayiyi giriniz= ");
            int given = read.nextInt();

            if (given > 10 && given < 30)
                total = given + total;

            count++;

        }while (count != 5 );

        System.out.println(" 10 ile 30 arasindaki sayilarin toplami=" + total);*/

        /* -------------------------------------------------------------------- */

        // 5- 100 e kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        /*int sayac1 = 0;
        int sayac2 = 0;
        int sayac3 = 0;
        int sayi = 0;
        int toplam;

        do {
            sayi = sayi + 1;
            sayac1++;

            if (sayi % 5 == 0)  // sayinin 5 e bolumunden kalanlarla
                sayac2 = sayac2 + 1;

            if (sayi % 10 == 0)  //  10 a bolumunden kalanlari cikarirsak
                sayac3 = sayac3 + 1;
            toplam = sayac2 - sayac3;

        } while (sayac1 != 100);

        System.out.println("birler basamagi 5 olanlarin sayisi= " + toplam);*/

        // 2.yol

        /*int sayi = 0;
        int sayac = 0;
        while (sayi <= 100){
            if(sayi % 10 == 5 ){
                sayac++;
            }
            sayi++;
        }
        System.out.println("adet = " + sayac);*/

        /*--------------------------------------------------------------------*/

        // 6- Bir sayı bulmaca oyunu yapılmak isteniyor.
        // bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        // Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        // bilemediniz yazıp tutulan sayıyı bildirsin.
        // Eğer bilirse tebrikler yazsın.


        // hocam cozum tam olarak benim istedigim gibi profesyonel olmadi ama anca bu sekilde yapabildim.


        /*Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int randomSayi = (int) (Math.random() * (20 - 10)) + 10;

        System.out.println("bilgisayirin 10 ile 20 arasindaki tuttugu sayiyi bulmaya calisin");
        System.out.println("3 hakkiniz var");

        do {
            System.out.print(sayac + ".tahmininizi giriniz= ");
            int tahmin = oku.nextInt();

            if (tahmin == randomSayi) {
                System.out.println("tebrikler bildiniz");
                System.out.println("tutulan sayi" + " " + randomSayi + " idi"); break;}

             else if (tahmin != randomSayi && sayac != 3)
                System.out.println("hatali giris yaptiniz. lutfen tekrar deneyiniz");
             else
                System.out.println("bilemediniz hakkkiniz bitti.tutulan sayi" + " " + randomSayi + " idi");

             sayac++;

        } while (sayac != 4);*/

        // Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için
        // 7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        /*Scanner oku = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi giriniz= ");
        int sayi = oku.nextInt();    // 125

        int basamak;
        int sayac = 1;

        while (sayi > 0) {
            basamak = sayi % 10;
            System.out.println(sayac + " ler basamağı = " + basamak);

            sayi /= 10;    // sayi= sayi/10
            sayac *= 10;   // sayac= sayac*10
        }*/


        // 8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        /*Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        String sayi = oku.nextLine();
        int uzunluk = sayi.length();

        System.out.println("sayiniz " + uzunluk + " basamaklidir");*/

        // 2. yol
        // once kendim denedim ama yapamdim. sonra da internetten baktim.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi= oku.nextInt();

        int i=0;

        while ( sayi >0 ){

            sayi = sayi / 10;

            i++;
        }
        System.out.println(" girdiginiz sayi " + i + " basamaklidir");
*/
        // 3.yol
        // bunu kendim yaptim sayilir.

       /* Scanner oku1= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi1= oku1.nextInt();                    // 125

        int kalan;
        int counter= 0;

        while(sayi1 >0) {

            kalan = sayi1 % 10;                           //5
            sayi1 = (sayi1 - kalan) / 10;                 // 12

            if (sayi1 == 0) ;
            System.out.println("dongu bitti");

            counter++;
        }
            System.out.println("sayiniz" + counter + " basamaklidir");*/


        // 4.yol
        // bu yolu kendim yaptim.

        /*Scanner oku2= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi2= oku2.nextInt();

        int kalan2;
        int counter2= 0;

       do {

           kalan2= sayi2 % 10 ;
           sayi2= (sayi2 - kalan2) / 10;

           counter2++;

       } while (sayi2 > 0 );

        System.out.println("sayiniz " + counter2 + " basamaklidir");*/


        // 9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        String sayi= oku.nextLine();
        String yuzlerBasamagi= sayi.substring(0,1);
        String onlarBasamagi= sayi.substring(1,2);
        String birlerBasamagi= sayi.substring(2,3);

        System.out.println("tersten sayi= " +birlerBasamagi+onlarBasamagi+yuzlerBasamagi );*/

        // 2.yol

        /*Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = input.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");

        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi = sayi / 10;

        }*/

        // 3.yol

        /*Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = input.nextInt();
        int tersi = 0;

        while (sayi > 0){

            tersi *= 10;
            tersi += sayi % 10;
            sayi /= 10;
        }
        System.out.println("sayının tersi " + tersi);
*/


        // 10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

        // bir seyler karaladim ama tamamlayaamdim hocam. challenger patladi yani.


        /*Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = input.nextInt();
        int kontrol = sayi;
        int tersi = 0;
        while (sayi > 0){
            tersi *= 10;             // tersi = tersi*10
            tersi += sayi % 10;     // tersi= tersi+(sayi %10)
            sayi /= 10;
        }
        if (kontrol == tersi){
            System.out.println("sayı-> " + kontrol+ ", tersi-> " + tersi + " sayı simetrik");
        }else {
            System.out.println("sayı-> " + kontrol+ ", tersi-> " + tersi + " sayı simetrik değil");*/

        }
    }