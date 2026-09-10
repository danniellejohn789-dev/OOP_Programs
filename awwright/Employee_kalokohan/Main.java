import java.util.*;

public class Main{
	
	static Scanner sml = new Scanner(System.in);
	static ArrayList<taskEmployee> tm = new ArrayList<>();
	static taskEmployee m1 = new taskEmployee(1, 500, 0, "den" , "None", "None");

	public static void main(String[] args){

		tm.add(m1);
		tm.add(new taskEmployee(2, 500, 0, "dei", "", ""));

		System.out.print("Enter ID: ");
		int id = sml.nextInt();
		sml.nextLine();

		taskEmployee employee = search(tm, id);

		while (true){
			ui();
			System.out.print(": ");
			String ano = sml.nextLine();

			switch(ano){

				case "\\i":
					employee.showBasic();
					break;

				case "\\s":
					employee.displayInfo();
					break;

				case "1":
					employee.setStatus(sml);
					break;

				case "2":
					System.out.print("\nEnter your task: ");
					String task = sml.nextLine();

					employee.setTask(task);
					break;

				case "3":
					System.out.println("\nEnter your hours of work: ");
					int hours = sml.nextInt();
					sml.nextLine();

					employee.sethours(hours);
					break;

				case "\\q":
					System.out.println("\nEXITING.....");
					return;

				default:
					System.out.println("\nERROR!!");
			}
		}



	}

	public static void ui(){
		System.out.println("""
				\n===============
				CLOCKING SYSTEM
				===============
				[\\i] Display Info
				[\\s] 
				[1] Set Status
				[2] Task
				[3] Hours of work
				[\\q] Exit""");
	}


	public static taskEmployee search(ArrayList<taskEmployee> tm, int id){

		for (taskEmployee obj : tm) {
			if (obj.getID() == id){
				System.out.println("\nOKAY!");
				return obj;
			}
		}

		System.out.println("\nBIGO!");
		return null;
	}

}


