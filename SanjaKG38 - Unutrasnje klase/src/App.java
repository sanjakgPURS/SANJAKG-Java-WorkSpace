/*
 * Mr. Robot primjer
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				Robot robot = new Robot(7);
				robot.start(false,true);
				
				/* Robot.Brain se ne moze instancirati posto je private
				 * 
				Robot.Brain brain = robot.new Brain();
				brain.think();
				*/
				
				Robot.Battery battery = new Robot.Battery();
				battery.charge();
				
				Robot robot1=new Robot(8);
				robot1.start(true,true);
		        battery.charge();
		
		
	}

}
