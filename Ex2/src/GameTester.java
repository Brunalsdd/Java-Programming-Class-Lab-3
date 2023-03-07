// @author BrunaDonatoni
public abstract class GameTester {
	
	private String nameGameTester;
	
	private boolean isFullTime;
	
	public abstract double getSalary();

	//constructor
	public GameTester(String nameGameTester, boolean isFullTime) {
		super();
		this.nameGameTester = nameGameTester;
		this.isFullTime = isFullTime;
	}
	public GameTester() {
		
	}

	//getters and setters
	public String getNameGameTester() {
		return nameGameTester;
	}

	public void setNameGameTester(String nameGameTester) {
		this.nameGameTester = nameGameTester;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	
	
}
