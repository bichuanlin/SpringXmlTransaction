package com.jvtc.entity;
/**
 * 学生基本信息
 * @author 516
 *
 */
public class Student {
	String id;
	String name;
	int age;
	String sex;
	Grade grade;//班级信息
	public Student() {
		super();
	}
	public Student(String id, String name, int age, String sex, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", grade=" + grade + "]";
	}
	
}
