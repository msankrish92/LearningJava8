package functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3;
	
	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student->{
			if(p1.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student->{
			if(p2.test(student)) {
				System.out.println(student);
			}
		}));
		
	}
	
	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student->{
			if(p1.and(p2).negate().test(student)) {
				System.out.println(student);
			}else {
				System.out.println(student);
			}
		}));
	}
	
	
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		System.out.println("==============================================================");
		filterStudentByGpa();
		System.out.println("==============================================================");
		filterStudents();
	}
	
	
}
