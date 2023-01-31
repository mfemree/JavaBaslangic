package Gun37._02_Soru;

import java.util.ArrayList;
import java.util.Collections;

public class HayvanatBahcesiMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Van Kedisi", "Karada");
        Duck duck1 = new Duck("Kaya Kirlangici", "Havada ve Karada");
        Shark shark1= new Shark("Cekic Kopek Baligi", "Suda");
        Swallow swallow1 = new Swallow("Ak Yuzlu Islikci Ordegi", "Suda ve Karada");

        ArrayList<Animal> animals = new ArrayList<>();
        Collections.addAll(animals, cat1,duck1,shark1,swallow1);

        for ( Animal animal : animals  ) {
            System.out.println("Sınıf: " + animal.getClass().getSimpleName());   // class in adini verir
            System.out.println("Cinsi: " + animal.getCinsi() + "\nNerde Yaşar: " + animal.getNeredeYasar());

            if (animal instanceof Cat) {
                System.out.println(animal.getCinsi() + " cinsi " + ((Cat) animal).food());
                System.out.println();
            } else if (animal instanceof Duck) {
                System.out.println(animal.getCinsi() + " cinsi " + ((Duck) animal).food());
                System.out.println(animal.getCinsi() + " cinsi " + ((Duck) animal).flying());
                System.out.println(animal.getCinsi() + " cinsi " + ((Duck) animal).sailing());
                System.out.println();
            } else if (animal instanceof Shark) {
                System.out.println(animal.getCinsi() + " cinsi " + ((Shark) animal).food());
                System.out.println(animal.getCinsi() + " cinsi " + ((Shark) animal).sailing());
                System.out.println();
            } else if (animal instanceof Swallow) {
                System.out.println(animal.getCinsi() + " cinsi " + ((Swallow) animal).food());
                System.out.println(animal.getCinsi() + " cinsi " + ((Swallow) animal).flying());
                System.out.println();
            }
        }
    }
}
