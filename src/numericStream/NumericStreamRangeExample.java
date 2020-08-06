package numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 50);
		intStream.forEach(x -> System.out.print(x +","));
		System.out.println();
		IntStream intStreamClosed = IntStream.rangeClosed(1, 50);
		intStreamClosed.forEach(x -> System.out.print(x +","));
		System.out.println();
		LongStream longStreamClosed = LongStream.rangeClosed(1, 50);
		longStreamClosed.forEach(x -> System.out.print(x +","));
		System.out.println();
		IntStream.range(1, 50).asDoubleStream().forEach(x->System.out.print(x + ","));
		System.out.println();
		long count = IntStream.range(1, 50).count();
		System.out.println(count);
		
	}

}
