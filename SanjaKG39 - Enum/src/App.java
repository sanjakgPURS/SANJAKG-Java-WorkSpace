
public class App {

	/*
	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;
	*/

	public enum DanUSedmici{
		PONEDELJAK,UTORAK,SRIJEDA,CETVRTAK,PETAK,SUBOTA,NEDELJA;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Animal animal = Animal.DOG;
		
		switch(animal) {
		case CAT:
			System.out.println("Macka");
			break;
		case DOG:
			System.out.println("Pas");
			break;
		case MOUSE:
			System.out.println("Mis");
			break;
		default:
			break;	
		}
		
		System.out.println(Animal.DOG);
		
		System.out.println(Animal.DOG.getClass());
		
		System.out.println(Animal.DOG instanceof Animal);
		
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.DOG.getName());
		
		System.out.println(Animal.DOG.toString());
		
		DanUSedmici naziv=DanUSedmici.PONEDELJAK;
		System.out.println(naziv.toString());
		
		
		
		
	}
}
