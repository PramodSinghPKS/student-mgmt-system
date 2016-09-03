package in.nic.training.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.nic.training.entity.StudentInfo;
import in.nic.training.entity.StudentSubjectMapping;
import in.nic.training.entity.Subjects;
import in.nic.training.model.StudentModel;

//import entity classes

public class StudentSubjectMappingDAO {
	StudentModel student = new StudentModel();

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public void insert(String student_id, ArrayList<String> selectedSubjects) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();

			ArrayList<String> subjectsIds = new ArrayList<>();
			subjectsIds.addAll(selectedSubjects);

			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setStudentId(student_id);

			for (int idx = 0; idx < subjectsIds.size(); idx++) {
				Subjects subjects = new Subjects();

				StudentSubjectMapping studentSubjectMapping = new StudentSubjectMapping();
				studentSubjectMapping.setStudentInfo(studentInfo);
				subjects.setSubjectId(subjectsIds.get(idx));
				studentSubjectMapping.setSubjects(subjects);
				session.save(studentSubjectMapping);
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void update(String student_id, String course_id) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			
			
			
			
			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
