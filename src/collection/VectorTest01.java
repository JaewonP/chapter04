package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		//순회 1 옛날거
		int count = v.size();
		for(int i =0; i<count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		v.removeElementAt(1);
		
		//순회 2 옛날거 interface랑 객체지향 리스트로 바꾸는 게 낫다
		Enumeration<String>e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		
		}
		
		//순회 3 현대의 자바 데이터 코드에 가장 맞는 
		for(String s : v) {
			System.out.println(s);
		}
	}

}
