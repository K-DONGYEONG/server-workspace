<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.goodee.model.vo.*, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 목록</h1>
	<%
	ArrayList<memberVO> list = (ArrayList<memberVO>)request.getAttribute("list");
	%>

	<%
	for (memberVO m : list) {
	%>
	<%=m.getUserName()%> <%= m.getGender() %> <%= m.getAge() %> <%= m.getAddress() %> <%= m.getPhone() %><br>
	<br>

	<%
	}
	%>

</body>
</html>