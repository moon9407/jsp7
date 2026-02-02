package com.java.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/Pro4")
public class Pro4 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		// 넘어온 데이터 확인방법 - getParameter("파라미터명"), getParameterValues("파라미터명")-checkbox일때만
		request.setCharacterEncoding("utf-8"); //post 방식 한글처리
		String id = request.getParameter("id"); // 파라미터명 id로 넘어온 데이터 받기
		String pw = request.getParameter("pw"); // 파라미터명 pw로 넘어온 데이터 받기
		String name = request.getParameter("name"); // 파라미터명 name로 넘어온 데이터 받기
		String[] hobby = request.getParameterValues("hobby"); // checkbox일때 hobby로 넘어온 데이터 받기
		Enumeration e = request.getParameterNames(); //파라미터명 전체 가져오기, 거의 안씀
		while(e.hasMoreElements()) {
			String hobbys = (String)e.nextElement();
			System.out.println("취미 : "+hobbys);
		}
		System.out.println(Arrays.toString(hobby));
		
		response.setContentType("text/html; charset=utf-8"); //응답데이터 한글처리
		PrintWriter writer = response.getWriter(); //응답데이터 출력스트림
		writer.println("<html>");  //HTML문서 시작
		writer.println("<head><title>결과</title></head>");  //문서헤드 및 타이틀
		writer.println("<body>"); //문서바디 시작
		writer.println("<h2>결과화면 출력</h2>"); // 제목출력
		writer.println("<h3>아이디 : "+id+"</h3>"); // 아이디출력
		writer.println("<h3>아이디 : "+pw+"</h3>"); // 아이디출력
		writer.println("<h3>이름 : "+name+"</h3>");  // 이름출력
		writer.println("</body>");  //문서바디 끝
		writer.println("</html>");  //HTML문서 끝
		writer.close();  //출력스트림 닫기
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
