package com.jvtc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvtc.dao.GradeDao;
import com.jvtc.entity.Grade;
import com.jvtc.service.GradeService;
@Service("gradeService")
public class GradeServiceImpl implements GradeService {
   //ʹ��dao��
	@Autowired
	GradeDao gradeDao;
    
	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	@Override
	public void addGrade(Grade grade) {
		// TODO Auto-generated method stub
		gradeDao.addGrade(grade);//ʹ��dao����Ӱ༶
	}
	
}
