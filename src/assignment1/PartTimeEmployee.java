package assignment1;

public class PartTimeEmployee extends Employee{
//	private int echelon;
	private double hourlyRate;
	private double hour;
	
	public PartTimeEmployee(String firstName,String lastName,int age,int id,double hourlyRate,double hour) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.id=id;
		this.hourlyRate=hourlyRate;
		this.hour=hour;	
	}
	
	public double getSalary() {
		return hourlyRate*hour;
	}
	
	public String toString() {
		return "Parttime Employee Created";
	}
	
	
	
}
