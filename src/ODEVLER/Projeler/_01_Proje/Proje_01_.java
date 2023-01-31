package ODEVLER.Projeler._01_Proje;

import java.io.InputStream;

public class Proje_01_ {
    public Proje_01_(InputStream in) {

    }

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("isminizi giriniz: ");
        String girilenIsim = scan.nextLine();

        String isimIlkharf = girilenIsim.substring(0, 1).toUpperCase();
        System.out.println(isimIlkharf.toUpperCase() + girilenIsim.substring(1) + " Bey hosgeldiniz, simdi soyisminizi girer misiniz? ");
        System.out.print("soyisminiz: ");

        String soyIsim = scan.nextLine();
        System.out.println(isimIlkharf + girilenIsim.substring(1, girilenIsim.length()) + " " + soyIsim.toUpperCase().charAt(0) + soyIsim.substring(1));


        String girilenHarf;

        System.out.print("isminiz ve soyisminiz dogru ise 'Y' harfine basiniz: ");
        girilenHarf = scan.next();

        while (!girilenHarf.equalsIgnoreCase("y")) {

            System.out.print("Tercihinizi dogru yapmadiniz... Lutfen tekrar deneyin: ");
            girilenHarf = scan.next();
        }
        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");


        java.util.Scanner scanUsername = new java.util.Scanner(System.in);
        java.util.Scanner scanPassword = new java.util.Scanner(System.in);

        System.out.print("simdi kullanici adinizi belirleyin: ");
        String username = scanUsername.nextLine();

        System.out.print("simdi sifrenizi belirleyin: ");
        String password1 = scanPassword.nextLine();

        System.out.print("Sifrenizi tekrar giriniz: ");
        String password2 = scanPassword.nextLine();


        if (password1.equals(password2)) {
            System.out.println("Tebrikler... " +  "'" + username + "'" + " kullanici adiyla sisteme kayit oldunuz...");
        } else {

            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen sifrelerinizi tekrar yaziniz.");
            while (!password1.equals(password2)) {

                System.out.print("simdi 1. sifrenizi tekrar giriniz: ");
                password1 = scanUsername.nextLine();
                System.out.print("simdi 2. sifrenizi tekrar giriniz: ");
                password2 = scanUsername.nextLine();

                if (password1.equals(password2)) {
                    System.out.println("Tebrikler... " +  "'" + username + "'" + " kullanici adiyla sisteme kayit oldunuz...");
                break; }
                else
                    System.out.println("Yanlis veya hatali sifre giriyorsunuz, lutfen sifrelerinizi en bastan tekrar yaziniz.");
            }

        }
    }
}