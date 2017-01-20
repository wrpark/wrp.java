package days6;

public class Arrays {
	
	void Arr() {
		
		//배열안에 있는 모든 변수를 출력한다.
		// 1. 배열을 정의하고 값을 할당한다.
		String[] names = {"메탈리카, 림프 비즈킷, 스크릴렉스"};
		
		// 2. 배열의 원소 개수를 담아 보관한다.
		int nameCount = names.length;
		
		// 3. 배열의 원소 개수만큼 반복하며 원소를 출력한다.
		// 3-1. 반복값을 정의하고 0으로 초기화한다.
		int i = 0;
		
		// 3-2. while 반복문을 이용한다.
		while ( i < nameCount ) {
		// 3-3. 반복 조건은 nameCount가  보다
			System.out.println(names[i]);
		// 3-4. 반복 구문 names 배열의 원소를 꺼내 출력한다.
			i++;
		}
	}

}
