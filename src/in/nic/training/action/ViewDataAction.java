package in.nic.training.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import in.nic.training.dao.DataRetrieveDAO;
import in.nic.training.model.StudentModel;
import in.nic.training.service.ViewDataService;

public class ViewDataAction extends ActionSupport implements ModelDriven<StudentModel> {

	private static final long serialVersionUID = 1L;

	private List<StudentModel> studentsList = new ArrayList<>();
	private StudentModel studentDetails = new StudentModel();

	public String viewAll() {
		ViewDataService view = new ViewDataService();
		ArrayList<StudentModel> studentDetailsList = view.viewAll();
		studentsList.addAll(studentDetailsList);
		return SUCCESS;
	}

	public String viewById() {
		DataRetrieveDAO dao = new DataRetrieveDAO(studentDetails);
		studentDetails = (StudentModel)dao.retrieve(studentDetails.getStudent_id());
		return SUCCESS;
	}

	@Override
	public StudentModel getModel() {
		return studentDetails;
	}

	public List<StudentModel> getStudentsList() {
		return studentsList;
	}

}