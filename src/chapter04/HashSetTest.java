package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<>();
		
		String s1 = new String("또치");
		String s2 = new String("또치");

		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		
		
		System.out.println(s.contains(s2));
		//안에 내용이 있냐
		//contains 와 add 1) 해시코드(HashCode)를 비교하고 2) equals 비교해봄 
		System.out.println(s.size());
		//다른 객체고 들어가있지는 않음 
		
		//순회 1
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String s3 = it.next();
			System.out.println(s3);
		}
		
		//순회 2
		for(String s3 : s) {
			System.out.println(s3);
		}
	}

}
