package in.nic.training.dto;

import java.util.ArrayList;

public class StudentViewDto {
	private String studentId;
	private String lastName;
	private String firstName;
	private String course_name;
	private ArrayList<String> subject_list;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public ArrayList<String> getSubject_list() {
		return subject_list;
	}
	public void setSubject_list(ArrayList<String> subject_list) {
		this.subject_list = subject_list;
	}
	
	
}

