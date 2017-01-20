package days6;

import java.util.Scanner;

public class Gugu {


		void Gugud() {
		Scanner input = new Scanner(System.in);
		System.out.println("====== 구구단 프로그램 ======");
		System.out.println("원하는 구구단을 입력하세요. ");
		System.out.print("원하는 구구단 :");
		int number = input.nextInt();
		System.out.println("=========================");
		System.out.println("구구단 " + number + "단을 출력합니다");

		int i = 0;

		while (i < 9) {
			i++;

			System.out.println(number + "X" + i + "=" + (number * i));

		}
		
	}
}
