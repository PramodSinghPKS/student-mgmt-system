<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<s:head />
<sx:head />
<script src="jsp/validate.js" type="text/javascript"> </script>
</head>
<body>
	<h2 align="center">STUDENT INFORMATION SYSTEM</h2>
	<hr />
	<center>
		<h1>Add New Student Form</h1>
	</center>
	<s:form action="AddStudentData" method="POST" id="AddStudentForm">
		<table align="center">
			<tr>

				<td width="50%" align="right">First Name:</td>
				<td width="50%"><s:textfield name="first_name" id="first_name" required="true"/></td>
			</tr>
			<tr>
				<td align="right">Last Name:</td>
				<td><s:textfield name="last_name" id="last_name"/></td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td><s:radio name="gender" list="#{'M':'M', 'F':'F'}" value="'M'" id="gender"/></td>
			</tr>
			<tr>
				<td align="right">DOB:</td>
				<td><sx:datetimepicker name="dob" displayFormat="dd-MMM-yyyy" id="dob"/></td>
			</tr>
			<tr>
				<td align="right">Address:</td>
				<td><s:textarea name="address" id="address"/></td>
			</tr>
			<tr>
				<td align="right">State:</td>
				<td><s:textfield name="state" id="state"/></td>
			</tr>
			<tr>
				<td align="right">Pincode:</td>
				<td><s:textfield name="pincode" id="pincode"/></td>
			</tr>
			<tr>
				<td align="right">Father's Name:</td>
				<td><s:textfield name="f_name" id="f_name"/></td>
			</tr>
			<tr>
				<td align="right">Father's Contact:</td>
				<td><s:textfield name="f_contact" id="f_contact"/></td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td><s:textfield name="email" id="email"/></td>
			</tr>
			<tr>
				<td align="right">Contact:</td>
				<td><s:textfield name="contact" id="contact"/></td>
			</tr>
			<tr align="center">
				<td colspan="2"><h3>Enter your course details...</h3></td>
			</tr>
			<tr align="center">
				<td colspan="2"><s:select name="selected_course_id"
						list="courseList" label="COURSE" headerKey="1"
						headerValue="--- Select ---" theme="xhtml" id="course_id"/></td>
			</tr>
			<tr align="center">
				<td colspan="2"><s:select name="selectedSubjectsIds"
						list="subjectList" label="Select Subjects" multiple="true"
						value="1" theme="xhtml" id="course_id"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><br /> <s:submit value="Submit"
						align="center" onclick="validate();return false;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>