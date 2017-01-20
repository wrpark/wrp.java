package days08;

import java.util.Scanner;

public class Today {
	
	void Todys() {
		
		Scanner input = new Scanner(System.in) ;
		
		// 1. 지금 날씨는 어떤가요? 를 출력함
		System.out.println("지금 날씨는 어떤가요?") ;
		// 2. 1: 비가옵니다. 2: 맑습니다 를 출력함
		System.out.println( "1 : 비가 옵니다. 2 : 맑습니다. " ) ;
		System.out.print("입력하세요 : ");
		int rain = input.nextInt();
		
		if ( rain == 1 ) {
			System.out.println("우산을 챙겨가세요.");
		}
		else if ( rain == 2){
			System.out.println("우산은 필요없어요.");
		}
	}

}
