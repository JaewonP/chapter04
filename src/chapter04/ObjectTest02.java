package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;

		System.out.println(p1 ==p2);
		System.out.println( p3 ==p2);
		// == : 두 객체의 동일성 
		
		int i = 10;
		int j = i;
		System.out.println(i ==j);
		
		
		// equals : 두 객체의 동질성(내용 비교)
		//          Object의 기본구현은 ==와 같다. 즉 동일성 비교
		//          진짜 내용을 비교하려면 overriding해야함 
		System.out.println(p1.hashCode() + ":" + p2.hashCode());
		System.out.println(p1.equals(p2)); //Object 상의 equals는 ==와 같다, F3
		System.out.println(p2.equals(p3));
		
		//String Test
		String s1 = new String("ABC"); //heap에 생기는 것이 맞음 
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
	
	
		System.out.println("================================");
		
		String s3 = "ABC"; //method area에서 String literal Pool에서 해싱해서 찾아봄 -> 없어서 heap객체 생성 
		String s4 = "ABC"; //method area에서 해싱된 ABC의 int값을 찾아냄 -> 유지
		                   //불변 객체 (공유해서 사용)
		                   //성능에 좋음 (메모리) 
		System.out.println( s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
	
	}

}
