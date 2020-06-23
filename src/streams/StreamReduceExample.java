package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

public class StreamReduceExample {

	public static int performMultipication(List<Integer> intgerList) {
	
		return intgerList.stream()
			.reduce(2,(a,b) -> a*b);
		
	}
	
	public static Optional<Integer> performMultipicationWithoutIdentity(List<Integer> intgerList) {
		
		return intgerList.stream()
			.reduce((a,b) -> a*b);
		
	}
	
	public static Optional<Student> getHighestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
		.reduce((s1,s2) -> s1.getGpa()>s2.getGpa()?s1:s2);
	}
	
	public static Optional<Integer> getHighestValue(List<Integer> integerList) {
		return integerList.stream()
				.reduce((a,b) -> a>b?a:b);
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,6,3,4);
//		Optional<Integer> result = performMultipicationWithoutIdentity(integers);
//		System.out.println(result.isPresent());
//		System.out.println(result.get());
//	
//	Optional<Student> highestGpaStudent = getHighestGpaStudent();
//	if(highestGpaStudent.isPresent()) {
//		System.out.println(highestGpaStudent.get());
		
		System.out.println(getHighestValue(integers));
//	}
	}
	
}
