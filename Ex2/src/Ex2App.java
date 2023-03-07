// @author BrunaDonatoni
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isFullTime = false;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please insert your name");
		String name = in.nextLine();
		System.out.println("Is a full time employee");
		System.out.println("1- Yes, it is \n2- No, it is not");
		String choice = in.nextLine();
		if(choice.equals("1")) {
			isFullTime = true;
		}
	
		
		if(isFullTime){
			FullTimeGameTester fullTimeGameTester = new FullTimeGameTester(name);
			double salary = fullTimeGameTester.getSalary();
			System.out.println(fullTimeGameTester.toString());
		}else {
			System.out.println("Please, enter the number of hours for the part-time testers:");
			double hours = in.nextDouble();
			PartTimeGameTester partTimeGameTester = new PartTimeGameTester(name, hours);
			double salary = partTimeGameTester.getSalary();
			System.out.println(partTimeGameTester.toString());
		}

	}

}
