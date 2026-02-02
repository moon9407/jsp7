<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JSP - 테이블 스크립트릿</title>
	<style>
	    table, th, td {
            border: 1px solid black;

        }
        table{width: 500px; text-align: center; border-collapse: collapse;}
        th,td{width: 100px; height: 40px;}
    </style>
	</head>
<body>
	<h2>스크립트릿</h2>
	<table>
	
	<%for(int i=2;i<=9;i++) {%>
		<tr>
			<td colspan="5"><% out.println(i+"단"); %></td>
		</tr>
		<%for(int j=1;j<=9;j++) {%>
			<tr>
			<td><% out.println(i); %></td>
			<td><% out.println("*"); %></td>
			<td><% out.println(j); %></td>
			<td><% out.println("="); %></td>
			<td><% out.println(i*j); %></td>
			</tr>
		<%}%>
	<%}%>
	</table>
</body>
</html>