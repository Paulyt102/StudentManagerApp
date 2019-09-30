package ie.gmit.studentmanager;

import java.util.Scanner;

public class Menu {
	private Scanner userInput;
	private StudentManager sm1;
	private boolean keepRunning;
	
	
	public Menu() {
		userInput = new Scanner(System.in);
				sm1 = new StudentManager();
		keepRunning = true;
	}
	
	public void display() {
		while(keepRunning) {
			showOptions();
		}
	}
		
	private void showOptions() {
		System.out.println("#################");
		System.out.println("#   Student Manager v 0.9  #");
		System.out.println("##################");
		System.out.println("(1)Load Student DB");
		System.out.println("(2)Add a student");
	}
	// Create a start method which displays a menu of options to the user 
	public void start() {
		System.out.println("This is the Menu of options:");
	}
}