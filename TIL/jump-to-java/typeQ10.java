import java.util.HashMap;

public class typeQ10 {
	/*
    static void printCoffeePrice(int type) {
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000);  // 1: 아메리카노
        priceMap.put(2, 4000);  // 2: 아이스 아메리카노
        priceMap.put(3, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
        printCoffeePrice(99);  // NullPointerException 발생
    }
    */
	
	 enum CoffeeType {
	        AMERICANO,
	        ICE_AMERICANO,
	        CAFE_LATTE
	    };

	    static void printCoffeePrice(CoffeeType type) {
	        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
	        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
	        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
	        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
	        int price = priceMap.get(type);
	        System.out.println(String.format("가격은 %d원 입니다.", price));
	    }

	    public static void main(String[] args) {
	        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
	        printCoffeePrice(CoffeeType.CAFE_LATTE);
	}
	
	
	
}