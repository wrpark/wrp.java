
public class CharAt {
	
	public static void main(String[] args) {
		
		String alphabet = "ABCDEFG";
		
		//문자열을 한글자씩 쪼개어 char 배열로 변경함
		char[] letters = alphabet.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
	}

}
