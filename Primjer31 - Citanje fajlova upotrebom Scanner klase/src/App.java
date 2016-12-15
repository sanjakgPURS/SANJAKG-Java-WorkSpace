import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
/*
 * Primjer je poprilicno jednostavan
 * 1 - Kreiramo promjenjivu u koju smjestimu putanju do fajla
 * 2 - Koristimo Scanner klasu za citanje fajla (referencu prema fajlu)
 * 3 - pomocu nextLine() citamo liniju po liniju, a pomocu hasNextLine() provjeravamo ima li jos linija
 */
public class App {
 
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "D:/Test/KUka/Example.txt";
      //  String fileName =  "example.txt";
        File textFile = new File(fileName);
         
        Scanner in = new Scanner(fileName);
         
        int value = in.nextInt();
        System.out.println("Read value: " + value);
         
        in.nextLine();
         
        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();
             
            System.out.println(count + ": " + line);
            count++;
        }
         
        in.close();
    }
 
}