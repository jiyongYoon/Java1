
public class typeQ3 {

	public static void main(String[] args) {

		String privNum = "881120-2068234";
		System.out.println(String.format("홍길동님의 생년월일은 19%s 입니다", privNum.substring(0, 6)));
		if(privNum.substring(7, 8).equals("1")) {
			System.out.println("홍길동님의 성별은 남성입니다.");
		} else {
			System.out.println("홍길동님의 성별은 여성입니다.");
		}
		
	}

}
