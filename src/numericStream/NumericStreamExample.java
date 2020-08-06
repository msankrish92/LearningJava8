package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int sumOfNNumbers(List<Integer> integerList) {
		return integerList.stream().reduce(0,(a,b) -> a+b);
	}
	
	public static int sumOfNNumberIntStream() {
		return IntStream.range(1, 6).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		System.out.println(sumOfNNumbers(integerList));
		System.out.println(sumOfNNumberIntStream());
		
		
	}
	
}
