package in.nic.training.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.nic.training.entity.StudentInfo;

public class HibernateTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		String sid = "S1600001";
		StudentInfo studentInfo = (StudentInfo) session.get(StudentInfo.class, sid);
		studentInfo.setFirstName("test2");
		studentInfo.setLastName("test2");
		
		session.update(studentInfo);
		
		session.getTransaction().commit();
		session.close();
		
			
		

	}
}
