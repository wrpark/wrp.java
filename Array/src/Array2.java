
public class Array2 {
	
	public static void main(String[] args) {
		
		String hello = "안녕하세요. 반갑습니다. 제 이름은 박우람입니다.";
		
		// " " 으로 문자열 쪼개기
		String[] messages = hello.split(" ");
		for (int i = 0; i < messages.length; i++) {
			System.out.println(messages[i]);
		}
	}

}
