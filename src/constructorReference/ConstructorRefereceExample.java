package constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import functionalInterface.Student;

public class ConstructorRefereceExample {

	static Supplier<Student> studentSupplier = Student::new;
	
	static Function<String, Student> studentFunction = Student::new;
	
	public static void main(String[] args) {

		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("Sanjay"));

	}

}
