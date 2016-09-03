<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
<s:head/>
<sx:head />
</head>
<body>
	<h2 align="center">STUDENT INFORMATION SYSTEM</h2>
	<hr />
	<h3 align="center">
		<u>EDIT INFORMATION</u>
	</h3>
	<fieldset>
		<legend align="center">YOUR DETAILS</legend>
		<center>
			<s:form action="EditData" method="POST" theme="xhtml">
				<s:hidden name="student_id" value="%{student_id}" />
				<s:textfield name="first_name" label="First Name" theme="xhtml"/>
				<s:textfield name="last_name" label="Last Name" theme="xhtml"/>
				<s:radio name="gender" label="Gender" list="#{'M':'M', 'F':'F'}" theme="xhtml"/>
				<sx:datetimepicker name="dob" label="D.O.B"
					displayFormat="dd-MMM-yyyy" />
				<s:textfield name="address" label="Address" theme="xhtml"/>
				<s:textfield name="state" label="State" theme="xhtml"/>
				<s:textfield name="pincode" label="Pincode" theme="xhtml"/>
				<s:textfield name="f_name" label="Father's Name " theme="xhtml"/>
				<s:textfield name="f_contact" label="Father's Contact No. " theme="xhtml"/>
				<s:textfield name="email" label="Email " theme="xhtml"/>
				<s:textfield name="contact" label="Contact No. " theme="xhtml"/>
				<br />
				<%-- <s:select name="selected_course_id" list="courseList" label="COURSE "
					headerKey="1" headerValue="--- Select ---" theme="xhtml" />

				<s:select name="selectedSubjectsIds" list="subjectList"
					label="Select Subjects* " multiple="true" value = "selectedSubjectsIds" theme="xhtml"/> --%>

				<s:submit value="Submit" align="center" />
			</s:form>

		</center>
	</fieldset>
	<center>
	<%-- <s:label
		value="*You need to select all your subjects in case you edit subjects" /></center> --%>
</body>
</html>