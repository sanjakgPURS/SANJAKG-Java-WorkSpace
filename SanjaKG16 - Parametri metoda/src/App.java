class Zaba {
	private String ime;
	private int godine;
	
	public void setName(String name){
		this.ime=name;
	};
	
	public void setAge(int age){
		this.godine=age;
	};
	
	public String getName(){
		return ime;
	};
	
	public int getAge(){
		return godine;
	}
	
	public void setSve(String name, int age){
		setName(name);
		setAge(age);
	}
	
		
}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Zaba zabica=new Zaba();
	zabica.setSve("Kreketusa", 2);
	
	System.out.println(zabica.getName()+" stara "+ zabica.getAge()+" godine ");
		
		
		
	}

}
