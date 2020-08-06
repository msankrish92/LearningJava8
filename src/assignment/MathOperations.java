package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MathOperations {
	
	BiFunction<Integer , Integer , Integer > add = (a,b) -> a+b;
	
	BiFunction<Integer , Integer , Integer > sub = (a,b) -> a-b;
	
	BiFunction<Integer , Integer , Integer > mul = (a,b) -> a*b;
	
	BiFunction<Integer , Integer , Integer > div = (a,b) -> a/b;

	Map<String,BiFunction> operationMap = new HashMap<>();
	
	public Map<String,BiFunction> addOperation() {
		operationMap.put("+", add);
		operationMap.put("-", sub);
		operationMap.put("*", mul);
		operationMap.put("/", div);
		return operationMap;
	}
	
	
}
