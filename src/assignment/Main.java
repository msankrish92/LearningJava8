package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

//		MathOperation add = (a, b) -> a + b;
//		MathOperation sub = (a, b) -> a - b;
//		MathOperation mul = (a, b) -> a * b;
//		MathOperation div = (a, b) -> a / b;

//		System.out.println(calculate(5,sub,3));
//		System.out.println(calculate(mul));
//		System.out.println(calculate(div));

//		int onScreenNumber = 0;
//		
//		onScreenNumber = calculate(5, add, 2);
//		onScreenNumber = calculate(onScreenNumber, sub, 3);
//		onScreenNumber = calculate(onScreenNumber, mul, 7);
//		onScreenNumber = calculate(onScreenNumber, add, 2);
//		onScreenNumber = calculate(onScreenNumber, div, 3);
//		

//		System.out.println(onScreenNumber);

		String[] split = "5 + 2 - 3 * 7 + 2 / 3 ".split(" ");

		List<String> asList = Arrays.asList(split);

		MathOperations oper = new MathOperations();
		Map<String, BiFunction> operation = oper.addOperation();

		int onScreenNumber = Integer.parseInt(split[0]);
		for (int i = 1; i < split.length; i=i+2) {
			String op = split[i];
			int enteredNumber = Integer.parseInt(split[i + 1]);
			onScreenNumber = (int) operation.get(op).apply(onScreenNumber, enteredNumber);
		}
		System.out.println(onScreenNumber);
		
	}

	private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {

		return mathOperation.operate(onScreenNumber, enteredNumber);
	}

}
