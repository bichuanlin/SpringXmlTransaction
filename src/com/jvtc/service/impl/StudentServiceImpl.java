package com.jvtc.service.impl;

import com.jvtc.dao.StudentDao;
import com.jvtc.entity.Grade;
import com.jvtc.entity.Student;
import com.jvtc.service.GradeService;
import com.jvtc.service.StudentService;

public class StudentServiceImpl implements StudentService{
     //���ѧ��ʱ��Ҫ����Ӱ༶
	//GradeService, StudentDao
	StudentDao studentDao;
	GradeService gradeService;
	//��set��ʽע�룬һ��Ҫ���set����
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		//����꼶
		Grade grade=student.getGrade();//�õ�ѧ���꼶��Ϣ
		gradeService.addGrade(grade);//����Ӱ༶
		studentDao.addStudent(student);//�����ѧ�������ѧ����������ع�
	}

}
