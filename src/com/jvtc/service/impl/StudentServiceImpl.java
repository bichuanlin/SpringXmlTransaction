package com.jvtc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvtc.dao.StudentDao;
import com.jvtc.entity.Grade;
import com.jvtc.entity.Student;
import com.jvtc.service.GradeService;
import com.jvtc.service.StudentService;
@Transactional //事务注解，类中的所有public实现事务管理
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService{
     //添加学生时，要先添加班级
	//GradeService, StudentDao
	@Autowired
	StudentDao studentDao;
	@Autowired
	GradeService gradeService;
	//用set方式注入，一定要添加set方法
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		//添加年级
		Grade grade=student.getGrade();//得到学生年级信息
		gradeService.addGrade(grade);//先添加班级
		studentDao.addStudent(student);//在添加学生，添加学生出错，事务回滚
	}

}
