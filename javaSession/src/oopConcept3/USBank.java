package oopConcept3;

public interface USBank {
	
	// variables in interfaces are by default static we can not change its value as it is defined as a Final
	int min_bal = 500;
	
	public void Credit();
	public void Debit();
	public void TransferMoney();
	
		
	

}
