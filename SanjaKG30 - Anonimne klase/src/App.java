class Masina {
	public void start(){
		System.out.println("Masina je pokrenuta");
	}
}

interface Plant{
	public void grow();
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Masina masina1=new Masina() {
			@Override public void start(){
				System.out.println("Masina1 je pokrenuta");
			}
		};
		
		masina1.start();
		
		Plant biljka1=new Plant(){
		    @Override
			public void grow(){
		    	System.out.println("Biljka raste");
		    }
		};
		
		biljka1.grow();
	}

}
