package in.nic.training.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import in.nic.training.dao.DataRetrieveDAO;
import in.nic.training.model.StudentModel;
import in.nic.training.service.EditDataService;

public class EditDataAction extends ActionSupport implements ModelDriven<StudentModel> {

	private static final long serialVersionUID = 1L;

	private StudentModel studentDetails = new StudentModel();

	//method to retrieve student data by id for editable form
	public String makeEditable(){
		DataRetrieveDAO dao = new DataRetrieveDAO(studentDetails);
		studentDetails = dao.retrieve(studentDetails.getStudent_id());
		return SUCCESS;
	}

	public String editData(){
		EditDataService editDataService = new EditDataService(studentDetails);
		editDataService.update();
		return SUCCESS;
		
	}

	public String deleteData(){

		EditDataService ed = new EditDataService();
		ed.deleteData(studentDetails.getStudent_id());
		return SUCCESS;
	}

	@Override
	public StudentModel getModel() {
		return studentDetails;
	}
}