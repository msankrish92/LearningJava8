package streams;

import java.util.List;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;
import static java.util.stream.Collectors.*;

public class StreamFlatMapExample {

	public static List<String> printStudentActivities(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.collect(toList());
	}
	
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
	
	
}
