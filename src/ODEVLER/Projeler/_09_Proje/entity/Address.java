package ODEVLER.Projeler._09_Proje.entity;

import ODEVLER.Projeler._09_Proje.enums.City;

public class Address{

    //----------------------Fields---------------------------------------------------------------------
    // 3 adet private instance degisken tanimlayin... String description - City city - String zipCode
    // City ayri bir sinif olarak tanimlandigindan buradaki odevlerinizi yapiniz...
    private String description;
    private City city;
    private String zipCode;

    //----------------------Constructor ---------------------------------------------------------------------
    // Tum degiskenler constructor ile initilize edilmelidir...

    public Address(String description, City city, String zipCode) {
        this.description = description;
        this.city = city;
        this.zipCode = zipCode;
    }

    //----------------------Getter and Setter ---------------------------------------------------------------------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
