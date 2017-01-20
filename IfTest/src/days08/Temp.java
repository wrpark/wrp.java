package days08;

import java.util.Scanner;

public class Temp {
	
	void Temps() {
		
		Scanner input = new Scanner(System.in) ;
		
		
		System.out.println( "숫자를 입력하세요 : " );
		int tem = input.nextInt();
		if ( tem == 1 ) {
		System.out.println( "섭씨 -> 화씨" ) ;
		}
		
		else if ( tem == 2 ) {
			System.out.println( " 화씨 -> 섭씨" ) ;
		}
		
		
		
	}
	
	

}
