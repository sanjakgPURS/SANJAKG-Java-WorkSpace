class Zaba {
	private String ime;
	private int godine;
	private String boja;
	
	public void setName(String name){
		this.ime=name;
	};
	
	public void setBoja(String boja){
		this.boja=boja;
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
	
	public void setSve(String name,String boja, int age){
		setName(name);
		setBoja(boja);
		setAge(age);
		
	}
	
	
	public String VratiZvuk(){
		return "Kre kre";
	};
	
		
}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Zaba zabica=new Zaba();
	zabica.setSve("Kreketusa","zelena", 2);
	
	Zaba zabuljak=new Zaba();
	zabuljak.setSve("Kreketavica","siva", 3);
	
	System.out.println(zabica.getName()+" stara "+ zabica.getAge()+" godine, kaže "+ zabica.VratiZvuk());
	System.out.println(zabuljak.getName()+" stara "+ zabuljak.getAge()+" godine, kaže "+ zabuljak.VratiZvuk());	
		
		
	}

}
