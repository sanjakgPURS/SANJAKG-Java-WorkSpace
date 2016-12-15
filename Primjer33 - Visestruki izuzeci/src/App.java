import java.io.IOException;
import java.text.ParseException;
 
public class App {
 
    public static void main(String[] args)  {
        Test test = new Test();
         
        // visestruki try-catch blok
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Nije moguce parsirati fajl.");
        }
         
        // Try MULTI CATCH , JAVA 7+ verzije
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
     
    }
 
}