package Gun43;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String str="";

        char ilkHarf= str.charAt(0);
        // ister try-catch kullan, ister kullanma: Unchecked Exception


        try {
            Thread.sleep(1000);  // try-catch mecbur: Checked Exception

        }catch (InterruptedException e ) {
            throw new RuntimeException(e);         // bu ya da asagidaki, ikisini de yazabiliriz
            // System.out.println("hata olustu");
        }

    }
}
