package com.jvtc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jvtc.dao.StudentDao;
import com.jvtc.entity.Student;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
    JdbcTemplate jdbcTemplate;
    
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		Object[] objects=new Object[] {student.getId(),student.getName(),
				student.getAge(),student.getSex(),student.getGrade().getGradeId()};
		String sql="insert into student(id,name,age,sex,gradeId) values(?,?,?,?,?)";
		jdbcTemplate.update(sql,objects);		
	}

}
