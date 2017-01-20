import java.util.Scanner;

public class Temn {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("섭씨를 입력하세요! ");
		double number = input.nextInt();
		
		double tem = ((number * 1.8) + 32) ;
		
		System.out.println("변환된 화씨 : " + tem);
		
		System.out.println("화씨를 입력하세요!" );
		double number2 = input.nextInt();
		
		double tem2 = ((number2 - 32) / 1.8);
		System.out.println("변환된 섭씨 : " + tem2);
	}

}
