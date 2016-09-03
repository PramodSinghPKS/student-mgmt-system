package in.nic.training.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SubjectIdGenerator implements IdentifierGenerator {

	private String defaultPrefix = "SUB";
	private int defaultNumber = 1;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object arg1) throws HibernateException {
		String subject_id = "";
		String digits = "";
		Connection con = session.connection();
		try {
			java.sql.PreparedStatement pst = con
					.prepareStatement("select subject_id from subjects order by subject_id desc limit 1");
			ResultSet rs = pst.executeQuery();
			if (rs != null && rs.next()) {
				subject_id = rs.getString("subject_id");
				System.out.println(subject_id);
				String prefix = subject_id.substring(0, 3);
				String str[] = subject_id.split(prefix);
				digits = String.format("%03d", Integer.parseInt(str[1]) + 1);
				subject_id = prefix.concat(digits);
			} else {
				digits = String.format("%03d", defaultNumber);
				subject_id = defaultPrefix.concat(digits);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return subject_id;
	}

}
