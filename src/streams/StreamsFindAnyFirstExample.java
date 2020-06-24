package streams;

import java.util.Optional;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findAny(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa()>8)
				.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa()>8)
				.findFirst();
	}
	
	
	public static void main(String[] args) {
		System.out.println(findAny());
		System.out.println(findFirst());
	}

}
