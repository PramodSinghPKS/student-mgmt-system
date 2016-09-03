package in.nic.training.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CourseIdGenerator implements IdentifierGenerator {
	private String defaultPrefix = "C";
	private int defaultNumber = 1;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object arg1) throws HibernateException {
		String course_id = "";
		String digits = "";
		Connection con = session.connection();
		try {
			java.sql.PreparedStatement pst = con
					.prepareStatement("select course_id from subjects order by course_id desc limit 1");
			ResultSet rs = pst.executeQuery();
			if (rs != null && rs.next()) {
				course_id = rs.getString("course_id");
				System.out.println(course_id);
				String prefix = course_id.substring(0, 1);
				String str[] = course_id.split(prefix);
				digits = String.format("%03d", Integer.parseInt(str[1]) + 1);
				course_id = prefix.concat(digits);
			} else {
				digits = String.format("%03d", defaultNumber);
				course_id = defaultPrefix.concat(digits);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return course_id;
	}
}
