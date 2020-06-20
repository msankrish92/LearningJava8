package functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

	Predicate<Student> p1 = (student) -> student.getGradeLevel()>=3;
	Predicate<Student> p2 = (student) -> student.getGpa()>=3;
	
	BiPredicate<Integer, Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3 && gpa>=3; 
	
	BiConsumer<String, List<String>> studentByConsumer = (name,activities) -> System.out.println(name + "->" + activities);;
	
	Consumer<Student> studentConsumer = (student) -> {
		
		
		if(biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			studentByConsumer.accept(student.getName(),student.getActivities());
		}
	};
	
	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	} 
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(studentList);
	}
}
