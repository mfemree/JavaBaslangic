package Mentoring.Static_Demo;

import Mentoring.Static_Demo.Student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Static_Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String firstName = scanner.next();

        System.out.println("Lutfen SoyIsminizi giriniz");
        String lastName = scanner.next();

        System.out.println("Lutfen Okul Numaranizi giriniz");
        String girdi = scanner.next();

        int okulNo = UtilityClass.convertToInteger(girdi);

        // Girilen 2 tane sayinin buyuk olanini en hizli nasil buluruz?
        Math.max(12, 4);

        Student student1 = new Student("Ahmet", "Mehmet", okulNo,999);
        student1.Study();

        Student student2 = new Student("Veli", "Ok", okulNo, 888);
        student2.Study();

        System.out.println(Student.getStudentCount());
        System.out.println(student1);

    }
}
