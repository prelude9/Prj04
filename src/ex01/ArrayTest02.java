package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		int [] sales = new int[] { // 중괄호가 들어가면 []안에 숫자 들어가면 안됨
				100, 80, 90, 110   // 형태는 가로이지만 세로로 데이터 저장됨
		};
		
		int tot = 0;
		
		/*
		tot  += sales[0]; // tot = tot + sales[0], 줄로 배열됨 
  		tot  += sales[1];
  		tot  += sales[2];
  		tot  += sales[3];
  		*/
		
		for(int i = 0; i< sales.length; i++) {
			tot  += sales[i];
  		}
  		System.out.println(tot);
  		
  		// 2차원 배열 
  		double [][] salesTot = new double [][] { //[][] : 첫 대괄호는 세로(줄), 두번째 대괄호는 가로(칸)
	  			{ 100, 101, 90, 80 }    // 2022 : 0 ',' 있어야 함
	  		,	{ 120, 101, 90, 180 }   // 2023 : 1
	  		,	{ 100, 130, 190, 280 }  // 2024 : 2
	  		,	{ 100, 101, 290, 80 }   // 2025 : 3
	  		,	{ 100, 101, 390, 180 }  // 2026 : 4
  			};                          // 세미콜론 꼭 있어야 함 
  			
  			System.out.println("연도의 개수:" + salesTot.length);
  			System.out.println("2024년의 매출갯수" + salesTot[2].length);
  			
  			//2024년 매출수량의 합은?
  			
  			tot = 0;
  			for(int j=0; j< salesTot[2].length; j++)   { 
  				tot  += salesTot[2][j];
  		}
  			System.out.println(tot);
	}

}
