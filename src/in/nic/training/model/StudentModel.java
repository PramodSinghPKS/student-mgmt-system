package in.nic.training.model;

import java.util.ArrayList;
import java.util.Date;

public class StudentModel {

	private String student_id;
	private String first_name;
	private String last_name;
	private char gender;
	private Date dob;
	private String address;
	private String state;
	private String f_name;
	private String email;
	private int pincode;
	private long f_contact;
	private long contact;
	private String selected_course_id;
	private String selected_course_name;
	private ArrayList<String> selectedSubjectsIds;
	private ArrayList<String> selectedSubjectsName;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getF_contact() {
		return f_contact;
	}

	public void setF_contact(long f_contact) {
		this.f_contact = f_contact;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getSelected_course_id() {
		return selected_course_id;
	}

	public void setSelected_course_id(String selected_course_id) {
		this.selected_course_id = selected_course_id;
	}

	public ArrayList<String> getSelectedSubjectsIds() {
		return selectedSubjectsIds;
	}

	public void setSelectedSubjectsIds(ArrayList<String> selectedSubjectsIds) {
		this.selectedSubjectsIds = selectedSubjectsIds;
	}

	public String getSelected_course_name() {
		return selected_course_name;
	}

	public void setSelected_course_name(String selected_course_name) {
		this.selected_course_name = selected_course_name;
	}

	public ArrayList<String> getSelectedSubjectsName() {
		return selectedSubjectsName;
	}

	public void setSelectedSubjectsName(ArrayList<String> selectedSubjectsName) {
		this.selectedSubjectsName = selectedSubjectsName;
	}

}
