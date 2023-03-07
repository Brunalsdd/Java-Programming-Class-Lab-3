// @author BrunaDonatoni
public class BusinessMortgage extends Mortgage {

	
	//constructor
	public BusinessMortgage(double currentInterest, int number, String name, double mortgageAmount, int term) {
		// TODO Auto-generated constructor stub
		this.setInterestRate(currentInterest + 1); //add 1% over current interest rate
		this.setNumber(number);
		this.setCustomerName(name);
		this.setMortgageAmount(mortgageAmount);
		this.setTerm(term);
	}
	
}
