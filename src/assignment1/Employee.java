package assignment1;

public abstract class Employee implements AllChequeGenerator {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int id;
	
	/**
	 * 
	 * @return
	 */
	public abstract double getSalary();
	
	/**
	 * This method is overridden method of AllChequeGenerator interface to generate a cheque.
	 */
	@Override
	public void getCheque(int chequeNumber) {
		System.out.println("Cheques num: " + chequeNumber + "\nPay to: " +
		this.firstName + " " + this.lastName + "\nAmount to be paid: " +this.getSalary()+"\n");
	}
	
}
