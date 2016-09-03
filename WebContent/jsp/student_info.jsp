<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head>
<body>
	<h2 align="center">STUDENT INFORMATION SYSTEM</h2>
	<hr />
	<fieldset>
		<legend align="center"> PERSONAL INFO </legend>
		<center>
			<br />
			<table width="100%">
				<tr>
					<td align="right" width="50%"><b>Student ID:</b></td>
					<td width="50%"><s:property value="student_id" /></td>
				</tr>
				<tr>
					<td align="right"><b>Name:</b></td>
					<td><s:property value="first_name" /> <s:property
							value="last_name" /></td>
				</tr>
				<tr>
					<td align="right"><b>D.O.B: </b></td>
					<td><s:date name="dob" format="dd-MM-yyyy" /></td>
				</tr>
				<tr>
					<td align="right"><b>Address: </b></td>
					<td><s:property value="address" />, <s:property
							value="state" /> - <s:property value="pincode" /></td>
				</tr>
				<tr>
					<td align="right"><b>Father's Name: </b></td>
					<td><s:property value="f_name" /></td>
				</tr>
				<tr>
					<td align="right"><b>Father's Contact: </b></td>
					<td><s:property value="f_contact" /></td>
				</tr>
				<tr>
					<td align="right"><b>Email: </b></td>
					<td><s:property value="email" /></td>
				</tr>
				<tr>
					<td align="right"><b>Contact: </b></td>
					<td><s:property value="contact" /></td>
				</tr>
			</table>
			<br />
		</center>
	</fieldset>
	<br />
	<fieldset>
		<legend align="center">COURSE INFO</legend>
		<center>
			<br /> <b>COURSE:</b> <i><s:property
					value="%{selected_course_id}" />-<s:property
					value="%{selected_course_name}" /></i><br /> <br /> <b>SUBJECTS:</b><br />
			<s:iterator value="selectedSubjectsName">
				<s:property />
				<br />
			</s:iterator>
			<br />
		</center>

	</fieldset>
	<table align="center">
		<tr>
			<td align="right" width="50%"><s:form
					action="EditStudentDetails">
					<s:hidden name="student_id" value="%{student_id}" />
					<s:submit value="EDIT" />
				</s:form></td>
			<td><s:form action="DeleteData">
					<s:hidden name="student_id" value="%{student_id}" />
					<s:submit value="DELETE" />
				</s:form></td>
			<td><s:form action="ViewStudentDetails">
					<s:submit value="BACK" />
				</s:form></td>
		</tr>
	</table>
</body>
</html>