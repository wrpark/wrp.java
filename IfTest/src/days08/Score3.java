package days08;

import java.util.Scanner;

public class Score3 {
	
	void Scores2() {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("프로그램 : ") ;
		double pro = input.nextDouble();
		System.out.print("경영 : ") ;
		double man = input.nextDouble();
		System.out.print("수학 : ");
		double ma = input.nextDouble();
		System.out.print("알고리즘 :" ) ;
		double al = input.nextDouble();
		
		System.out.println("총점 : " + (pro + man + ma + al) ) ;
		System.out.println("평균 : " +(pro + man + ma + al) / 4) ;
		
		double average = ((pro + man + ma + al) / 4) ;
		if ( average >= 90 ) {
			System.out.println("참 잘했어요!") ;
		}
		// 평균이 90점을 넘기지 못한다면 노력하세요 를 출력합니다.
		// 위 조건( average >= 90 )의 결과가  false라면 노력하세요 를 출력합니다.
		else {
			System.out.println("노력하세요!");
		}
	
	}

}
