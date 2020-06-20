package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> compartor = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

		System.out.println(binaryOperator.apply(5, 5));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compartor);

		System.out.println(maxBy.apply(8, 5));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(compartor);

		System.out.println(minBy.apply(8, 5));

	}

}
