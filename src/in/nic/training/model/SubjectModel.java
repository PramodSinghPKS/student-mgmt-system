package in.nic.training.model;

import java.util.ArrayList;

public class SubjectModel {
	private String subject_id, subject_code, subject_name;
	private ArrayList<String> selectedSubjects;

	public String getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public ArrayList<String> getSelectedSubjects() {
		return selectedSubjects;
	}

	public void setSelectedSubjects(ArrayList<String> selectedSubjects) {
		this.selectedSubjects = selectedSubjects;
	}

	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", subject_code=" + subject_code + ", subject_name=" + subject_name
				+ ", selectedSubjects=" + selectedSubjects + "]";
	}
}
