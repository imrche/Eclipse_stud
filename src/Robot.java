
public class Robot {
	private double x = 0;
	private double y = 0;
	private double course = 0;
	
	public Robot (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void print_coordinates() {
		System.out.println(x + "," + y);
	}
	
	public void move(double distance) {
		x += distance * Math.cos(course/180 * Math.PI);
		y += distance * Math.sin(course/180 * Math.PI);
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return x;
	}
	public double getCourse() {
		return course;
	}
	
	public void setCourse(double Course) {
		this.course = Course;
	}
	
}
