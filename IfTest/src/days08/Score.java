package days08;

import java.util.Scanner;

public class Score {
	
	void Scores() {
		
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
		
		
	
	}

}
