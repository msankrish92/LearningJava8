package streams;

import java.util.List;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;
import static java.util.stream.Collectors.*;

public class StreamsFilter {
	
	
	public static List<Student> filterStudenst(){
		return StudentDataBase.getAllStudents().stream()
		.filter((student -> student.getGender().equals("female")))
		.collect(toList());
	}

	public static void main(String[] args) {
//		System.out.println(filterStudenst());
		filterStudenst().forEach(System.out::println);

	}

}
