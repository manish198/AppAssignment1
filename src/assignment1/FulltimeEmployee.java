package assignment1;

public class FulltimeEmployee extends Employee{
	private double salary;
	
	/**
	 * This is a constructor for a FulltimeTimeEmployee class. 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param id
	 * @param salary
	 */
	public FulltimeEmployee(String firstName,String lastName,int age,int id,double salary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.id=id;
		this.salary=salary;
		
	}
	
	/**
	 * This method returns the monthly salary for the full time employee.
	 * @return salary of the full time employee which is of double type.
	 */
	public double getSalary(){
		return this.salary;
	}
}
