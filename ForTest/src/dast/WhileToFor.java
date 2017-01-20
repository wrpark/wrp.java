package dast;

public class WhileToFor {
	
	void For() {
		
		//while 의 기본 형식
		// 1 부터 10 까지 출력
		int i = 0 ;
		while ( i < 10 ) {
			i++;
			System.out.println(i);
			
		}
		// for의 기본 형식
		// 1 부터 10 까지 출력해라.
		for (int j = 0 ; j < 10 ; j++ ) {
			// 반복 구간
			System.out.println(j + 1);
		}
	}

}

