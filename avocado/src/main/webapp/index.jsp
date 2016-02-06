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
	$("#btn_login").click(function(){
		$("#loginForm").submit();
	});
});
</script>
</head>
<body>
Hello, DoGodSoft!
<form id="loginForm" name="loginForm" action="<c:url value='/common/login.do'/>" method="post">
	<input type="text" id="user_id" name="user_id" value="tkay369" placeholder="아이디" />
	<input type="password" id="user_pw" name="user_pw" value="ktk" placeholder="비밀번호" />
	<input type="button" id="btn_login" name="btn_login" value="로그인" />
</form>
</body>
</html>