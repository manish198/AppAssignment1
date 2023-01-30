package assignment1;

public class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private double hour;
	
	/**
	 * This is a constructor for a PartTimeEmployee class. 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param id
	 * @param hourlyRate
	 * @param hour
	 */
	public PartTimeEmployee(String firstName,String lastName,int age,int id,double hourlyRate,double hour) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.id=id;
		this.hourlyRate=hourlyRate;
		this.hour=hour;	
	}
	
	/**
	 * @return salary of the part time employee which is of double type.
	 */
	public double getSalary() {
		return hourlyRate*hour;
	}
}
