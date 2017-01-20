import java.util.Scanner;

public class Cal3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요!");
		int number = input.nextInt();
		int number2 = input.nextInt();
		
		
		int add = number + number2 ;
		System.out.println("더한 숫자 : " + add);
		
		System.out.println("숫자를 입력하세요!");
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		int sub = number3 - number4 ;
		System.out.println("뺀 숫자 : " + sub);
	
	}
}
