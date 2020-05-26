package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<>(); //Object 가리키면 모든 타입의 객체 가능
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		

		list.remove(0);
		
		System.out.println(list.size());
	}

}
