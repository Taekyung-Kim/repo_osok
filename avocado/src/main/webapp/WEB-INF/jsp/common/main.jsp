<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
});
</script>
</head>
<body>
Welcome, DoGodSoft Members!
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>role</th>
		</tr>
	</thead>
	<c:forEach items="${userList }" var="result" varStatus="status">
		<tbody>
			<tr>
				<td>${result.user_id }</td>
				<td>${result.user_name }</td>
				<td>${result.user_role }</td>
			</tr>
		</tbody>
	</c:forEach>
</table>
</body>
</html>