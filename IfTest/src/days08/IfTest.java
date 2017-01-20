package days08;

public class IfTest {
	
	void Ifs() {
		
		//주머니에 1200원이 들어있다면 캔커피를 살 수 있습니다.
		
		
		//주머니에 있는 돈을 확인함.
		int moneyInPocket = 1200;
		//주머니에 1200원 이상인지 확인함.
		boolean isOver1200 = moneyInPocket >= 1200; // true
		if ( isOver1200 ) {
		// 1200원 이상이라면, 캔커피를 살 수 있습니다 를 출력함.
			System.out.println("캔커피를 살 수 있습니다.");		}
		
		
	}
	

}
