package ex01;

import java.time.LocalDate;

public class ArrayTest03 {

	public static void main(String[] args) {
	
	    LocalDate today = LocalDate.now();
        System.out.println("오늘 날짜: " + today); // 예: 2026-10-23
        

        String yoil = getYoil();   // '()' 함수-메소드-를 요청하는 방식 
        System.out.println("요일 한자: " + yoil);
		

	}

	private static String getYoil() {
		String [] y = new String[] {
				"月", "火", "水", "木", "金", "土", "日"
		};  // ';' 넣어주기
		LocalDate now = LocalDate.now();
		int wk = now.getDayOfWeek().getValue(); //1(월) ~ 7(일) 사이의 숫자 getDayofWeek(). '.'에서?  *자바에서만 월요일을 1부터 시작 
		String yoil = y[ wk - 1 ] ;		
		return yoil + "曜日";
	}

}
