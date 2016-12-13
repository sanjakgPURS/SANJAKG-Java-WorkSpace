import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Podaci=new Scanner(System.in);
  //  Scanner Prezime=new Scanner(System.in);
 //   Scanner GodinaRodjenja=new Scanner(System.in);
 //   Scanner Pol=new Scanner(System.in);
    System.out.println("Unesite svoje ime: ");
    String Ime= Podaci.nextLine();
    System.out.println("Unesite svoje prezime: ");
    String Prezime= Podaci.nextLine();
    System.out.println("Unesite svoju godinu rodjenja: ");
    String Godina= Podaci.nextLine();
    System.out.println("Unesite svoj pol: ");
    String Pol= Podaci.nextLine();
    
    
    System.out.println("Dobro dosli "+Ime+" "+Prezime+"("+Pol+"), "+Godina+"");
    
    
		
		
		
	}

}
