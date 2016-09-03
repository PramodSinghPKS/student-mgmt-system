<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<h2 align="center">STUDENT INFORMATION SYSTEM</h2>
	<hr />
	<fieldset>
		<table align="center">
			<tr>
				<td><s:form action="AddDetailsForm" method="POST">
						<s:submit value="Add New Student Data" />
					</s:form></td>
				<td><s:form action="ViewStudentDetails" method="POST">
						<s:submit value="View Student Info" />
					</s:form></td>
			</tr>
		</table>
	</fieldset>
</body>
</html>