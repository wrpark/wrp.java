import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("숫자를 입력하세요!");
		int number = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		int add = (number + number2 + number3 + number4) ;
		System.out.println("합계 : " + add);
		double div = (number + number2 + number3 + number4) / 4.0;
		System.out.println("평균 : " + div);
	}

}
