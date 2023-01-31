package Mentoring.Static_Demo;

public class Student {

    // --------------------------------- FIELDS --------------------------------------------------------------------


    // instance methodlardan static degiskenlere ulasabilirim
    // ama static methodlardan instance degiskenlere ulasamam.

    // her uretilen objede bulunan methodlar, o class a ait static degiskenlere ulasabiliyor.
    // ama her instance methodlar, her objeye ait olmayan, yani class'a ait olan methodlar, instance her objenin degiskenlerine ulasamaz
    private String firstName;   // Instance field - Her objeye ait ( yani static olmayan )
    private String lastName;
    private int schoolNumber;
    private int phoneNumber;

    private static int studentCount;  // Static Field

    // --------------------------------- CONSTRUCTOR --------------------------------------------------------------------


    public Student(String firstName, String lastName, int schoolNumber, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNumber = schoolNumber;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }

    public Student(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    // --------------------------------- METHODS --------------------------------------------------------------------

    public static int getStudentCount(){
        // Bu classtan olusturulmus ogrenci miktarini nasil sayabilirim...
        return studentCount;
    }




    // --------------------------------- TO String Method ------------------------------------------------------------


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    // --------------------------------- Getter-Setter ------------------------------------------------------------


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Study() {

    }
}
