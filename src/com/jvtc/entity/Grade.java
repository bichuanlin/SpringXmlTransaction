package com.jvtc.entity;
/**
 * 班级
 * @author 516
 *
 */
public class Grade {
   int gradeId;//班级编号
   String gradeName;//班级名称
   int gradeNum;//班级人数
	public Grade() {
		super();
	}
	public Grade(int gradeId, String gradeName, int gradeNum) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
		this.gradeNum = gradeNum;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", gradeName=" + gradeName + ", gradeNum=" + gradeNum + "]";
	}
	
   
}
