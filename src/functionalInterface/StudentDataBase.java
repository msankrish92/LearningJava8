package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

	public static Supplier<Student> studentSupplier = () -> {
		return new Student("Sanjay", 2, 3.6, "male", Arrays.asList("FootBall", "Cricket", "volleyBall"));
	};
	
	
	
	public static List<Student> getAllStudents() {

		Student student1 = new Student("Sanjay", 2, 3.6, "male", Arrays.asList("FootBall", "Cricket", "volleyBall"));
		Student student2 = new Student("Ravi", 2, 8.6, "male", Arrays.asList("swimming", "Cricket", "volleyBall"));
		
		Student student3 = new Student("Mohan", 3, 10.0, "male", Arrays.asList("FootBall", "Cricket", "swimming"));
		Student student4 = new Student("Jeni", 3, 2.6, "female", Arrays.asList("FootBall", "gymnastics", "volleyBall"));

		Student student5 = new Student("kanchana", 4, 9.6, "female",Arrays.asList("FootBall", "Athletics", "volleyBall"));
		Student student6 = new Student("Visu", 4, 8.6, "female", Arrays.asList("FootBall", "soccer", "volleyBall"));

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return students;

	}

}
