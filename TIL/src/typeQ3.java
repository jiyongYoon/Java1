
public class typeQ3 {

	public static void main(String[] args) {

		String privNum = "881120-2068234";
		System.out.println(String.format("ȫ�浿���� ��������� 19%s �Դϴ�", privNum.substring(0, 6)));
		if(privNum.substring(7, 8).equals("1")) {
			System.out.println("ȫ�浿���� ������ �����Դϴ�.");
		} else {
			System.out.println("ȫ�浿���� ������ �����Դϴ�.");
		}
		
	}

}
