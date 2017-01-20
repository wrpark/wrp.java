
public class TypeCasting {
	public static void main(String[] args) {
		
		//
		// int     4byte
		// long    4byte
		// float    4byte
		// double  4byte
		
		// 4byte  + 4byte = 4byte
		// 8byte  + 4byte = 8byte
		// 4byte  + 8byte = 8byte
		// 8byte  + 8byte = 8byte
		int numberOne = 10 ;  // 4byte
		int numberTwo = 30 ;  // 4byte
		
		// 4byte = 4byte + 4byte
		// 4byte = 2byte + 4byte
		// 4byte = 1byte + 4byte
		int result = numberOne + numberTwo;
		
		float result2 = 50 + 50.0F;
		
		// 8byte = 4byte  +  4byte 
		long bigNumber = 10 +50 ;
		
		
		
		// 명시적 캐스팅
		int number2 = (int) (10 + 10.6);
		
		double floatingNumber = 50.12355;
		int number3 = 10000;
		int number4 = number3 + (int) floatingNumber;
	}

}
