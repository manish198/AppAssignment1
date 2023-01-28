package assignment1;

public class FulltimeEmployee extends Employee{
	private double salary;
	
	public FulltimeEmployee(String firstName,String lastName,int age,int id,double salary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.id=id;
		this.salary=salary;
		
	}
	public double getSalary(){
		return this.salary;
	}
	
	public String toString() {
		return "FullTime Employee Created";
	}
	
	
}
