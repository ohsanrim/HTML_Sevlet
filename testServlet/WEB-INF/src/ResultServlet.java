package com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ResultServlet extends HttpServlet
{
	public void init(){
		System.out.println("init()...");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out  = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(x+"+"+y+"="+(x+y));
		out.println("<br><br>");
		out.println(x+"-"+y+"="+(x-y));
		out.println("<br><br>");
		out.println(x+"*"+y+"="+(x*y));
		out.println("<br><br>");
		out.println(x+"/"+y+"="+(Math.round((double)x/y*1000))/1000.0);
		out.println("<input type=button value=�ڷ� onclick=javascript:history.go(-1)>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
	} 
}
