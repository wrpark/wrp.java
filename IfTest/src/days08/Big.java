package days08;

import java.util.Scanner;

public class Big {

	void Bigs() {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요.");

		System.out.println("첫번째 : ");
		int number = input.nextInt();
		System.out.println("두번째 : ");
		int number2 = input.nextInt();
		System.out.println("세번째 : ");
		int number3 = input.nextInt();

		int max = number;
		
		if (max < number2) {
			max = number2;
			if (max < number3) {
				max = number3;
			}
		}
		System.out.println(max);

	}

}
