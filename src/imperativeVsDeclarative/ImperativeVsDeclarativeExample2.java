package imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*
		 * Imperative Approach
		 */
		
		List<Integer> uniqueList = new ArrayList<Integer>();
		for(Integer integer : intList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		
		System.out.println(uniqueList);
		
		/*
		 * Declarative Approach
		 */
		
		List<Integer> uniqueList1 = intList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList1);

	}

}
