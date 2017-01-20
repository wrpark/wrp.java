import java.util.Scanner;

public class Temp {
	
	void Temperature() {
		
		final double X = 1.8;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("섭씨를 입력하세요.");
		double number1 = input.nextInt();
		
		double tem = ((number1 * X) + 32); 
		System.out.println("화씨 : " + tem);
	}

}
