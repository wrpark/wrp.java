
public class Barista {

	String computer = "데스크 컴퓨터";
	String card = "카드";
	String coffeemachine = "커피머신";
	String bell = "진동벨";
	
	//손님에게 커피주문을 받는다.
	void order() {
		System.out.println(computer + "로 손님에게 커피주문을 받는다");
	}
	//커피값 계산을 한다.
	void calcultion() {
		System.out.println(card + "로 손님의 커피값 계산을 한다");
	}
	//커피를 만든다.
	void make() {
		System.out.println(coffeemachine + "으로 손님의 커피를 만든다");
	}
	//손님을 부른다.
	void call() {
		System.out.println(bell + "로 손님을 부른다");
	}
	//손님에게 커피를 전달한다.
	void delivery() {
		System.out.println("손님에게 커피를 전달한다");
	}
}
