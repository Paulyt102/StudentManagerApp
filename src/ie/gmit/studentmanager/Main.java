package ie.gmit.studentmanager;


public class Main {
    
    public static void main(String[] args){
        // Create a new menu object
    	Menu menuObj1 = new Menu();
    	// Run the start method of the Menu object 
    	menuObj1.start();
    	
     StudentManager sm1 = new StudentManager();
     
 
     
     System.out.println(sm1.students.size());
     
     Student student1 = new Student("G00350075");
     Student student2 = new Student("G00350076");
     Student student3 = new Student("G00350077");
     
     sm1.add(student1);
     sm1.add(student2);
     sm1.add(student3);
     
     sm1.delete(student1);
   
     
    System.out.println(sm1.findTotalStudents());
    
    Menu menuObject1 = new Menu();
   menuObject1.display();
   
    	
    /*	Student student1 = new Student("G00350075");
    	System.out.println( student1.getStudentId() );
    	
    	StudentManager sm1 = new StudentManager();
    	Student student2 = new Student("G00350075");
    	Student student3 = new Student("G00350075");
    	Student student4 = new Student("G00350075");
    	Student student5 = new Student("G00350075");
    	Student student6 = new Student("G00350075");
    	Student student7 = new Student("G00350075");
    	Student student8 = new Student("G00350075");
    	Student student9 = new Student("G00350075");
    	Student student10 = new Student("G00350075");
    	
    	boolean status;
    	status= sm1.add(student1);
    	System.out.println(status);
    	
    	status= sm1.add(student2);
    	System.out.println(status);
    	
    	status= sm1.add(student3);
    	System.out.println(status);
    	
    	status= sm1.add(student4);
    	System.out.println(status);
    	
    	status= sm1.add(student5);
    	System.out.println(status);
    	
    	status= sm1.add(student6);
    	System.out.println(status);
    	
    	status= sm1.add(student7);
    	System.out.println(status);
    	
    	status= sm1.add(student8);
    	System.out.println(status);
    	
    	status= sm1.add(student9);
    	System.out.println(status);
    	
    	
    	status= sm1.add(student10);
    	System.out.println(status);
    	
    	
    	
    	status =sm1.delete("g00350075");
    	System.out.println(status);
   
    	*/
    }
}
