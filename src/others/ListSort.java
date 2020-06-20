package others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort implements Comparator<Integer> {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(3);
		intList.add(2);
		intList.add(6);
		
		ListSort obj = new ListSort();
		
		for (int i = 0; i < intList.size()-1; i++) {
			int compare = obj.compare(intList.get(i), intList.get(i+1));
			System.out.println(compare);
		}
		System.out.println(intList);
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
	}
	
}
