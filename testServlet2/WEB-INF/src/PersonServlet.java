package com.person;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
public class PersonServlet extends HttpServlet
{
	public void init(){
		System.out.println("init()...");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String[] hobby =request.getParameterValues("hobby");
		String color =request.getParameter("color");
		String [] subject =request.getParameterValues("subject");


		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		//이름
		out.println("<li>");
		out.println("이름: "+name);
		out.println("</li>");
		//성별
		out.println("<li>");
		if(gender==0) out.println("성별: 남");
		if(gender==1) out.println("성별: 여");
		out.println("</li>");
		//취미
		out.println("<li>");
		for(String data:hobby){
			out.println("취미: "+data);
		}
		out.println("</li>");
		//색깔
		out.println("<li>");
		out.println("색깔: "+color);
		out.println("</li>");
		//과목
		out.println("<li>");
		out.println("과목: ");
		for(String data:subject){
			out.println(data);
		}
		out.println("</li>");
		out.println("</ul>");
		
		out.println("<input type=button value=뒤로 onclick=javascript:history.go(-1)>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
	} 
}
