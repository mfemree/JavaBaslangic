package Gun26._02_Ornek;

public class Person {

    String name;

    String surName;

    int age;

    public void BilgiYazdir(){

        // burda static kullanmiyoruz cunku icerde ayni kendi bilgilerini yazdiriyor
        // ayrica kendi icinde yaziyorken direkt name/userNAme olarak adlandirabilriiz


        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);

    }

    public String toString() {

        return name + "\t" + surName + "\t" + age;

    }

    public void getBirthYear(){

        System.out.println("dogum yiliniz= " + (2022-age));
    }

    public String getBirthYear2 (){

        return "dogum yiliniz= " + (2022-age);
    }


    public void getInitials(){

        System.out.println(

                name.toUpperCase().charAt(0) + "." +
                surName.toUpperCase().charAt(0)
                          );

    }


}

