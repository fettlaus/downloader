<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<table style="width: 100%">
	<tr>
		<td><a href="${pageContext.request.contextPath}">Home</a></td>
		<td><a href="${pageContext.request.contextPath}/hello">Greeter</a></td>
		<td>Greetings, ${user.name}</td>
	</tr>
</table>
<hr>