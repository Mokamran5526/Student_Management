package servlet_test_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import servlet_test_project.connection.StudentConnection;
import servlet_test_project.dto.Student;

public class StudentDao {
	Connection connection =StudentConnection.getStudentConnection();
	/*
	 * saveStudentMenthod
	 */
	public Student saveStudentDao(Student student) {
		
		String insertQuerry ="insert into student value(?,?,?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(insertQuerry);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getEmail());
			ps.setLong(4,student.getPhone());
			ps.setString(5,student.getGender());
			ps.execute();
			return student;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Student> getAllStudentsDao(){
		String displayQuery = "SELECT * FROM student";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayQuery);

			ResultSet resultSet = preparedStatement.executeQuery();
			List<Student> students = new ArrayList<Student>();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String gender = resultSet.getString("gender");
				long phone = resultSet.getLong("phone");
				// id,name,color,price
				students.add(new Student(id, name, email, gender, phone));
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Student getByIdStudentDao(int id) {
		
		
		String selectQuery = "SELECT * FROM student where id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				int id1 = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String gender = resultSet.getString("gender");
				long phone = resultSet.getLong("phone");
				return new Student(id, name, email, gender, phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void deleteStudentByIdDao(int id) {
		
		String deleteQuery = "delete from student where id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public Student updateStudentDao(Student student) {
		
		String updateQuery = "update student set name=?,email=?,phone=?,gender=? where id=?";
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement= connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setLong(3, student.getPhone());
			preparedStatement.setString(4, student.getGender());
			preparedStatement.setInt(5, student.getId());
			
			preparedStatement.executeUpdate();
			
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
