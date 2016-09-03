package in.nic.training.service;

import java.util.ArrayList;

import in.nic.training.dao.DataRetrieveDAO;
import in.nic.training.dto.StudentViewDto;
import in.nic.training.model.StudentModel;

public class ViewDataService {

	// method to view all student info
	public ArrayList<StudentModel> viewAll() {
		
		ArrayList<StudentModel> studentDetailsList = new ArrayList<>();
		
		ArrayList<StudentViewDto> studentViewList = new ArrayList<StudentViewDto>();
		
		DataRetrieveDAO dao = new DataRetrieveDAO();
		studentViewList.addAll(dao.retrieve());
		
		for (StudentViewDto s:studentViewList) {
			StudentModel studentDetailsModel = new StudentModel();
			studentDetailsModel.setStudent_id(s.getStudentId());
			studentDetailsModel.setFirst_name(s.getFirstName());
			studentDetailsModel.setLast_name(s.getLastName());
			studentDetailsModel.setSelected_course_name(s.getCourse_name());
			studentDetailsModel.setSelectedSubjectsName(s.getSubject_list());

			studentDetailsList.add(studentDetailsModel);
		}

		return studentDetailsList;
	}
	
	public StudentModel viewById(String student_id){
		StudentModel studentDetails = new StudentModel();
		
		DataRetrieveDAO dao = new DataRetrieveDAO();
		studentDetails = dao.retrieve(student_id);
		
			
		return studentDetails;
	}
}