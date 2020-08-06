package lambadas.course2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		int a = 5;
//		GreetingService g1 = new GreetingService() {
//			
//			@Override
//			public void greet(String name) {
//				System.out.println(name);
//				
//			}
//		};

//		GreetingService g2 = (fn) -> {
//			return fn.toUpperCase();
//
//		};
//
//		System.out.println(g2.greet("hello"));
//
//		test(g2);
//		
//		test((n) -> n.toUpperCase());
//		
//		System.out.println(getLambada().greet("Sanjay"));
		
		
//		StringOperation op1 = String::concat;
		
//		StringOperation op2 = System.out::println;
		
//		System.out.println(op1.accept("Sanjay","Krishnan"));
		
		
		StringOperation op1 = list::add;
		
		op1.accept("sanjay");
		System.out.println(list);

	}
	
	
	

	
	private static void test(GreetingService g) {
		String returnedString = g.greet("udemy");
		System.out.println(returnedString);
	}
	
	
	public static GreetingService getLambada() {
		return (s) -> s.toUpperCase();
	}
}
