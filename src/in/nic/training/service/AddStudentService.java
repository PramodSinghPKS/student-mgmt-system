package in.nic.training.service;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import in.nic.training.dao.StudentCourseMappingDAO;
import in.nic.training.dao.StudentInfoDAO;
import in.nic.training.dao.StudentSubjectMappingDAO;
import in.nic.training.dto.StudentDetails;
import in.nic.training.model.StudentModel;

public class AddStudentService extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private StudentModel studentModel;

	public AddStudentService(StudentModel studentModel) {
		this.setStudentModel(studentModel);
	}

	public void add(){
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setFirstName(studentModel.getFirst_name());
		studentDetails.setLastName(studentModel.getLast_name());
		studentDetails.setGender(studentModel.getGender());
		studentDetails.setDob(studentModel.getDob());
		studentDetails.setAddress(studentModel.getAddress());
		studentDetails.setState(studentModel.getState());
		studentDetails.setPincode(studentModel.getPincode());
		studentDetails.setFName(studentModel.getF_name());
		studentDetails.setFContact(studentModel.getF_contact());
		studentDetails.setEmail(studentModel.getEmail());
		studentDetails.setContact(studentModel.getContact());
		
		StudentInfoDAO studentInfoDAO = new StudentInfoDAO();
		String student_id = studentInfoDAO.insert(studentDetails);
		
		addCourseDetails(student_id);
		addSubjectsDetails(student_id);
	}
	
	public void addCourseDetails(String student_id){
		StudentCourseMappingDAO studentCourseMappingDAO = new StudentCourseMappingDAO();
		studentCourseMappingDAO.insert(student_id, studentModel.getSelected_course_id());
	}
	
	public void addSubjectsDetails(String student_id){
		ArrayList<String> selectedSubjects = new ArrayList<>();
		selectedSubjects.addAll(studentModel.getSelectedSubjectsIds());
		
		StudentSubjectMappingDAO studentSubjectMappingDAO = new StudentSubjectMappingDAO();
		studentSubjectMappingDAO.insert(student_id, selectedSubjects);
	}

	
	public StudentModel getStudentModel() {
		return studentModel;
	}

	public void setStudentModel(StudentModel studentModel) {
		this.studentModel = studentModel;
	}
}
