package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aBcAbCabcABC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc",3));
		System.out.println(s.indexOf("abc",7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		
		String s2 = "   ab cd   ";
		String s3 = "efg,hijk,lmno,pq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		
		
		//가운데를 뺴고 양쪽 끝의 공백을 제거함 
		System.out.println("======" + s2.trim() + "===========");
		
		//가운데도 공백 제거하고 싶다. 
		System.out.println("======" + s2.replaceAll(" ","") + "===========");
		
		String[] tokens = s3.split(",");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append("java");
		sb.append("1000");
		
		String s5 = sb.toString();
		System.out.println(s5);
		
		//String s6 = "Hello " + "World " + "java";
		String s6 = new StringBuffer("Hello ").append("World ").append("java").toString();
		
		System.out.println(s6);
		
		//주의 : 문자열 + 연산을 할 때
//		String s7 = "";
//		for (int i =0; i < 10; i ++) {
//			//s7 = new StringBuffer(s7).append(i).toString(i);
//			s7 = s7 + i;
//		}
//		
//		System.out.println(s7);

		
		StringBuilder sb2 = new StringBuilder("");
		for (int i =0; i < 1000; i ++) {
			sb2.append(i);
		}
		String s7 = sb2.toString();
		System.out.println(s7.length());
	
	
	
	
	
	}

}
