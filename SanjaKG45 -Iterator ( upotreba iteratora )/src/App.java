import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> zivotinje= new LinkedList<String>();
		zivotinje.add("Pas");
		zivotinje.add("Macka");
		zivotinje.add("Mis");
		
		Iterator<String> it= zivotinje.iterator();
		
		while (it.hasNext()) {
			String value=it.next();
			System.out.println(value);
		}
		
		System.out.println("___________________________________________________");
		
		for (String zivotinja:zivotinje ) {
			System.out.println(zivotinje);
		}
		
		
		
		
		
		

	}

}
