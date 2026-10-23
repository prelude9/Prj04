package ex01;

public class ArrayTest04 {

	public static void main(String[] args) {
		// String, 배열처럼 데이터 큰 변수는 heap에 저장
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
