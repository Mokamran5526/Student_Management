package servlet_test_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_test_project.dto.Student;
import servlet_test_project.service.StudentService;
@WebServlet (value="/editStudent")
public class EditStudentController extends HttpServlet {
	


@Override
public void destroy() {
	System.out.println("server is destroyed...");
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("do post method");
	int id = Integer.parseInt(req.getParameter("myId"));
	String myName = req.getParameter("myName");
	String myEmail = req.getParameter("myEmail");
	String myGender = req.getParameter("myGender");
	long myPhone = Long.parseLong(req.getParameter("myPhone"));
	
	Student student = new Student(id, myName, myEmail, myGender, myPhone);
	
	StudentService service = new StudentService();
	
	service.updateStudentService(student);
	
	req.getRequestDispatcher("display.jsp").forward(req, resp);
	
}

@Override
public void init() throws ServletException {
	System.out.println("init method called");
}
}