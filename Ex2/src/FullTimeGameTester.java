// @author BrunaDonatoni
public class FullTimeGameTester extends GameTester {

	
	
	//constructor
	public FullTimeGameTester(String nameGameTester) {
		super(nameGameTester, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 3000.00 ;
	}
	@Override
	public String toString() {
		return "GameTester [nameGameTester= " + this.getNameGameTester()+ ", isFullTime= " + this.isFullTime()+ ", Salary= " + this.getSalary() + "]";
	}
}
