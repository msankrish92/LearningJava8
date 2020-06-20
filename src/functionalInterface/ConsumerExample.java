package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	static Consumer<Student> c2 = (s) -> System.out.println(s);
	static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
	static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

	static void printName() {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(c2);
	}

	static void printNameAndActivities() {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		allStudents.forEach(c3.andThen(c4));// Consumer Chaining

	}

	static void printNameAndActivitiesUsingCondition() {

		List<Student> allStudents = StudentDataBase.getAllStudents();
	
		allStudents.forEach((s -> {
			if(s.getGradeLevel()>=3 && s.getGpa()>=3) {
				c3.andThen(c4).accept(s);
			}
		}));
	
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("sanjay");

		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();

	}

}
