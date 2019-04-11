package com.jvtc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jvtc.dao.GradeDao;
import com.jvtc.entity.Grade;
@Repository("gradeDao")
public class GradeDaoImpl implements GradeDao{
    //添加班级
	@Autowired
	JdbcTemplate jdbcTemplate;//操作数据库
	
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
