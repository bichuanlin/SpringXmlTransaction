import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jvtc.entity.Grade;
import com.jvtc.entity.Student;
import com.jvtc.service.StudentService;

public class Test {
	   public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Student student=new Student();
		 Grade grade=new Grade();
		 grade.setGradeName("移动互联1901");
		 grade.setGradeNum(30);
		 student.setId("20191259");
		 student.setName("赵六");
		 student.setAge(18);
		 student.setSex("女");
		 student.setGrade(grade);
		 //从IoC容器中取出对象
		 StudentService studentService=(StudentService) context.getBean("studentServiceImpl");
		 studentService.addStudent(student);
	   }
}
