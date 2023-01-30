package assignment1;

public class Bill implements AllChequeGenerator {
	protected String nameOfTheCompany;
	protected double amountToBePaid;
	String month;
	int day;
	int year;
	
	/**
	 * This is a constructor for Bill class.
	 * @param companyName
	 * @param amountDue
	 * @param month
	 * @param day
	 * @param year
	 */
	public Bill(String companyName, double amountDue, String month,int day,int year) {
		this.nameOfTheCompany=companyName;
		this.amountToBePaid=amountDue;
		this.month=month;
		this.day=day;
		this.year=year;
	}
	
	/**
	 * This method is overridden method of AllChequeGenerator interface to generate a cheque.
	 */
	@Override
	public void getCheque(int chequeNumber) {
		System.out.println("Cheques num: " + chequeNumber + "\nPay to: " +
		this.nameOfTheCompany + "\nAmount to be paid: " + this.amountToBePaid +"\n");
	}
}
