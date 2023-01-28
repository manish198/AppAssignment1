package assignment1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	static int idCounter=0;
	static Scanner userInput=new Scanner(System.in);
	static ArrayList<allChequeInterface> allPayables=new ArrayList<>();
	public static void main(String[] args) {
		boolean programRunFlag=true;
		while (programRunFlag) {
			System.out.println("Welcome!!! Enter Your Choice. \n 1. Add an Employee \n 2. Add a Bill \n 3. Issue cheques \n 4. Exit");
			int choice= Integer.parseInt(userInput.nextLine());
			switch (choice) {
				case 1:{
					addEmployee();
					break;
				}
				
				case 2:{
					addBills();
					break;
				}
				
				case 3:{
					for (allChequeInterface o : allPayables) {
						o.getCheque();
//						System.out.println("Class "+o.toString());
					}
					break;
				}
				
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
		case 1: {
			System.out.println("Enter the salary");
			double salary=Double.parseDouble(userInput.nextLine());
			Employee fullTimer=new FulltimeEmployee(firstName, lastName, age, id, salary);
			allPayables.add(fullTimer);
			System.out.println(fullTimer.toString());
			System.out.println(fullTimer.getSalary());
			break;
		}
		
		case 2:{
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
			allPayables.add(partTimer);
			System.out.println(partTimer.toString());
			System.out.println(partTimer.getSalary());
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + employeeTypeChoose);
		}
	}
	
	static void addBills() {
		System.out.println("Bills Adding in process");
		System.out.println("Name of the Company");
		String nameOftheCompany=userInput.nextLine();
		System.out.println("Amount to be paid");
		double amountToBePaid= Double.parseDouble(userInput.nextLine());
		
	}

}
