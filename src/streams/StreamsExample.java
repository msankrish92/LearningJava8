package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		//Student Name and their activites in a map
		
		Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
		Predicate<Student> studentGpaPredicate = (student -> student.getGpa()>=3);
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
				.peek((student -> {
					System.out.println(student);
				}))
				.filter(studentPredicate)// Stream of students
				.filter(studentGpaPredicate)// Stream of students
			.collect(Collectors.toMap(Student::getName, Student::getActivities));// Gives us the desired output

		System.out.println(studentMap);
		
	}

}
