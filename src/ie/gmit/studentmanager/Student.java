package ie.gmit.studentmanager;

import java.util.Date;
public class Student {
	private String studentId;
	private String firstName;
	private String surname;
	private Date dob;
	private Address address;
	private Course course;
	
	
	public Student(String sid) {
		this.studentId = sid;
	}
	
	public Student(String sid, String fname, String sname, Date dob) {
		this(sid);
		this.firstName = fname;
		this.surname = sname;
		this.dob = dob;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.student = studentId;
	}
}
