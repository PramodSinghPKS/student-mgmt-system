package in.nic.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.nic.training.dto.StudentViewDto;
import in.nic.training.entity.StudentCourseMapping;
import in.nic.training.entity.StudentSubjectMapping;
import in.nic.training.model.StudentModel;

public class DataRetrieveDAO {
	
	StudentModel studentDetails = new StudentModel();
	
	public DataRetrieveDAO(){}
	
	public DataRetrieveDAO(StudentModel studentDetails){
		this.studentDetails = studentDetails;
	}

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public ArrayList<StudentViewDto> retrieve() {

		Session session = sessionFactory.openSession();
		ArrayList<StudentViewDto> studentDetailsList = new ArrayList<>();

		try {

			session.beginTransaction();

			String hql = "FROM StudentCourseMapping";
			List<StudentCourseMapping> list = session.createQuery(hql).list();
			for (StudentCourseMapping scm : list) {

				StudentViewDto studentDetails = new StudentViewDto();

				studentDetails.setStudentId(scm.getStudentInfo().getStudentId());
				studentDetails.setFirstName(scm.getStudentInfo().getFirstName());
				studentDetails.setLastName(scm.getStudentInfo().getLastName());
				studentDetails.setCourse_name(scm.getCourses().getCourseName());

				hql = "FROM StudentSubjectMapping where student_id = :student_id";

				List<StudentSubjectMapping> ssmList = session.createQuery(hql)
						.setParameter("student_id", scm.getStudentInfo().getStudentId()).list();
				ArrayList<String> subjectsList = new ArrayList<>();
				for (StudentSubjectMapping ssm : ssmList) {
					subjectsList.add(ssm.getSubjects().getSubjectName());
				}
				studentDetails.setSubject_list(subjectsList);
				studentDetailsList.add(studentDetails);
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Error in retrieving student details to database");
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return studentDetailsList;
	}
	
	public StudentModel retrieve(String student_id) {

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			String hql = "FROM StudentCourseMapping where student_id = :sid";
			List<StudentCourseMapping> list = session.createQuery(hql).setParameter("sid", student_id).list();
			
			for (StudentCourseMapping scm : list) {

				studentDetails.setStudent_id(scm.getStudentInfo().getStudentId());
				studentDetails.setFirst_name(scm.getStudentInfo().getFirstName());
				studentDetails.setLast_name(scm.getStudentInfo().getLastName());
				studentDetails.setGender(scm.getStudentInfo().getGender());
				studentDetails.setDob(scm.getStudentInfo().getDob());
				studentDetails.setAddress(scm.getStudentInfo().getAddress());
				studentDetails.setState(scm.getStudentInfo().getState());
				studentDetails.setPincode(scm.getStudentInfo().getPincode());
				studentDetails.setF_name(scm.getStudentInfo().getFName());
				studentDetails.setF_contact(scm.getStudentInfo().getFContact());
				studentDetails.setEmail(scm.getStudentInfo().getEmail());
				studentDetails.setContact(scm.getStudentInfo().getContact());
				studentDetails.setSelected_course_id(scm.getCourses().getCourseId());
				studentDetails.setSelected_course_name(scm.getCourses().getCourseName());

				hql = "FROM StudentSubjectMapping where student_id = :sid";

				List<StudentSubjectMapping> ssmList = session.createQuery(hql).setParameter("sid", student_id).list();
				ArrayList<String> subjectsList = new ArrayList<>();
				for (StudentSubjectMapping ssm : ssmList) {
					subjectsList.add(ssm.getSubjects().getSubjectName());
				}
				studentDetails.setSelectedSubjectsName(subjectsList);
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Error in retrieving student details to database");
			if (session.getTransaction() != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return studentDetails;
	}
}