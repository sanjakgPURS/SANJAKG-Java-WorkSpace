
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String[][]	Imena={
			{"Jovan", "Milan", "Petar"},
			{"Jovanovic","Milanovic","Petrovic","Markovic"},
			{"1956","1978","1978","1966"}
	};
	
	for(int i=0;i<Imena.length; i++){
		for(int j=0;j<Imena[i].length;j++){
			System.out.print(Imena[i][j]+ "\t");
		}
		 System.out.println();	
	}
		

	}

}
