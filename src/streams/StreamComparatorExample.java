package streams;

import java.util.Comparator;
import java.util.List;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;
import static java.util.stream.Collectors.*;

public class StreamComparatorExample {

	public static List<Student> sortStudentByName() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(toList());
	}
	
	public static List<Student> sortStudentByGpa() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(toList());
	}
	
	public static List<Student> sortStudentByGpaDesc() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(toList());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Sorted by Name");
		sortStudentByName().forEach(System.out::println);
		System.out.println("Sorted by Gpa");
		sortStudentByGpa().forEach(System.out::println);
		System.out.println("Sorted by Gpa Desc");
		sortStudentByGpaDesc().forEach(System.out::println);
		
	}
}
