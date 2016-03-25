package VariableAndType;

public class Type {
	public static void main(String[] args) {
		// 바이트 코드 반복문으로 찍어보기
		// byte var1 = 125;
		// int var2 = 125;
		//
		// for (int i = 0; i < 5; i++) {
		// var1++;
		// var2++;
		// System.out.println("var1 : " + var1 + "\t" + "var2: " + var2);
		// }

		// //char 타입 변수 찍어보기
		// char c1 = 'A'; // 문자 직접저장
		// char c2 = 65; // 10진수로 저장
		// char c3 = '\uac00'; //16진수로 저장
		//
		// char c4 = '가';
		// char c5 = 44032;
		// char c6 = '\uac00';
		//
		// int uniCode = c1; //유니코드는 정수형으로 받아준다.
		//
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);
		// System.out.println(c4);
		// System.out.println(c5);
		// System.out.println(c6);
		// System.out.println(uniCode);

		// //Long example
		// long var1 = 10;
		// long var2 = 20L;
		//// long var3 = 1000000000000; 컴파일 에러 : int범위가 넘어섰는데 L를 적어주지 않았기 때문
		// long var4 = 1000000000000L;

		// double var1 = 3.14;
		// float var2 = 3.14; //컴파일 에러 : 자바는 실수 리터럴의 기본 타입을 double로 간주하므로 실수를 적을
		// 때는 뒤에 f나 F를 적어야한다.
		// float var3 = 3.14F;
		// int var6 = 3000000;
		// double var7 = 3e6; // == 3000000
		// float var8 = 3e6f;// == 3000000
		// double var9 = 2e-3;// == 3000000
		
//		타입변환
		
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int <- char
		System.out.println("가의 유니코드 : " +  intValue);
		
		intValue = 500;
		long longValue = intValue; //long <- int
		System.out.println(longValue);
		
		
		
		

	}
}
