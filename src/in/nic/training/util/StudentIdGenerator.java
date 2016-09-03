package in.nic.training.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentIdGenerator implements IdentifierGenerator{
	
	private String defaultPrefix = "S16";
	private int defaultNumber = 1;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object arg1) throws HibernateException {
		String student_id = "";
		String digits = "";
		Connection con = session.connection();
		try {
			java.sql.PreparedStatement pst = con
					.prepareStatement("select student_id from student_info order by student_id desc limit 1");
			ResultSet rs = pst.executeQuery();
			if (rs != null && rs.next()) {
				student_id = rs.getString("student_id");
				System.out.println(student_id);
				String prefix = student_id.substring(0, 3);
				String str[] = student_id.split(prefix);
				digits = String.format("%05d", Integer.parseInt(str[1]) + 1);
				student_id = prefix.concat(digits);
			} else {
				digits = String.format("%05d", defaultNumber);
				student_id = defaultPrefix.concat(digits);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student_id;
	}


}
