import java.util.Scanner;

public class taskEmployee extends Employee{

    private String task;
    private String taskStatus;
    private int hoursW;

    public taskEmployee(int employeeID, int salary, int hoursW, String name, String task, String taskStatus) {
        super(employeeID, salary, name);
        this.task = task;
        this.taskStatus = taskStatus;
        this.hoursW = hoursW;
    }

    
    public String getTask(){
        return task;
    }

    public String getStatus(){
        return taskStatus;
    }

    public int getHoursW(){
        return hoursW;
    }

    //setter

    public void setTask(String task){
        this.task = task;
    }

    public void setStatus(Scanner sml){

        System.out.print("""
                [-P] Pending
                [-IP] In-progress
                [-C] Completed!
                : """);
        String ano = sml.nextLine();

        switch (ano){

            case "-P":
                this.taskStatus = "PENDING";
                break;

            case "-IP":
                this.taskStatus = "IN-PROGRESS";
                break;

            case "-C":
                this.taskStatus = "COMPLETE!!";
                break;

            default:
                System.out.println("Error!");
                break;

        }
    }

    public void sethours(int hoursW){
        this.hoursW = hoursW;
    }

    @Override
    public void displayInfo(){
        System.out.printf("""
                \n=====EMPLOYEE=====
                ID: %d
                Name: %s
                Salary: %d 
                ------------------
                Task: %s
                Status: %s
                Hours Worked: %d\n""", getID(), getName(), getSalary(), getTask(), getStatus(), getHoursW());
    }

    public void complete(){
		this.taskStatus = "COMPLETED!!";
	}

    public void showBasic(){
        super.displayInfo();
    }

}