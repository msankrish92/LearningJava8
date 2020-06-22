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
		.distinct()
		.collect(toList());
	}
	
	public static long printStudentActivitiesCount(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();
	}
	
	public static List<String> printStudentActivitiesSorted(){
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(toList());
	}
	
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesCount());
		System.out.println(printStudentActivitiesSorted());
	}
	
	
}
