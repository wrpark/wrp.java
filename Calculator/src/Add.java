import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("숫자를 입력하세요!");
		int number = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int add = number + number2 + number3;
		
		System.out.println("합계 : " + add );
	}

}
