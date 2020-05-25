package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point = new Point(10,20);
		
		
		Class<Point> klass = (Class<Point>)point.getClass();
		// 객체가 가지고 있는 필드, 메소드가 뭐가 있는지 알 수 있다. reflection
		//System.out.println(point.getClass());
		System.out.println(klass); // reflection
		System.out.println(point.hashCode()); // address는 아니고
		                                      // reference 값도 아님
		                                      // address를 기반으로 한 해싱값 
		
		System.out.println(point); // 객체의 toString을 출력 
		System.out.println(point.toString()); //toString은 객체의 참조값을 출력 
		// getClass() + "@" + hashCode()
		


	}

}
