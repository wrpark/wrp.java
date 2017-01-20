package days08;

public class Card {
	
	void Cards() {
		
		// 현금이 없고 신용카드가 있을 경우
		// 신용카드로 결제합니다 를 출력하는 프로그램
		
		// 있다 = true
		// 없다 = false
		//현금이 없다
		boolean hasCash = false ;
		//신용카드가 있다
		boolean hasCreaditCard = true ;
		
		// 현금이 없고 신용카드가 있는지 확인한다.
		//boolean isCard = hasCash == false && hasCreaditCard == true ; 
		boolean isCard = !hasCash && hasCreaditCard ;
		
		// 현금이 없고 신용카드가 있다면 신용카드로 결제한다를 출력한다
		if ( isCard ) {
			System.out.println("신용카드로 결제합니다.") ;
		}
		
	}

}
