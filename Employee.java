public class Employee{

	private int employeeID;
	private int salary;
	private String name;

	
	public Employee(int employeeID, int salary, String name){
		setID(employeeID);
		this.salary = salary;
		this.name = name;
	}

	//GETTERS

	public int getID(){
		return employeeID;
	}

	public int getSalary(){
		return salary;
	}

	public String getName(){
		return name;
	}
	
	//SETTERS

	public void setID(int employeeID){

		if (employeeID <= 0){
			System.out.println("\nMali po!");
			return;
		}

		this.employeeID = employeeID;
	}

	
	public void setSalary(int salary){
		this.salary = salary;
	}

	public void setName(String name){
		this.name = name;
	}

	//methods
	
	public void displayInfo(){
		System.out.println("Employee ID: " + getID());
		System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary()  + "\n");
	}
}
