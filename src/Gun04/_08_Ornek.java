package Gun04;

public class _08_Ornek {

    public static void main(String[] args) {

        // String olarak verilen 2 adet bagis parasinin toplamini yazdiriniz.

        String bagis1 = "500";
        String bagis2 = "1500";

        int sayiBagis1 = Integer.parseInt(bagis1);
        int sayiBagis2 = Integer.parseInt(bagis2);
        int toplamBagis = (sayiBagis1 + sayiBagis2);

        System.out.println(bagis1 + bagis2); // 5001500 yazar
        System.out.println("sayiBagis1 = " + sayiBagis1);
        System.out.println("sayiBagis2 = " + sayiBagis2);
        System.out.println("toplamBagis = " + toplamBagis+"\n");

        String bagis3= "250";
        String bagis4= "500";

        int sayiBagis3= Integer.parseInt(bagis3);
        int sayiBagis4= Integer.parseInt(bagis4);
        int toplamBagis2 = (toplamBagis2= + sayiBagis3 + sayiBagis4);

        System.out.println(bagis3+bagis4);
        System.out.println("sayiBagis3 = " + sayiBagis3);
        System.out.println("bagis4 = " + bagis4);
        System.out.println("toplamBagis2 = " + toplamBagis2);


    }
}

