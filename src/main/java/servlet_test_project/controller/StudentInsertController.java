package servlet_test_project.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_test_project.dto.Student;
import servlet_test_project.service.StudentService;

@WebServlet(value="/insertStudent")
public class StudentInsertController extends GenericServlet {
	@Override
	public void service (ServletRequest req ,ServletResponse res)throws ServletException, IOException {
		
		
       int id =Integer.parseInt(req.getParameter("myId"));
       String myName=req.getParameter("myName");
       String myEmail=req.getParameter("myEmail");
       String myGender=req.getParameter("myGender");
	   long myPhone =Long.parseLong(req.getParameter("myPhone"));
		
		Student student= new Student(id, myName, myEmail, myGender, myPhone);
		
		StudentService service= new StudentService();
		
		
		service.saveStudentService(student);
		
		
			req.getRequestDispatcher("login.jsp").forward(req, res);
		
		
		
	}
	

}
