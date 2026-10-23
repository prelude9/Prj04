package ex01;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 전역변수를 쓰지 않고 input 출력하기, 데이터는 다른 방에 있는데 한번 만들어보기
		// String [] bts = new String [] {} 은 아래와 같음 
		String [] bts = {"RM", "제이홉", "정국", "지민", "진", "슈가", "뷔"
		};
		
		hellobts( bts );
	}

	private static void hellobts(String[] bts) {
		for(int i=0; i< bts.length; i++) {
			System.out.print(bts[i] + " ");
		}
	}

}
