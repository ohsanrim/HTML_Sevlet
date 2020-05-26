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
		//������
		String name=request.getParameter("name");  //name�̶� ������ ���� �޾ƿ͸�
		int age = Integer.parseInt(request.getParameter("age"));
		//����
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(name+"���� ���̴� "+age+"�� �̹Ƿ� ");
		if(age>=19){
			out.println("�����Դϴ�. ");
		} else {
			out.println("û�ҳ��Դϴ�.");
		}
		out.println("<br><br>");
		out.println("<input type=button value=�ڷ� onclick=javascript:location.href='http://localhost:8080/parameter.html'>");
		out.println("<input type=button value=�ڷ� onclick=javascript:history.go(-1)>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
		
	}
}
//http://localhost:8080/ParamServlet �ּҷ� ���� �ѱ�