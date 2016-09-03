package in.nic.training.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class SubjectsListUtil {

	Connection conn = DBUtil.connect();
	HashMap<String, String> subjectList;

	String query = "SELECT * FROM subjects";

	// Method to get a list of subjects
	public HashMap<String, String> getList() {
		
		try {
			
			// code to add subjects to hash map from subjects table
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			subjectList = new HashMap<>();
			while (rs.next()) {
				subjectList.put(rs.getString(1), rs.getString(3));
			
			}
		} catch (Exception e) {
			
			System.out.println("Error in retrieving list of subjects");
			e.printStackTrace();
			
		}
		
		return subjectList;
	}
}
