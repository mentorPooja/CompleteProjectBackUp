<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" isELIgnored="false"%>
<html>
<head>
<title>Employee Page</title>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
		border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h1>Add an Employee</h1>
		<c:url var="addAction" value="/employee/add"></c:url>
		<form:form action="${addAction}" modelAttribute="employee">
			<table>
				<c:if test="${!empty employee.empName}">
				<tr>
						<td><form:label path="empId">
								<spring:message text="empId" />
						</form:label></td>
						<td><form:input path="empId" readonly="true" size="8"
							disabled="true" /> <form:hidden path="empId" /></td>
					</tr>
			</c:if>
			<tr>
					<td><form:label path="empName">
							<spring:message text="Name" />
					</form:label></td>
					<td><form:input path="empName" /></td>
			</tr>
			<tr>
					<td><form:label path="empEmail">
							<spring:message text="Email" />
					</form:label></td>
					<td><form:input path="empEmail" /></td>
			</tr>
			<tr>
					<td><form:label path="empMobile">
							<spring:message text="Mobile" />
					</form:label></td>
					<td><form:input path="empMobile" /></td>
			</tr>
						<tr>
				<td><form:label path="empGender">
						<spring:message text="Gender" />
					</form:label></td>
					<td><form:input path="empGender" /></td>
			</tr>

			<tr>
				<td><form:label path="empAddress">
						<spring:message text="Address" />
					</form:label></td>
				<td><form:input path="empAddress" /></td>
			</tr>

			<tr>
				<td><form:label path="empCity">
						<spring:message text="City" />
					</form:label></td>
				<td><form:input path="empCity" /></td>
			</tr>


			<tr>
				<td><form:label path="empNationality">
						<spring:message text="Nationality" />
					</form:label></td>
				<td><form:input path="empNationality" /></td>
			</tr>
				<tr>
				<td><form:label path="empDob">
						<spring:message text="Date Of Birth" />
					</form:label></td>
				<td><form:input path="empDob" /></td>
			</tr>

			<tr>
				<td><form:label path="empRole">
						<spring:message text="Role" />
					</form:label></td>
				<td><form:input path="empRole" /></td>
			</tr>

			<tr>
				<td><form:label path="empPassword">
						<spring:message text="Password" />
					</form:label></td>
				<td><form:input path="empPassword" /></td>
			</tr>

			<tr>
				<td><form:label path="empStatus">
						<spring:message text="Status" />
					</form:label></td>
				<td><form:input path="empStatus" /></td>
			</tr>

			<tr>
				<td><form:label path="IBUName">
						<spring:message text="IBU Name" />
					</form:label></td>
				<td><form:input path="IBUName" /></td>
			</tr>


			<tr>
				<td><form:label path="supervisorId">
						<spring:message text="Supervisor Id" />
					</form:label></td>
				<td><form:input path="supervisorId" /></td>
			</tr>

			<tr>
				<td><form:label path="supervisorName">
						<spring:message text="Supervisor Name" />
					</form:label></td>
				<td><form:input path="supervisorName" /></td>
			</tr>

			<tr>
				<td><form:label path="supervisorContact">
						<spring:message text="Supervisor Contact" />
					</form:label></td>
				<td><form:input path="supervisorContact" /></td>
			</tr>
			
			
			<tr>
				<td colspan="2"><c:if test="${!empty employee.empName}">
						<input type="submit"
							value="<spring:message text="Edit Employee"/>" />
					</c:if> <c:if test="${empty employee.empName}">
						<input type="submit" value="<spring:message text="Add Employee"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Employees List</h3>
		<c:if test="${!empty employees}">
		<table class="tg">
			<tr>
				<th width="80">Employee ID</th>
				<th width="120">Employee Name</th>
				<th width="120">Employee Email</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
				<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.empId}</td>
					<td>${employee.empName}</td>
					<td>${employee.empEmail}</td>
					<td><a href="<c:url value='/edit/${employee.empId}' />">Edit</a></td>
					<td><a href="<c:url value='/remove/${employee.empId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
  
</body>
</html>