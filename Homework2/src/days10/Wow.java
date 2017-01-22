package days10;

import java.util.Scanner;

public class Wow {
public static void main (String[] args) {

		

		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");

		

		int one = input.nextInt();

		if ( one == 1) {

			System.out.print("점수를 입력하세요 : " );

			int number = input.nextInt();

			System.out.print("점수를 입력하세요 : " );

			int number2 = input.nextInt();

			System.out.print("점수를 입력하세요 : " );

			int number3 = input.nextInt();

			System.out.print("점수를 입력하세요 : " );

			int number4 = input.nextInt();

			System.out.print("점수를 입력하세요 : " );

			int number5 = input.nextInt();

			

			

			int sum = (number + number2 + number3 + number4 + number5);

			int average = ((number + number2 + number3 + number4 + number5) / 5);

			System.out.println("총점 : " + sum);

			System.out.println("평균 : " + average); }

			else if ( one == 2) {

				System.out.print("화씨를 입력하세요 :");

				double celsius = input.nextDouble();

				double fahrenheit = ((celsius * 1.8) + 32);

				System.out.print("화씨 : " + fahrenheit ); }

			else if( one == 3) {

				System.out.print("신장 : ");

				double height = input.nextDouble();

				System.out.print("몸무게 : ");

				double weight = input.nextDouble();

				double bmi = (weight / (height * height) );

				System.out.print(bmi + " = ");

				if (bmi <= 18.5) {

					System.out.print("저체중입니다");

				}

				else if (bmi > 18.5 && bmi <= 22.9) {

						System.out.print("정상입니다");

					}

				else if (bmi >= 23 && bmi <=24.9) {

					System.out.println("과체중입니다");

				}

					else if (bmi >= 25 && bmi <= 29.9) {

						System.out.println("경도비만입니다");

					}

					else if (bmi >= 30 && bmi <= 34.9) {

						System.out.println("중도비만입니다");

					}

					else if (bmi >= 35) {

						System.out.println("고도비만입니다");

					}

				

				}

			else if ( one == 4) {

				System.out.println("프로그램이 종료됩니다.");}

				 

					

					

				}

			

				

						

					}


