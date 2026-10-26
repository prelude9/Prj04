package ex02;

import java.util.Scanner;

/*
 입력 받을 자료
 번호 이름 국어 영어 수학
 num name kor eng mat    > 변수 이름 지정 
 1,안유진,90,80,70       > 데이터에 공백을 두지 않는 것이 중요
 2,카리나,100,90,90
 3,장원영,100,100,100
 4,닝닝,79,80,0           '0'과 'null'은 구분할 것 
 출력 자료 
 번호 이름 총점 평균 
 num name  tot  avg
 */
public class FuncTest {
	// 필드(공용) 전역 변수  :input에서도 쓰고 output에도 쓰고 등등. 만약 input에서만 쓴다면 input에서만 만들고 없애는게 원칙 
	// 입력 
	private static int   num;
	private static String name;
	private static int kor;
	private static int eng;
	private static int mat; 
	
	// 출력 
	private static int tot;
	private static double avg;    // 정수가 아닌 실수값이 나올 수 있으므로 
	
	// method 
	// main
	public static void main(String[] args) {
		input();                         // 2군데 이상 같은 변수를 써야 한다 (num, name)
		process();
		output();                        // num, name 변수 사용 
		System.out.println("end......");

	}
	// input
	private static void input() {
		// 키보드 준비 : 외부기능
		// line "1,안유진,90,80,70" : 공백없이 입력 
		// li   "1","안유진","90","80","70"
		Scanner in = new Scanner(System.in); // 외부 기능을 부르는 방법은 new 또는 뒤에 '.' 찍는게 있음. 내가 임의로 정할 수 있는건 아니고 만든 사람 마음임 
		System.out.println("번호, 이름, 국어, 영어, 수학");
		String     line  = in.nextLine();    // 전체를 한 줄로 입력하세요 : 엔터앞까지만 데이터로 인식 
		String []  li    = line.split(",");  // 문자열을 '0'부터 시작하는 문자열 배열로 나눠줌 
	 // num              = li[0];               int를 String으로 바꿔줘야 함. 데이터가 ""안에 있으므로  
		num              = Integer.parseInt(li[0].trim()); // 형변환! 파스(문자를 숫자로) 외워! 
		name             = li[1];            // 안유진이라는 글자라서 오류가 없음, 나머지는 오류 표시남 
		kor              = Integer.parseInt(li[2].trim());
		eng              = Integer.parseInt(li[3].trim());
		mat              = Integer.parseInt(li[4].trim());
		
		// 형변화 casting 
		// 숫자 -> 문자열로 변환
		// String.valuOf(35.6) -> "35.6"
		// 35.6 + ""           -> "35.6"
		
	}
	// process
	private static void process() {
		// 총점  : 총점의 변수를 확인 
		tot = kor + eng + mat; 
		// 형균
		avg = (double) tot / 3.0;   // 실수 계산이므로 '3'이 아닌 '3.0'으로 해줘야함 
		/* 반올림된 평균으로 하고 싶다면
		ave = (int)(tot*100 + 0.5) / 100.0 
		*/ 
		
	}
	// output
	private static void output() {

		System.out.println("번호 이름 총점 평균");  // 첫줄은 이렇게 입력하고
		System.out.printf("%d   %s   %d   %10.3f",       // 둘째줄은 왼쪽의 형태로 출력 
			              num, name, tot, avg);         // 평균은 소수이하 세자리로 출력, 세자리 이후는 자동반올림  
		
	}

}
