package stream.course2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
//		list.add(4);
//		
//List<Integer> b = new ArrayList<>();
//		
//		b.add(4);
//		b.add(5);
//		b.add(6);
//		
//List<Integer> c = new ArrayList<>();
//		
//		c.add(7);
//		c.add(8);
//		c.add(9);
//		
//		
////		for (int i = 0; i < list.size(); i++) {
////			if(list.get(i)%2==0) {
////				System.out.println("square of input: " + list.get(i)+" "+ list.get(i)*list.get(i));
////			}
////		}
////		
////		Predicate<Integer> predicate = (a) -> a%2==0;
//////		Consumer<Integer> square = (a) -> System.out.println(a*a);
//// 		List<Integer> collect = list.stream().filter(predicate).map((a) -> a*a).sorted().collect(Collectors.toList());
////		System.out.println(collect);
////		
////		list.stream().filter(a -> a>5).map(a -> a*a+2).forEach(System.out::println);
//		
//		
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		
//		list.add(a);
//		list.add(b);
//		list.add(c);
//		
//		list.stream()
//			.forEach(l -> System.out.println(l));
//		list.stream().flatMap(l->l.stream()).forEach(l->System.out.println(l));
//		
		
		
//		
//		List<String> list = new ArrayList<String>();
//		list.add("Apple");
//		list.add("Apple");
//		list.add("Airplane");
//		list.add("Ball");
//		list.add("Boy");
//		list.add("cat");
//		list.add("Dog");
//		list.add("Delta");
//		
//		List<String> newList = list.stream()
//			.filter(s -> s.length()>3)
//			.collect(Collectors.toList());
//		
//		list.stream()
//			.map(a -> a.toUpperCase())
//			.forEach(System.out::println);
//		
//		
//		Set<String> newSet = list.stream()
//				.filter(s -> s.length()>3)
//				.collect(Collectors.toSet());
//		
//		String joinString = list.stream()
//				.filter(s -> s.length()>3)
//				.collect(Collectors.joining(","));
//		
//		Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(s->s.length()));
//		
//		System.out.println(list);
//		System.out.println(newList);
//		System.out.println(newSet);
//		System.out.println(joinString);
//		System.out.println(map);
		
//		int count = 0;
		
//		Optional<Integer> reduce = a.stream().reduce((b,c) -> b-c);
		
		int sum = a.stream().mapToInt(b -> b).;
		
//		System.out.println(reduce.get());
		System.out.println(sum);
//		System.out.println(count);
		
		
		
		
	}

}
