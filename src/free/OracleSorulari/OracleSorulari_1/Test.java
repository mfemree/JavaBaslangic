package free.OracleSorulari.OracleSorulari_1;

public class Test {

        public static void main(String[] args) {

            Student[] students = new Student[3];

            // System.out.println("students = " + Arrays.toString(students));


            students[0]= new Student("Richard");
           // students[0] = new Student();
            students[1]= new Student("Donald");


            for ( Student s : students) {
                System.out.println("" + s.name);
            }

        }
    }



