package com.ashwin.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashwin.dto.Student;
import com.ashwin.mapper.StudentMapper;

@Repository
public class StudentDao {
      
	private JdbcTemplate jt;
	
	public StudentDao(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int save(Student s) {		  
		String query = "INSERT INTO student(id,name,city) VALUES(?,?,?)";
		int effectRow = jt.update(query,s.getId(),s.getName(),s.getCity());		
		return effectRow;
	}
	
	public List<Student> findAll(){
		   String sql = "SELECT * FROM student";
		   List<Student> list = jt.query(sql, new StudentMapper());
		   return list;
	}
}
