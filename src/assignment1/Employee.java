package assignment1;

public abstract class Employee implements AllChequeGenerator {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int id;
	
	public abstract double getSalary();
	
	@Override
	public void getCheque() {
		System.out.println("Cheques num: " + Math.random() + "\nPay to: " +
		this.firstName + " " + this.lastName + "\nAmount to be paid: " +this.getSalary());
	}
	
}
