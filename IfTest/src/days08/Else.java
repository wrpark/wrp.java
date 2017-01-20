package days08;
/**
 * 
 * 학점 계산하는 프로그램  <br/>
 * 100점은 A+ <br/>
 * 90점 이상은 A <br/>
 * 80점 이상은 B <br/>
 * 70점 이상은 C <br/>
 * 60점 이상은 D <br/>
 * 그 이하는 F를 출력한다  <br/>
 * 
 * <pre>
 * 작성하고 싶은 내용을 여기에 자유롭게 작성하세요.
 * 그러면, 똑같이 보일거에요!
 * </pre>
 * @author 206-003 ( tjdqhdpdy@gmail.com )
 *
 */
public class Else {
	
	void Elses() {
		
		// 1. 점수를 변수에 할당한다. 만점은 100점
		int score = 85 ;
		
		// 2. 점수가 100점 이라면 , "A+"를 출력한다.
		if ( score == 100 ) {
			System.out.println( "A+" ) ;
		}
		// 점수가 100점이 아니고 90보다 크다면
		else if ( score >= 90 ) {
			System.out.println( "A" ) ;
		}
		// 점수가 90점 미만이고 80점 이상이라면 "B"를 출력한다
		else if ( score >= 80 ) {
			System.out.println( "B" ) ;
		}
		// 점수가 90점 미만 이라면 "F"를 출력한다.
		else {
			System.out.println( "F" ) ;
		}
	}

}
