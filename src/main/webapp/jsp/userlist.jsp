<%@include file="head.jsp"%>
<%@include file="navigation.jsp"%>
<h1>Spring Application - Hello</h1>
<p>
	Greetings, ${user.name}!
	<c:if test="${not empty userList[0]}">(and ${userList[0].name})</c:if>
</p>
<form:form method="POST" commandName="user" action="${baseURL}/user">
	<table>
		<tr>
			<td><form:label path="name">Name:</form:label></td>
			<td><form:input type="text" path="name" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Set" /></td>
		</tr>
	</table>
	<table>
		<thead>
			<tr>
				<th>Number</th>
				<th>ID</th>
				<th>Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="usr" varStatus="i" items="${userList}">
				<tr>
					<td>${i.count }</td>
					<td>${usr.id }</td>
					<td><c:choose>
							<c:when test="${config.admin.id eq usr.id }">
								<b>${usr.name}</b>
							</c:when>
							<c:otherwise>${usr.name}</c:otherwise>
						</c:choose></td>
					<td><c:if test="${config.admin.id ne usr.id }">
							<a href="${baseURL}/user/${usr.id}/delete">[delete]</a>
							<br />
							<a href="${baseURL}/user/${usr.id}/adminify">[admin]</a>
						</c:if></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</form:form>
<%@include file="foot.jsp"%>