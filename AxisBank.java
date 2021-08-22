package Week3Day1Assignment;

public class AxisBank extends BankInfo {
//Overridding
	public void deposit() {
		System.out.println("Overridden method");
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.deposit();
		obj.fixed();
}
}