package in.nic.training.dto;

import java.util.ArrayList;

public class SubjectDetails {
	private ArrayList<String> SubjectIds;
	private ArrayList<String> SubjectNames;
	
	public ArrayList<String> getSubjectIds() {
		return SubjectIds;
	}
	public void setSubjectIds(ArrayList<String> subjectIds) {
		SubjectIds = subjectIds;
	}
	public ArrayList<String> getSubjectNames() {
		return SubjectNames;
	}
	public void setSubjectNames(ArrayList<String> subjectNames) {
		SubjectNames = subjectNames;
	}
}
