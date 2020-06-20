package functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

	static Function<List<Student>,Map<String,Double>> studentFunction = (students -> {
		
		Map<String,Double> studentGradeName = new HashMap<>();
		
		students.forEach((student -> {
			if(PredicateStudentExample.p1.test(student))
			studentGradeName.put(student.getName(), student.getGpa());
		}));
		return studentGradeName;
	});
	
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}
	
}
