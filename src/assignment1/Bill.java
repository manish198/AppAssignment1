package assignment1;

public class Bill implements AllChequeGenerator {
	protected String nameOfTheCompany;
	protected double amountToBePaid;
	String month;
	int day;
	int year;
	
	public Bill(String companyName, double amountDue, String month,int day,int year) {
		this.nameOfTheCompany=companyName;
		this.amountToBePaid=amountDue;
		this.month=month;
		this.day=day;
		this.year=year;
	}
	

	@Override
	public void getCheque() {
		System.out.println("Cheques num: " + Math.random() + "\nPay to: " +
		this.nameOfTheCompany + "\nAmount to be paid: " + this.amountToBePaid);
	}
}
