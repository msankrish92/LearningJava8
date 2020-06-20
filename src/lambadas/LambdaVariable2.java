package lambadas;

import java.util.function.Consumer;

public class LambdaVariable2 {

	static int value = 4; //not issues if it a instance variable 
	public static void main(String[] args) {
//		int value = 4;
		Consumer<Integer> c1 = (i) -> {
			 value++; //not allowed
			System.out.println(value+i);
		};
	
		value++; //not allowed
		
		c1.accept(4);
	
	}
}
