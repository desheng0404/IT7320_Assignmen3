package Assignment_3.Part1;

public class implementation implements Interface{

	 Interface obj;
	public double computeTax(int amount) {
		
		return obj.computeTax(amount);
	}

	public double weeklySalary(Employee income) {
		
		return obj.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		
		return obj.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		
		return obj.computeKiwiSaver(kiwiOption);
	}
	
	
	

}
