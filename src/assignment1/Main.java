/**
 * @author Manish Gautam Student ID:40191770
 * Advanced Programming Practices Assignment 1.
 */

package assignment1;
import java.util.ArrayList;
import assignment1.Month;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	static int idCounter=0;									//Counter to make ID unique.
	static int chequeNumber=1000;
	static Scanner userInput=new Scanner(System.in);		//Scanner to get input from the users.

	static ArrayList<AllChequeGenerator> allPayables=new ArrayList<>(); //ArrayList to store all objects of class that has implemented AllChequeGenerator Interface.
	
	public static void main(String[] args) {
		boolean programRunFlag=true;						//Flag to run program in a loop.
		while (programRunFlag) {
			System.out.println("Welcome!!! Enter Your Choice. \n 1. Add an Employee \n 2. Add a Bill \n 3. Issue cheques \n 4. Exit");
			int choice= Integer.parseInt(userInput.nextLine());
			switch (choice) {
				// Add Employee
				case 1:{
					addEmployee();							//method call to add an employee.
					break;
				}
				
				//Add Bills
				case 2:{
					addBills();								//method call to add a bill.
					break;
				}
				
				//Generate all cheques.
				case 3:{
					for (AllChequeGenerator arrayObjects : allPayables) {
						chequeNumber++;
						arrayObjects.getCheque(chequeNumber);
					}
					break;
				}
				
				//Exit the system.
				case 4:{
					programRunFlag=false;
					System.exit(0);
				}
				
				default:{
					System.out.println("You didn't entered the right choice.\n");
					continue;
				}
			}
		}
		userInput.close();
				
	}
	
	/**
	 * This method creates parttime and fulltime employee and add them to the array. 
	 */
	static void addEmployee() {
		idCounter++;
		
		System.out.println("Enter FirstName");
		String firstName=userInput.nextLine();
		System.out.println("Enter LastName");
		String lastName=userInput.nextLine().trim();
		System.out.println("Enter age");
		int age=Integer.parseInt(userInput.nextLine().trim());
		
		int id=idCounter;
		System.out.println();
		
		System.out.println("Choose an Employee Type");
		System.out.println("1.For Full Time Employee \n2. For Part Time Employee");
		int employeeTypeChoose=Integer.parseInt(userInput.nextLine());
		
		switch (employeeTypeChoose) {
		//Case 1 adds full time employee
		case 1: {
			System.out.println("Enter the salary");
			double salary=Double.parseDouble(userInput.nextLine());
			Employee fullTimer=new FulltimeEmployee(firstName, lastName, age, id, salary);
			allPayables.add(fullTimer);							//adding fulltime employee to the array.
			break;
		}
		//Case 2 adds parttime employee
		case 2:{
			//Map for echelon and rate for parttime employee.
			HashMap<Integer,Double> echelonRateMap= new HashMap<>();
			echelonRateMap.put(1,15.0);
			echelonRateMap.put(2,20.0);
			echelonRateMap.put(3,25.0);
			echelonRateMap.put(4,30.0);
			echelonRateMap.put(5,40.0);
			
			System.out.println("Enter Echlon");
			int echelon=Integer.parseInt(userInput.nextLine().trim());
			
			System.out.println("Enter number of hours");
			double noOfHoursWorked= Double.parseDouble(userInput.nextLine().trim());
			
			Employee partTimer=new PartTimeEmployee(firstName, lastName, age, id, echelonRateMap.get(echelon),noOfHoursWorked);
			allPayables.add(partTimer);							//adding parttime employee to the array.
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + employeeTypeChoose);
		}
	}
	
	/**
	 * This method creates a bill object and add it to the array.
	 */
	static void addBills() {
		System.out.println("Name of the Company");
		String nameOftheCompany=userInput.nextLine();
		System.out.println("Amount to be paid");
		double amountToBePaid= Double.parseDouble(userInput.nextLine());
		System.out.println("Choose Month");
		for(Month m: Month.values()){
				System.out.println(m.getValue()+" for "+m.toString());				
		}
		int userMonth=Integer.parseInt(userInput.nextLine().trim());
		String month="";
		for(Month m: Month.values()){
			if (m.getValue()==userMonth) {
				month=m.toString();
			}
		}
		boolean dateCheck=false;
		int day=0;
		while(!dateCheck) {
			System.out.println("Enter Day");
			day=Integer.parseInt(userInput.nextLine().trim());
			if (day>0 && day<32) {
				dateCheck=true;
			}
			else {
				System.out.println("Date should be in the range 1 to 31");
				continue;
			}
		}
		
		System.out.println("Enter Year");
		int year= Integer.parseInt(userInput.nextLine().trim());
		
		Bill bills=new Bill(nameOftheCompany, amountToBePaid, month, day, year);
		allPayables.add(bills);
	}

}
