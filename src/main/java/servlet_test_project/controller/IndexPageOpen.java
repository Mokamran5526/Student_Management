package servlet_test_project.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class IndexPageOpen  implements Servlet{
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
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("myregisteration.jsp");
		dispatcher.forward(req, res);
		
	}
}
