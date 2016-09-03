<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Info</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2 align="center">STUDENT INFORMATION SYSTEM</h2>
	<hr />
	<p>
		<a href="index.jsp">Home</a>
	</p>
	<table border="1" bordercolor="#000" cellspacing="0" width="100%">
		<tr bgcolor="#ff1100">
			<th>STUDENT_ID</th>
			<th>NAME</th>
			<th>COURSE</th>
			<th>SUBJECTS</th>
			<th colspan="2">EDIT</th>
		</tr>
		<s:iterator value="studentsList" var="list">
			<tr>
				<td align="center"><s:property value="student_id" /></td>
				<td><s:property value="first_name" />&nbsp;<s:property
						value="last_name" /></td>
				<td align="center"><s:property value="selected_course_name" /></td>
				<td><s:iterator value="selectedSubjectsName">
						<s:property />
						<br />
					</s:iterator></td>
				<td align="center"><s:form id="f1" action="ViewByID"
						method="POST">
						<s:hidden name="student_id" value="%{student_id}" />
						<%-- <s:submit value="EDIT" /> --%>
					</s:form> <a href="javascript:{}"
					onclick="document.getElementById('f1').submit();"> <img
						src="image/edit.png" />
				</a></td>
				<td><s:form id="f2" action="DeleteData">
						<s:hidden name="student_id" value="%{student_id}" />
						<%-- <a href="<s:url action='hello'/>">Hello World</a> --%>
						<a href="javascript:{}"
							onclick="document.getElementById('f2').submit();"> <img
							src="image/delete.png" />
						</a>
					</s:form></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>