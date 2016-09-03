package in.nic.training.dao;

import java.io.Serializable;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.nic.training.dto.StudentDetails;
import in.nic.training.entity.StudentInfo;

public class StudentInfoDAO {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public String insert(StudentDetails student) {
		Session session = sessionFactory.openSession();
		String generated_student_id = "";
		try {

			session.beginTransaction();

			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setFirstName(student.getFirstName());
			studentInfo.setLastName(student.getLastName());
			studentInfo.setGender(student.getGender());
			studentInfo.setDob(student.getDob());
			studentInfo.setAddress(student.getAddress());
			studentInfo.setState(student.getState());
			studentInfo.setPincode(student.getPincode());
			studentInfo.setFName(student.getFName());
			studentInfo.setFContact(student.getFContact());
			studentInfo.setEmail(student.getEmail());
			studentInfo.setContact(student.getContact());

			studentInfo.getStudentCourseMappings();

			generated_student_id = (String) session.save(studentInfo);

			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error in adding student details to database");
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return generated_student_id;
	}

	public void update(StudentDetails student) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			
			StudentInfo studentInfo = (StudentInfo) session.get(StudentInfo.class, student.getStudentId());
			studentInfo.setFirstName(student.getFirstName());
			studentInfo.setLastName(student.getLastName());
			studentInfo.setGender(student.getGender());
			studentInfo.setDob(student.getDob());
			studentInfo.setAddress(student.getAddress());
			studentInfo.setState(student.getState());
			studentInfo.setPincode(student.getPincode());
			studentInfo.setFName(student.getFName());
			studentInfo.setFContact(student.getFContact());
			studentInfo.setEmail(student.getEmail());
			studentInfo.setContact(student.getContact());
			
			session.update(studentInfo);

			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Error in Updating details");
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void delete(String student_id) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();

			Serializable id = new String(student_id);
			Object persistentInstance = session.load(StudentInfo.class, id);
			if (persistentInstance != null) {
				session.delete(persistentInstance);
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error in deleting StudentInfo");
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
}
