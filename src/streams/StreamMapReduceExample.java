package streams;

import functionalInterface.Student;
import functionalInterface.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNoteBooks() {
		int reduce = StudentDataBase.getAllStudents().stream()
		.filter((student -> student.getGradeLevel()>=3))
		.map(Student::getNoteBooks)
//		.reduce(0,(a,b) -> a+b);
		.reduce(0, Integer::sum);
	
	return reduce;
	
	}
	
	public static void main(String[] args) {
		System.out.println(noOfNoteBooks());
	}

}
