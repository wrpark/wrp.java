package days6;

public class Guu {
	
	void Guus() {
		
		int[][] numbers = {
				{2, 4, 6, 8, 10, 12, 14, 16, 18},
				{3, 6, 9, 12, 15, 18, 21, 24, 27},
				{4, 8, 12, 16, 20, 24, 28, 32, 36}
		};
		
		
		int i = 0; 
		int j = 0;
		
		// 1. 행의 개수를 가져와 변수에 담는다.
		int rowCount = numbers.length; //결과는 3
		
		// 2. 행의 개수 만큼 while 증가시키면서 반복한다.
		while ( i < rowCount ) {
		// 3. i번째 행의 배열 원소개수를 가져와 변수에 담는다.	
			int colCount = numbers[i].length;
		// 4. i번째 원소 배열 개수만큼 j를 증가시키며 반복한다.	
			while ( j < colCount ) {
				
				System.out.println(numbers[i][j]);
				
				j++;
			}
			// 5. j를 초기화 한다
			j = 0;
			i++;
		}
	}

}
