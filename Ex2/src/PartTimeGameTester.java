// @author BrunaDonatoni
public class PartTimeGameTester extends GameTester {

	private double hours;
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	//constructor
	public PartTimeGameTester(String name, double hours) {
		super(name, false);
		this.hours = hours;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
	
		return 20*this.hours;
	}
	@Override
	public String toString() {
		return "GameTester [nameGameTester= " + this.getNameGameTester()+ ", isFullTime= " + this.isFullTime()+ ", Salary= " + this.getSalary() + "]";
	}
}
