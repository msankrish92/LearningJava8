package assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\hp\\Desktop\\first-names.txt");
		List<String> list = Files.readAllLines(path);
		System.out.println(list);

		System.out.println("================");

		// print the count of names start with B.
		long count2 = list.stream().filter(a -> a.startsWith("B")).count();
		System.out.println(count2);
		// create a list of names which start with C and contains 's' in it.
		list.stream().filter(a -> a.startsWith("C")).filter(a -> a.contains("s"))
				.forEach(a -> System.out.print(a + ","));

		
		long count = 0;
		// print the total number of character of all the name start with M.
		count = list.stream().filter(a -> a.startsWith("M")).map(a -> a.toCharArray().length).mapToInt(i -> i).sum();
		System.out.println();
		list.stream().filter(a -> a.startsWith("M")).forEach(a -> System.out.print(a + ","));
		System.out.println();
		System.out.println(count);

	

}}
