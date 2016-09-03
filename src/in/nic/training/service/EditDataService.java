package in.nic.training.service;

import in.nic.training.dao.StudentInfoDAO;
import in.nic.training.dto.StudentDetails;
import in.nic.training.model.StudentModel;

public class EditDataService {

	private StudentModel student = new StudentModel();

	public EditDataService() {
	}

	public EditDataService(StudentModel student) {
		this.setStudent(student);
	}

	public void update() {

		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setStudentId(student.getStudent_id());
		studentDetails.setFirstName(student.getFirst_name());
		studentDetails.setLastName(student.getLast_name());
		studentDetails.setGender(student.getGender());
		studentDetails.setDob(student.getDob());
		studentDetails.setAddress(student.getAddress());
		studentDetails.setState(student.getState());
		studentDetails.setPincode(student.getPincode());
		studentDetails.setFName(student.getF_name());
		studentDetails.setFContact(student.getF_contact());
		studentDetails.setEmail(student.getEmail());
		studentDetails.setContact(student.getContact());

		StudentInfoDAO studentInfoDAO = new StudentInfoDAO();
		studentInfoDAO.update(studentDetails);

	}

	public void deleteData(String student_id) {
		StudentInfoDAO studentInfoDAO = new StudentInfoDAO();
		studentInfoDAO.delete(student_id);
	}

	public StudentModel getStudent() {
		return student;
	}

	public void setStudent(StudentModel student) {
		this.student = student;
	}
}
