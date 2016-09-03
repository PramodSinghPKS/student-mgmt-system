package in.nic.training.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import in.nic.training.model.StudentModel;
import in.nic.training.service.AddStudentService;

public class AddDataAction extends ActionSupport implements ModelDriven<StudentModel> {

	private static final long serialVersionUID = 1L;

	private StudentModel studentModel = new StudentModel();

	public String execute(){
		AddStudentService addStudent = new AddStudentService(studentModel);
		addStudent.add();
		return SUCCESS;
	}
	
	@Override
	public StudentModel getModel() {
		return studentModel;
	}
}