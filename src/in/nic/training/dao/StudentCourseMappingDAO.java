package in.nic.training.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.nic.training.entity.Courses;
import in.nic.training.entity.StudentCourseMapping;
import in.nic.training.entity.StudentInfo;
import in.nic.training.model.StudentModel;

//import entity classes

public class StudentCourseMappingDAO {
	StudentModel student = new StudentModel();
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public void insert(String student_id, String course_id) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();

			Courses courses = new Courses();
			courses.setCourseId(course_id);

			StudentInfo studentInfo = new StudentInfo();
			studentInfo.setStudentId(student_id);

			StudentCourseMapping studentCourseMapping = new StudentCourseMapping();
			studentCourseMapping.setCourses(courses);
			studentCourseMapping.setStudentInfo(studentInfo);

			session.save(studentCourseMapping);

			session.getTransaction().commit();

		} catch (Exception e) {
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void update() throws SQLException {

	}
}
