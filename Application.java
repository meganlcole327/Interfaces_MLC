

public class Application {

	public static void main(String[] args) {
		
		//Test Program 1
		
		System.out.println("Test Program 1: ");
		
		testRational(350000, 140, 350001, 140);
		testRational(123, 234, 132, 243);
		testRational(12, 13, 14, 15);
		testRational(195, 105, 205, 100);
		testRational(1900, 45, 3800, 90);
		
		System.out.println("\n===========================================================\n\nTest Program 2:\n\nTest Task class: \n");
		
		//Test Program 2
		//Test Task
		
		Task task1 = new Task("Task 1");
		Task task2 = new Task("Task 2");
		
		//Set task1 and task2
		
		task1.setStatus(Task.Status.COMPLETE);
		task1.setPriority(Priority.MED_PRIORITY);
		
		task2.setStatus(Task.Status.IN_PROCESS);
		task2.setPriority(Priority.MAX_PRIORITY);
		
		System.out.println("Task 1: " + task1.toString());
		System.out.println("Task 2: " + task2.toString());
		
		//compare task1 to task2
		
		System.out.println("Comparing Task 1 and Task 2: " + task1.compareTo(task2));
		
		//change task1 to set equal to task2
		
		task1.setPriority(Priority.MAX_PRIORITY);
		
		System.out.println("Task 1: " + task1.toString());
		System.out.println("Task 2: " + task2.toString());
		
		//compare task1 to task2 after setting task1 equal task2
		
		System.out.println("Comparing Task 1 and Task 2: " + task1.compareTo(task2));
		
		System.out.println("\n_____\n\nTest Process class: \n");
		
		//Test Process
		
		Process process1 = new Process("PID1");
		Process process2 = new Process("PID2");
		
		//set process1 and process2
		
		process1.setPriority(Priority.MED_PRIORITY);
		process2.setPriority(Priority.MIN_PRIORITY);
		
		System.out.println("Process 1: " + process1.toString());
		System.out.println("Process 2: " + process2.toString());
		
		//compare process 1 and process2
		
		System.out.println("Comparing Process 1 to Process 2: " + process1.compareTo(process2));
		
		//change process2 to equal to process1
		
		process2.setPriority(Priority.MED_PRIORITY);
		
		System.out.println("Process 1: " + process1.toString());
		System.out.println("Process 2: " + process2.toString());
		
		//compare process 1 to process2 after setting process1 = process2
		
		System.out.println("Comparing Process 1 to Process 2: " + process1.compareTo(process2));
		
	}

	private static void testRational(int op1num, int op1den, int op2num, int op2den) {
		RationalNumber r1 = new RationalNumber(op1num, op1den);
		RationalNumber r2 = new RationalNumber(op2num, op2den);
		// RationalNumber r3, r4, r5, r6, r7;

		System.out.println("_____\n");
		System.out.println("First rational number: " + r1);
		System.out.println("Second rational number: " + r2);

		if (r1.compareRational(r2))
			System.out.println("r1 and r2 are equal.");
		else
			System.out.println("r1 and r2 are NOT equal.");

	} // end main

} // end class
