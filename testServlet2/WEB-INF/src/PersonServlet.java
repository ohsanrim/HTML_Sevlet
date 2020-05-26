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
		//�̸�
		out.println("<li>");
		out.println("�̸�: "+name);
		out.println("</li>");
		//����
		out.println("<li>");
		if(gender==0) out.println("����: ��");
		if(gender==1) out.println("����: ��");
		out.println("</li>");
		//���
		out.println("<li>");
		for(String data:hobby){
			out.println("���: "+data);
		}
		out.println("</li>");
		//����
		out.println("<li>");
		out.println("����: "+color);
		out.println("</li>");
		//����
		out.println("<li>");
		out.println("����: ");
		for(String data:subject){
			out.println(data);
		}
		out.println("</li>");
		out.println("</ul>");
		
		out.println("<input type=button value=�ڷ� onclick=javascript:history.go(-1)>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
	} 
}
