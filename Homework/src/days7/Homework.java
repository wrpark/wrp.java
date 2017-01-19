package days7;

public class Homework {
	
	void Home() {
/*		int[][] numbers = {
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36},
				{5,10,15,20,25,30,35,40,45},
				{6,12,18,24,30,36,42,48,54},
				{7,14,21,28,35,42,49,56,63},
				{8,16,24,32,40,48,56,64,72},
				{9,18,27,36,45,54,63,72,81},
		};
		*/
		int i = 2;
		int j = 1;
		
		//int rowCount = numbers.length; // 결과는 8
		
		while ( i< 10 ) {
			
			//int colCount = numbers[i].length;
			
			while ( j < 10) {
				System.out.println(i*j);
				j++;
			}
			j = 1;
			i++;
				
		}
	}

}
