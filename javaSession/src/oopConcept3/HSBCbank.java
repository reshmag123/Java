package oopConcept3;

public class HSBCbank implements USBank ,BrazilBank {
	
	//Here we are achieving multiple inheritance as we are implementing from two parent interfaces
	//It is called Is-a relationship

	@Override
	public void Credit() {
		System.out.println("Credit");
	}

	@Override
	public void Debit() {
		System.out.println("Debit");
		
	}

	@Override
	public void TransferMoney() {
		System.out.println("TransferMoney");
		
	}
	
	public void Loan() {
		System.out.println("Loan");
	}

	@Override
	public void MutualFund() {
		System.out.println("From brazil bank Mutual Fund");
		
	}

	@Override
	public void FD() {
		System.out.println("Brazil FD");
		
	}

}
