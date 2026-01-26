package oopConcept3;

public class TestInterface {

	public static void main(String[] args) {
		
		HSBCbank hb = new HSBCbank();
		//HSBCbank.min_bal = 100; can not reassigned value for interface variable as it is Final
		
		System.out.println(HSBCbank.min_bal);
		hb.Credit();
		hb.Debit();
		hb.TransferMoney();
		hb.Loan();
		hb.MutualFund();
		hb.FD();
	}

}
