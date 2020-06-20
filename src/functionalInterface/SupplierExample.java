package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> {
			return new Student("Sanjay", 2, 3.6, "male", Arrays.asList("FootBall", "Cricket", "volleyBall"));
		};
		Supplier<List<Student>> studentSupplierList = () -> StudentDataBase.getAllStudents();
		System.out.println(studentSupplier.get());
		System.out.println(studentSupplierList.get());
		
		List<Student> st = StudentDataBase.getAllStudents();
//		
		System.out.println(st);
	}

}
