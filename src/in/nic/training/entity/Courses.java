package in.nic.training.entity;
// Generated Jul 6, 2016 5:02:01 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Courses generated by hbm2java
 */
@Entity
@Table(name = "courses", schema = "public")
public class Courses implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String courseId;
	private String courseName;
	private Set<StudentCourseMapping> studentCourseMappings = new HashSet<>(0);

	public Courses() {
	}

	public Courses(String courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Courses(String courseId, String courseName, Set<StudentCourseMapping> studentCourseMappings) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.studentCourseMappings = studentCourseMappings;
	}

	@Id
	@GenericGenerator(name = "course_id_seq", strategy = "in.nic.training.util.CourseIdGenerator")
	@GeneratedValue(generator = "course_id_seq")
	@Column(name = "course_id", unique = true, nullable = false, length = 5)
	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Column(name = "course_name", nullable = false, length = 30)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courses")
	public Set<StudentCourseMapping> getStudentCourseMappings() {
		return this.studentCourseMappings;
	}

	public void setStudentCourseMappings(Set<StudentCourseMapping> studentCourseMappings) {
		this.studentCourseMappings = studentCourseMappings;
	}

}
