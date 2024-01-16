package servlet_test_project.service;

import servlet_test_project.dao.StudentDao;
import servlet_test_project.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	/*
	 * saveStudentMethod
	 */
public Student saveStudentService(Student student) {
	return studentDao.saveStudentDao(student);
}
public void deleteStudentByIdService(int id) {
	studentDao.deleteStudentByIdDao(id);
}
public Student updateStudentService(Student student) {
	return studentDao.updateStudentDao(student);
}
}
