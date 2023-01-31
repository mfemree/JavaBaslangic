package Mentoring.AccessModifiers.package1;

import Mentoring.AccessModifiers.package2.Teacher;

public class SamePackage {

    Human human = new Human("George", 42, "Happy Moments", "GREGOR");
    Teacher teacher = new Teacher("Ali",44, "golf","nickname");

    void anyMethod(){
        System.out.println("public = " + human.name);
        System.out.println("protected = " + human.memories);
        System.out.println("default = " + human.nickName);
        //System.out.println("private = " + human.age);

        System.out.println("public = " + teacher.name);
        System.out.println("protected = " + teacher.memories);
//        System.out.println("default = " + teacher.nickName);
//        System.out.println("private = " + teacher.age);
    }

    public static void main(String[] args) {

        Human human2 = new Human("George", 42, "Happy Moments", "GREGOR");

        Teacher teacher = new Teacher("Ali",44, "golf","nickname");

        System.out.println("public = " + human2.name);
        System.out.println("protected = " + human2.memories);
        System.out.println("default = " + human2.nickName);
        //System.out.println("private = " + human2.age);

        System.out.println("public = " + teacher.name);
       System.out.println("protected = " + teacher.memories);
//        System.out.println("default = " + teacher.nickName);
//        System.out.println("private = " + teacher.age);
    }
}
