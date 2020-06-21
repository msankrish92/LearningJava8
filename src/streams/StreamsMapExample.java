package streams;

import java.util.List;
import java.util.Set;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamsMapExample {
	
	public static List<String> nameList(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(toList());
	}

	public static Set<String> nameSet(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(toSet());
	}
	
	public static void main(String[] args) {
				System.out.println(nameList());
				System.out.println(nameSet());
	}
}
