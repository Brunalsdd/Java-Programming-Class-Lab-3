// @author BrunaDonatoni

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ex1App {


	public static void main(String[] args) {
		List<Insurance> list=new ArrayList<>();
			        
	        boolean choiceI = true;
	        
			do {
	        	String[] options = {"Health", "Life"};
		        String type = (String)JOptionPane.showInputDialog(null, " Please, enter type of insurance:", 
		                "type", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		        
		        String cost = JOptionPane.showInputDialog("Please, enter monthlly cost:");
		        double cost1 =Double.parseDouble(cost);
		        	
		        	if(type.equals("Health")) {
		        		Health ins=new Health();
						ins.setMonthlyCost(cost1);
						ins.displayInfo();
					}else if(type.equals("Life")) {
						Life ins=new Life();
						ins.setMonthlyCost(cost1);
						ins.displayInfo();
						list.add(ins);
					}
		    
		        String[] options1 = {"Yes", "No"};
			    String choice = (String)JOptionPane.showInputDialog(null, "Do you want to add a new insurence? (Yes/No)", 
			                "choice", JOptionPane.QUESTION_MESSAGE, null, options1, options1[1]);   
			    
			    if(!choice.equals("Yes")  ) {
			    	choiceI = false;
				}

	        }while(choiceI);

	  
		
	}


}