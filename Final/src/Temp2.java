import java.util.Scanner;

public class Temp2 {
	
	
	void Temperature2() {
		
		final int X = 32;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨를 입력하세요.");
		double number = input.nextDouble();
		
		double tem = ((number - X) / 1.8);
		System.out.println("섭씨 : " + tem);
	}

}
