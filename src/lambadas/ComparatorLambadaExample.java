package lambadas;

import java.util.Comparator;

public class ComparatorLambadaExample {

	public static void main(String[] args) {
		/*
		 * Prior java 8
		 */

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 0 -> o1==o2
											// 1 -> o1>o2
											// -1 -> o1<o2
			}
		};

		System.out.println("Result of comparator is: " + comparator.compare(3, 2));

		/*
		 * lambda way
		 */

		Comparator<Integer> comparator1 = (Integer o1, Integer o2) ->  o1.compareTo(o2);

		System.out.println("Result of comparator is: " + comparator1.compare(3, 2));
		
		Comparator<Integer> comparator2 = (o1, o2) ->  o1.compareTo(o2);
		
		System.out.println("Result of comparator is: " + comparator2.compare(3, 2));
	}

}
