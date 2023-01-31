package Gun38._02_Abstract;

public abstract class Sekil {

    private String name;

    abstract double alan();   // soyut
    abstract double cevre();

    public void ciz() {      // somut

        System.out.println(name+ " isimli sekil cizildi");
    }

    @Override
    public String toString() {
        return "Sekil: " +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre='" + cevre() + '\'' ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
