package methodReference;

import java.util.function.Predicate;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;
	
	static public boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel()>=3;
	}
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
		
		
		

	}

}
