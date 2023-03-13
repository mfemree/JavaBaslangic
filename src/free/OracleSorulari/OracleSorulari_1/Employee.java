package free.OracleSorulari.OracleSorulari_1;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee () {

        // line 1
//        this.name = new String("Joe");
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);

        // line 1
//        name = "Joe";
//        contract = TRUE;
//        salary = 100.0f;

//        this ("Joe", true, 100);  // tek seferde 3 tane deger verilemez

    }

    public String toString () {
        return name + ":" + contract + ":" + salary;
    }


    public static void main(String[] args) {

        Employee e = new Employee();

        // line n2
        e.name = "Joe";
        e.contract=true;
        e.salary=100;

        // line n2
        // this.name = "Joe";  // static olmayaan bir variable'yi static mainde yazamayiz
        // this.contract = true;
        // this.salary = 100;

        System.out.println(e);
    }
}
