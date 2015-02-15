<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="car">

	<table>
		<tr>
			<td><form:label path="brand">
				<spring:message code="label.brand" />
			</form:label></td>
			<td><form:input path="brand" /></td>
		</tr>
		<tr>
			<td><form:label path="modelcar">
				<spring:message code="label.modelcar" />
			</form:label></td>
			<td><form:input path="modelcar" /></td>
		</tr>
		<tr>
			<td><form:label path="age">
				<spring:message code="label.age" />
			</form:label></td>
			<td><form:input path="age" /></td>
		</tr>
		<tr>
			<td><form:label path="number">
				<spring:message code="label.number" />
			</form:label></td>
			<td><form:input path="number" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.addcar"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.car" /></h3>
<c:if test="${!empty carList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.brand" /></th>
			<th><spring:message code="label.modelcar" /></th>
			<th><spring:message code="label.age" /></th>
			<th><spring:message code="label.number" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${carList}" var="car">
			<tr>
				<td>${car.brand}</td>
				<td>${car.modelcar}</td>
				<td>${car.age}</td>
				<td>${car.number}</td>
				<td><a href="delete/${car.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>