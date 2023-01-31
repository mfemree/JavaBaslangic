package free.freeler;

import java.util.Scanner;

public class free2 {
    public static void main(String... args) {
        int puan=0;
        System.out.println("lütfen bir not giriniz: ");
        Scanner sc= new Scanner(System.in);
        String sonuc;
        puan=sc.nextInt();
        if (puan>90){
            sonuc="AA ADAMSIN";}
        else if(puan>=80){
            sonuc="BA GUZELL";}
        else if(puan>=70){
            sonuc="BB YANII";}
        else if(puan>=60){
            sonuc="CC GECTİN";}
        else if(puan>=50){
            sonuc="DD";}
        else {
            sonuc="ne mal adamsın dersten kaldın";}
        System.out.println("sonuc:  "+sonuc);
    }
}