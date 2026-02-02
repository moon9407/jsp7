<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp 태그 - 스크립트릿</title>
	</head>
	<body>
	<h2>jsp태그</h2>
	<%-- 1.jsp주석 :실행 시 코드에 주석이 보이지 않음 --%>
	<!-- html주석 : 실행 시 코드에 주석이 보여짐 -->
	<!-- 2.스크립트릿: 자바코드를 작성하는 영역 -->
	<% 
		int[] num = {1,2,3};
		int a = 10;		
		Arrays.toString(num);
	%> 
	<!-- 3.표현식: 자바코드의 결과를 출력하는 영역 -->
	<h4><%= a %></h4> 
	<!-- 4.선언식: 자바코드를 멤버변수, 메서드 영역에 작성하는 영역 -->
	<%! int b = 10; %> 
	<!-- 5.지시자: import,최초선언 시 사용 -->
	<%-- <%@ %> --%>
	
	</body>
</html>