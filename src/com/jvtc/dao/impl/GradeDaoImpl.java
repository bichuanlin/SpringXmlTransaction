package com.jvtc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jvtc.dao.GradeDao;
import com.jvtc.entity.Grade;

public class GradeDaoImpl implements GradeDao{
    //��Ӱ༶
	JdbcTemplate jdbcTemplate;//�������ݿ�
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addGrade(Grade grade) {
		// TODO Auto-generated method stub
		Object[] objects=new Object[] {grade.getGradeName(),grade.getGradeNum()};
		String sql="insert into grade(gradeName,gradeNum) values(?,?)";
		jdbcTemplate.update(sql, objects);
		
	}

}
