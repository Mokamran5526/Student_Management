package servlet_test_project.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentController implements Servlet {
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
    
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String myName=req.getParameter("myName");
		
		long myPhone =Long.parseLong(req.getParameter("myPhone"));
		
		PrintWriter printWriter = res.getWriter();
		
		printWriter.write("<html><body>");
		printWriter.write("<h3 style='color:red'>"+myName+"</h3>");
		printWriter.write("<h3>"+myPhone+"</h3>");
		printWriter.write("</body></html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.include(req, res);
		
	}
}
