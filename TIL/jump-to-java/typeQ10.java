import java.util.HashMap;

public class typeQ10 {
	/*
    static void printCoffeePrice(int type) {
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000);  // 1: �Ƹ޸�ī��
        priceMap.put(2, 4000);  // 2: ���̽� �Ƹ޸�ī��
        priceMap.put(3, 5000);  // 3: ī���
        int price = priceMap.get(type);
        System.out.println(String.format("������ %d�� �Դϴ�.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(1);  // "������ 3000�� �Դϴ�." ���
        printCoffeePrice(99);  // NullPointerException �߻�
    }
    */
	
	 enum CoffeeType {
	        AMERICANO,
	        ICE_AMERICANO,
	        CAFE_LATTE
	    };

	    static void printCoffeePrice(CoffeeType type) {
	        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
	        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: �Ƹ޸�ī��
	        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: ���̽� �Ƹ޸�ī��
	        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: ī���
	        int price = priceMap.get(type);
	        System.out.println(String.format("������ %d�� �Դϴ�.", price));
	    }

	    public static void main(String[] args) {
	        printCoffeePrice(CoffeeType.AMERICANO);  // "������ 3000�� �Դϴ�." ���
	        printCoffeePrice(CoffeeType.CAFE_LATTE);
	}
	
	
	
}