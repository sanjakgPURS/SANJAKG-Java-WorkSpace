import java.util.Scanner;
 
public class App {
 
    
	public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.println("Unesite komandu: ");
        String text = input.nextLine();
 
        switch (text) {
        case "start":
            System.out.println("Ma�ina je pokrenuta!");
            break;
 
        case "stop":
            System.out.println("Ma�ina je  zaustavljena.");
            break;
 
        default:
            System.out.println("Komanda nije prepoznata");
        }
         
         input.close();
    }
 
}