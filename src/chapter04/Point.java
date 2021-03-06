package chapter04;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		// Object의 hashCode는 주소기반의 해싱
		// overriding된 hashCode는 내용 기반의 해싱
		// 성능때문에 해싱을 해서 다른 내용인 경우 set에 저장 (container 같은 클래스 만들때)
		// 같은 경우 내용 비교
		// equals와 == 같이 override 해야함 
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

/*	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point[x=" + x + ", y =" + y + "]";
	}
	
	*/
	
}
