package ODEVLER.digerOdevler;

public class odev_05_12_2022 {
    public static void main(String[] args) {

//        1) Bu String'i oluşturun. "Removes white space from both ends of a string"
//           String'deki kelime sayısını yazdırınız.


//        String cumle = "Removes white space from both ends of a string";
//
//        int boslukSayisi = 0;
//
//        for (int i = 0; i < cumle.length(); i++) {
//
//            if (cumle.charAt(i) == ' ') {
//                boslukSayisi++;
//
//            }
//            System.out.print("cumlenin kelime sayisi= " + (boslukSayisi + 1));
//        }

            // 2.yol

//            String str = "Removes white space from both ends of a string";
//
//            String[] str1 = str.split(" ");
//            System.out.println("phrase/kelimelere ayrilmis hali/array= " + Arrays.toString(str1));
//            System.out.print("kelime sayisi= " + str1.length);


//        2) Bir String oluşturun : "Hello World"
//           Stringi tersten yazdırın ve print edin.
//           Cevap böyle olmalı :  "dlroW olleH"

//        String cumle = "Hello World";
//
//        System.out.print("tersten yazilis= ");
//
//        for (int i = cumle.length() - 1; i >= 0; i--) {
//
//            System.out.print(cumle.charAt(i));
//        }
//        System.out.println();

        // 2. yol

//        char [] str= new char[cumle.length()];
//
//        for (int i = 0; i<str.length; i++) {
//
//            str[i]= cumle.charAt((str.length-1)-i );
//        }
//        System.out.println(Arrays.toString(str));

//        3- İnt Array oluştur ve elemanları   : 25,30,30,35,100
//           Array in elemanlarının toplamını yazdır.
//           Cevap 220 olmalı.

//        int[] array= {25 , 30 , 30 , 35 , 100};
//
//        int toplam=0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            toplam+=array[i];   // toplam= toplam + array[i];
//
//        }
//        System.out.print("toplam= " + toplam);

//        4- int Array oluşturun
//           elemanları : 13, 15,14,16,16
//           Arrayin elemanlarını yazdırın.

//        int[] array1= {13, 15, 14, 16, 16};
//
//        for (int i = 0; i < array1.length; i++) {
//
//            System.out.println(i + ". sayi= " + array1[i]);
//        }

//        5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//           Array'daki eleman sayısını yazdırınız.
//           Cevap 4 olmalı.

//        String[] array3= {"new jersey" , "new york" , "boston" , "California"};
//
//        for (int i = 0; i < array3.length ; i++) {
//
//            System.out.println( i + ".eleman= " + array3[i]);
//        }
//            System.out.println("\n" + "toplam eleman sayisi= " + array3.length );


//        6- String Array (Dizi) oluşturunuz
//           elemanları : Apple, Orange , Babana, Kiwi
//           Array'leri tüm elemanları yazdırınız.

//        String[] array4= {"Apple" , "Orange" , "Babana" , "Kiwi"};
//
//        for (int i = 0;  i< array4.length ;  i++) {
//
//            System.out.println(i + ".indexteki kelime= " + array4[i]);
//
//        }

//       7- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//          Array'in ortalamasını alınız.

//        int[] array5= {12, 14, 21, 23, 10, 4};
//
//        int toplam=0;
//
//        for (int i = 0; i <array5.length; i++) {
//
//           toplam= array5[i] + toplam;
//
//        }
//        int ort= toplam/ array5.length;
//        System.out.println("ortalama= " + ort);


//        8- int Array oluşturun ve elemanları : 5,6,8,12,14,19
//           Eğer sayı çiftse topla, tekse çıkar
//           **Örneğin:**
//           **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//           Toplamlarını yazdırın.

//        int[] array6 ={5, 6, 8, 12, 14, 19};
//
//       int toplam=0;
//
//        for (int i = 0; i < array6.length; i++) {
//
//            if (array6[i] % 2 == 0) {
//                toplam+=array6[i];
//            }
//            else
//                toplam-=+ array6[i];
//
//        }
//        System.out.println("toplam= " + ( toplam));


//        9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//           Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
//
//        int[] array7 = {15, 25, 22, 18, 30};
//
//        Arrays.sort(array7);
//        System.out.println("sorted array7= " + Arrays.toString(array7));
//
//        int theSecondBiggest = array7[array7.length - 2];
//        System.out.println("theSecondBiggest  = " + theSecondBiggest);


        // 2.yol

//        int[] array7 = {15, 25, 22, 18, 30};
//
//        int max1=0;
//        int max2=0;
//
//        for (int i = 0; i <array7.length ; i++) {
//
//            if (array7[i] > max1){
//                max2 = max1;
//                max1 = array7[i];
//        }else
//                if (array7[i] > max2){
//                    max2= array7[i];
//                }
//        }
//
//        System.out.println("ikinci en buyuk sayi= " + max2);

            // 3.yol
            // internetten baktim

//        int[] array7 = {15, 25, 22, 18, 30};
//        int temp;
//
//        for (int i = 0; i < array7.length; i++) {
//
//            for (int j = i + 1; j < array7.length; j++) {
//
//                if (array7[i] > array7[j]) {
//                    temp = array7[i];
//
//                    array7[i] = array7[j];
//                    array7[j] = temp;
//                }
//            }
//        }
//        System.out.println(array7[array7.length-2]);
//
//        }


//        10-  int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//             En küçük (minimum) sayıyı yazdırınız.

//        int[] diziler = {14, 19, 5, 21};
//
//        Arrays.sort(diziler);
//        System.out.print("sayilarin dizilimi= " + Arrays.toString(diziler) + "\n");
//        System.out.print("en kucuk sayi= " + Math.min(diziler[0], diziler[diziler.length - 1]));

        // 2.yol

//        int[] diziler = {14, 19, 5, 21};
//
//        int min = diziler[0];
//
//        for (int i = 0; i < diziler.length ; i++) {
//
//            if ( diziler[i] < min ){
//                 min = diziler[i];
//            }
//        }
//        System.out.println("en kucuk sayi= " + min);


//        11- int Array oluşturun ve elemanları : 12,2,5,15,8
//            En büyük değeri yazdırınız.

//        int[] array9 = {12, 2,5,15,8 };
//
//        Arrays.sort(array9);
//        System.out.print("Sayilar dizilimi= " + Arrays.toString(array9) + "\n");
//        System.out.println("en buyuk sayi= " + Math.max(array9[0],array9[array9.length-1]));

//        int[] array9 = {12, 2,5,15,8 };
//
//        int max= array9[0];
//
//        for (int i = 0; i < array9.length ; i++) {
//
//            if (  array9[i] > max)
//                  max = array9[i];
//        }
//        System.out.println("max= " + max);


//            12 - String array oluşturun ve elemanları :Apple, Orange, Banana, Pineapple
//            Apple elemanının bu Array 'a ait olup olmadığını kontrol edin.
//            Eğer aitse "true" çevirin.
//            Loops(döngüler) kullanın.

//            String[] array = {"Apple", "Orange", "Banana", "Pineapple"};
//            String oneWordOfArray = "Apple";
//
//        boolean isThere = true;
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i].equalsIgnoreCase(oneWordOfArray)) ;
//            {
//                System.out.println(isThere);
//                break;
//            }
//        }


//        13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
//            $ işaretlerini kaldırın ve sayıları toplayın.
//            Sayıların toplamını yazdırın.

            // devamini yapamadim

        String text = "$12 $23 $10 $2 $5 $2";

        String[] arr= text.split(" "); // bosluklardan arindirilmis hali


        int toplam=0;

        for (int i = 0; i <arr.length; i++) {

            // System.out.println(arr[i]);     // bosluklardan arindirilmis halii yazdirmak istersek

            arr[i]= arr[i].replace("$", "");  // dolarlarin bosluk yapildigi hal

            System.out.println(arr[i]);        // bosluksuz ve dolarsiz halini yazdirmak istersek
            toplam= toplam + Integer.parseInt(arr[i]);

        }

        System.out.println("toplam= " + toplam);


        }

    }
