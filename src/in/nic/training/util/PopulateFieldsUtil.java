package in.nic.training.util;

import java.sql.SQLException;
import java.util.HashMap;

import com.opensymphony.xwork2.ModelDriven;

import in.nic.training.model.StudentModel;

public class PopulateFieldsUtil{
	private HashMap<String, String> courseList, subjectList;
	
	public String execute(){
		return "success";
	}
	
	
	public HashMap<String, String> getCourseList() throws SQLException {
		CoursesListUtil courses = new CoursesListUtil();
		courseList = new HashMap<>();
		courseList.putAll(courses.getList());
		return courseList;
	}

	public HashMap<String, String> getSubjectList() {
		SubjectsListUtil subjects = new SubjectsListUtil();
		subjectList = new HashMap<>();
		subjectList.putAll(subjects.getList());
		return subjectList;
	}
}
