package dast;

public class Arrays {
	
	void Arra() {
		
		String[] names = { "메탈리카", "림프 비즈킷", "스크릴렉스"};
		
		for ( int i = 0 ; i < names.length; i++ ) {
			System.out.println(i);
			System.out.println(names[i]);
			
		}
		int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		
		int sum = 0; 
		for (int i = 0; i < scores.length; i++) {
			System.out.println("현재 1의 값 : " + i);
			System.out.println("i 번째 원소의 값 : " + scores[i]);
			sum = sum + scores[i];
			System.out.println("현재까지 점수 총 합 : " + sum );
		}
		
		System.out.println("최종 점수 총 합 : " + sum );
		
		
		for ( int score : scores ) {
			System.out.println(score);
			
		}
		
	

}
}
