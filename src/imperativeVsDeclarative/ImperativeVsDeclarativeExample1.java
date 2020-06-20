package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {
		/*
		 * Imperative - how style of programming
		 */
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum+=i;
		}
		
		System.out.println("Sum using Imperative approach: " + sum);

		/*
		 * Declarative Style of programming - What style of programming
		 */
		
		int sum2 = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Sum using Declarative approach:" + sum2);
		

	}

}
