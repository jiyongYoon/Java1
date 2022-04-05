class Calculator {
    int value;
    Calculator() {
        this.value = 0;
    }
    void add(int val) {
        this.value += val;
    }
    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends Calculator {
	void minus(int val) {
		this.value -= val;
	}
}

public class type5Q1 {

	public static void main(String[] args) {      
        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println(cal1.getValue());  // 10 Ãâ·Â
    }
}