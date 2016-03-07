package hello;

public class hello {
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		//소수점 범위 자르기
		
		circleArea = (PI * radius / 100) *100;
		System.out.println("원의 면적 : ");
		System.out.println(circleArea);
		
	}
}
