import javax.swing.JOptionPane;

// @author BrunaDonatoni

public class Health extends Insurance{

	public Health() {
		super("health");
	}

	
	@Override
	public void setInsuranceCost(double cost) {
		super.setMonthlyCost(cost);
	}

	
	@Override
	public void displayInfo() {
		System.out.println("Insurance:\n\tType of Insurence: "+this.getTypeInsurance()+"\n\tMonthly Cost: "+this.getMonthlyCost());
		JOptionPane.showMessageDialog(null, "Insurance:\n\tType of Insurence: "+this.getTypeInsurance()+"\n\tMonthly Cost: "+this.getMonthlyCost());
	}

}
