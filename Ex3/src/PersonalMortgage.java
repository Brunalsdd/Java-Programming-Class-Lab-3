// @author BrunaDonatoni
public class PersonalMortgage extends Mortgage {

	public PersonalMortgage(double currentInterest, int number, String name, double mortgageAmount, int term) {
		// TODO Auto-generated constructor stub
		this.setInterestRate(currentInterest + 2); //add 2% over current interest rate
		this.setNumber(number);
		this.setCustomerName(name);
		this.setMortgageAmount(mortgageAmount);
		this.setTerm(term);
	}

}
