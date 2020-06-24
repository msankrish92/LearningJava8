package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
	
	
	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream()
		.reduce(0,(x,y) -> x>y?x:y);
	}
	
	public static int findMinValue(List<Integer> integerList) {
		return integerList.stream()
		.reduce(0,(x,y) -> x<y?x:y);
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		return integerList.stream()
		.reduce((x,y) -> x<y?x:y);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream()
				.reduce((x,y) -> x>y?x:y);
	}
	
	

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//		System.out.println(findMaxValue(integerList));
//		
//		List<Integer> integerList1 = new ArrayList<Integer>();
//		System.out.println(findMaxValue(integerList1));
//		
//		Optional<Integer> maxValue = findMaxValueOptional(integerList1);
//		if(maxValue.isPresent()) {
//			System.out.println(maxValue.get());
//		}else {
//			System.out.println("No max value found");
//		}
		
		System.out.println(findMinValue(integerList));
		Optional<Integer> minValue = findMinValueOptional(integerList);
		if(minValue.isPresent()) {
			System.out.println(minValue.get());
		}else {
			System.out.println("No max value found");
		}
		
	}
	
	
	
}
