package chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HastMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		
		String k1 = "one";
		map.put("one", 1); //auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get("one"); //auto unboxing
		int j = map.get(new String("three"));
		System.out.println( i + ":" + j);
		
		
		//덮어씌워 버림
		map.put("three", 3333);
		System.out.println(map.get("three"));
		
		//key를 찾아서 순회해야함 
		Set<String> s  = map.keySet();
		for(String key : s) {
			Integer value = map.get(key);
			System.out.println(value);
		}
	}

}
