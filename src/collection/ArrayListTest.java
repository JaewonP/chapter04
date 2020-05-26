package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //Object 가리키면 모든 타입의 객체 가능
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		

		list.remove(0);
		
		System.out.println(list.size());
	}

}
