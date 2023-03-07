// @author BrunaDonatoni
public abstract class Mortgage implements MortgageConstants {
	private int number;
	private String customerName;
	private double mortgageAmount;
	private double interestRate;
	private int term;
	
	
	
	//getters and setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getMortgageAmount() {
		return mortgageAmount;
	}
	public void setMortgageAmount(double mortgageAmount) {
		this.mortgageAmount = mortgageAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		if(term == 1) {
			this.term = LONG_TERM;
		} else if(term == 2) {
			this.term = MEDIUM_TERM;
		} else {
			this.term = SHORT_TERM;
		}
	}
	
	
	@Override
	public String toString() {
		return "Mortgage [number= " + number + ", customerName= " + customerName + ", mortgageAmount= " + mortgageAmount
				+ ", interestRate= " + interestRate + ", term= " + term + "]";
	}
	
	
	
	
	
}
