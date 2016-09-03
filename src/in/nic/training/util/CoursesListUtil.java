package in.nic.training.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class CoursesListUtil {

	String query = "SELECT * FROM courses";

	private HashMap<String, String> courseList;// Stores the course_id and course name

	// method to get list of courses
	public HashMap<String, String> getList() {

		try {
			// Code to add courses to hash map
			Connection conn = DBUtil.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			courseList = new HashMap<>();
			while (rs.next()) {
				courseList.put(rs.getString(1), rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println("Error in retrieving course list from courses table");
			e.printStackTrace();
		}

		return courseList;
	}

}