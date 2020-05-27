package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new Vector<>(); //Object 가리키면 모든 타입의 객체 가능
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		

		//list.remove(0);
		
		//순회 1 옛날거
				int count = list.size();
				for(int i =0; i<count; i++) {
					String s = list.get(i);
					System.out.println(s);
				}
				list.remove(1);
		
		//순회 2
				Iterator<String> it = list.iterator();
				while(it.hasNext()) {
					String s = it.next();
					System.out.println(s);
					}

				
		//순회 3(for ~ each)
				for(String s : list) {
					System.out.println(s);
				}
				
		//		System.out.println(list.size());
	}

}
