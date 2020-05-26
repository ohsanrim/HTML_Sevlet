package com.hello;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class HelloServlet extends HttpServlet  //main이 없는 콜백의 개념이다. 때문에 tomcat에서 init()만 호출한다. 
{
	public void init(){
		System.out.println("init()...");
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("doGet()...");
		
		//응답
		resp.setContentType("text/html;charset=utf-8");  //이제부터 쓰는 모든 text는 모두 html임을 명시해준다. 
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("HelloServlet!!<br>");
		out.println("안녕하세요 서블릿!!<br>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy(){
		System.out.println("destroy()...");
	} 
}