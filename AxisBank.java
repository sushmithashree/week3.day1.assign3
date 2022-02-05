package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The deposit amount is: Rs.50000");
	}
	public void superDeposit() {
		super.deposit();
	}
	public static void main(String[]args) {
		BankInfo bank = new BankInfo();
		AxisBank axis = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		axis.deposit();
		axis.superDeposit();
	}

	
}
