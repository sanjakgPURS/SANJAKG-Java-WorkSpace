class Student {
	String ime;
	String prezime;
	String brojIndeksa;
	int godinaStudija;
	boolean aktivanStudent;
	boolean vanredniStudent;
	
	void OdstampajPodatke() {
		System.out.println(ime+" "+prezime+", "+brojIndeksa);	
	}
	
}



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student PrviStudent=new Student();
	PrviStudent.ime="Marko";
	PrviStudent.prezime="Markovic";
	PrviStudent.brojIndeksa="M123456";
	PrviStudent.godinaStudija=4;
	PrviStudent.aktivanStudent=true;
	PrviStudent.vanredniStudent=false;
	
	
	Student DrugiStudent=new Student();
	DrugiStudent.ime="Janko";
	DrugiStudent.prezime="Jankovic";
	DrugiStudent.brojIndeksa="P123456";
	DrugiStudent.godinaStudija=2;
	DrugiStudent.aktivanStudent=true;
	DrugiStudent.vanredniStudent=false;
	
	PrviStudent.OdstampajPodatke();
	DrugiStudent.OdstampajPodatke();
	
	
	
	
		
		
	}

}
