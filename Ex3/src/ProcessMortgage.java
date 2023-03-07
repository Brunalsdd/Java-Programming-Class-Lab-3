// @author BrunaDonatoni

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//list of the mortgages
		List<Mortgage> mortgageList = new ArrayList<>();
		
		System.out.println("insert the customer name");
		in.nextLine(); //clean scanner input
		String name = in.nextLine();
		
		System.out.println("insert the mortgage number");
		int number = in.nextInt();
		
		
		for(int i=1; i<4 ; i++) {
			System.out.println("\nMortgage #" + i);
			
			System.out.println("insert the current interest rate");
			double currentInterest = in.nextDouble();
			
			System.out.println("Select the Mortgage type");
			System.out.println("1- Business \n2- Personal");
			int type = in.nextInt();
			
			System.out.println("insert amount of mortgage");
			double mortgageAmount = in.nextDouble();
			while(mortgageAmount > 300000.0 || mortgageAmount <=0.0) {
				System.out.println("invalid amount\n it can not be more then $300,000.00 \ninsert amount of mortgage");
				mortgageAmount = in.nextDouble();
			}
			
			System.out.println("insert the term");
			System.out.println("1- Long-term \n2- Medium-term \n3- Short-term");
			int term = in.nextInt();
			
			if(type == 1) {
				BusinessMortgage mortgage = new BusinessMortgage(currentInterest, number, name, mortgageAmount, term);
				mortgageList.add(mortgage);
			} else {
				PersonalMortgage mortgage = new PersonalMortgage(currentInterest, number, name, mortgageAmount, term);
				mortgageList.add(mortgage);
			}
				
		}
		
		for (Mortgage mortgage : mortgageList) {
			System.out.println(mortgage.toString());
		}
		
	}

}
