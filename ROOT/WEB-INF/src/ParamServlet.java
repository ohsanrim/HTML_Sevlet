package com.param;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ParamServlet extends HttpServlet 
{
	public void init(){
		
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//데이터
		String name=request.getParameter("name");  //name이란 변수의 값은 받아와리
		int age = Integer.parseInt(request.getParameter("age"));
		//응답
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(name+"님의 나이는 "+age+"살 이므로 ");
		if(age>=19){
			out.println("성인입니다. ");
		} else {
			out.println("청소년입니다.");
		}
		out.println("<br><br>");
		out.println("<input type=button value=뒤로 onclick=javascript:location.href='http://localhost:8080/parameter.html'>");
		out.println("<input type=button value=뒤로 onclick=javascript:history.go(-1)>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
		
	}
}
//http://localhost:8080/ParamServlet 주소로 값을 넘김