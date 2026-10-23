package ex01;

public class ArrayTest01 {
	// Array: 여러 변수를 하나의 이름으로 통일해서 사용 

	public static void main(String[] args) {
		String name1 = "김채원";       // 엑셀 1칸 
		String name2 = "사쿠라";			
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("카즈하");
		System.out.println("허윤진");
		System.out.println("홍은채");		
		
		System.out.println();
		String [] lesserafim = new String[]	{    //[]안에 숫자를 쓰려면 {}중괄호를 쓰면 안 됨      
		// 		  0         1        2           3        4       : '0'부터 시작하는 번호가 생성됨 
				"김채원", "사쿠라", "카즈하", "허윤진", "홍은채"
				
		}; 
		System.out.println(lesserafim[0]);   
		System.out.println(lesserafim[1]);
		System.out.println(lesserafim[2]);
		System.out.println(lesserafim[3]);
		System.out.println(lesserafim[4]);
		System.out.println();
		
		for (int i = 0; i < lesserafim.length; i++) {   // length란, 르세라핌이라는 방에 5개, 르세라핌이라느 방 크기가 '5개'라는 뜻. 
			                                            // 그래서 '0'으로 시작해도 성립, 만약 'i=1'이라면 부등호를 '<='로 바꾸면 됨
			System.out.println(lesserafim[i]);
		}
	}

}
