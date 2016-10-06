
public class RobotManager {

	public static void main(String[] args) {
		Robot rob1 = new Robot(20,20);
		
		rob1.move(20);
		rob1.print_coordinates();
		
		rob1.setCourse(45);
		rob1.move(40);
		rob1.print_coordinates();

		rob1.setCourse(90);
		rob1.move(20);
		rob1.print_coordinates();
		
		rob1.setCourse(180);
		rob1.move(50);
		rob1.print_coordinates();
		
	}

}
