package servlet_test_project.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value = "/login")

public class LoginController implements Servlet {
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String user=req.getParameter("myUser");
		String pass=req.getParameter("myPass");
		
		PrintWriter printWriter = res.getWriter();
		
		if(user.equals("amit")&&pass.equals("123")) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("myprofile.jsp");
			dispatcher.forward(req, res);
		}else {
			printWriter.write("<html><body>");
			printWriter.write("<h3 style='color:red'>Invalid user or pass</h3>");
			printWriter.write("</body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, res);
		}
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
