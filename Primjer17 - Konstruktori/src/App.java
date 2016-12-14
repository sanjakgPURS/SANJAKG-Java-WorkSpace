class Machine {
    private String name;
    private int code;
     
    public Machine() {
        this("A masina", 0);
         
        System.out.println("Prvi konstruktor je aktiviran!");
    }
     
    public Machine(String name) {
        this(name, 0);
         
        System.out.println("Drugi konstruktor je aktiviran!");
    }
     
    public Machine(String name, int code) {
    	
        System.out.println("Treci konstruktor je aktiviran!");
        this.name = name;
        this.code = code;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
 
public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
 
        Machine machine2 = new Machine("B masina");
         
        Machine machine3 = new Machine("C masina", 7);
        
        System.out.println(machine1);
        System.out.println(machine2);
        System.out.println(machine3);
    }
 
}
