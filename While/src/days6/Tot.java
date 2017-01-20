package days6;

public class Tot {
	
	void Tots() {
		
		// 1. 점수 10개의 배열을 선언하고 초기화 한다.
		int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 11};
		
		// 2. 배열의 원소 개수를 변수에 담아 보관한다.
		int scoreCount = scores.length;
		// 3. 반복에 사용할 증가값을 선언하고 0으로 초기화 한다.
		int i = 0;
		// 4. 총점을 계산해 담을 변수를 선언하고 0으로 초기화 한다.
		int sum = 0;
		// 5. 반복을 수행하여 원소를 모두 더한다.
		
		while ( i < scoreCount ) {
			sum += scores[i];
			i++;
		}
		
		// 6. 총점 변수를 충력한다
		System.out.println("총 점은" + sum + "입니다.");
		 {
			
		}
	}

}

