package Mentoring.AccessModifiers.package1;

public class Racer {

    private String name;
    private String carModel;

    protected String raceLeague;

    public Racer(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
