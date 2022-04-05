//Q2~Q4
class Calculator2 {
    int value;
    Calculator2() {
        this.value = 0;
    }
    void add(int val) {
        this.value += val;
    }
    int getValue() {
        return this.value;
    }
    boolean isOdd() {
    	if((value%2)==0) {
    		return false;
    	} else {
    		return true;
    	}
    }
    int avg(int data[]) {
    	int i=0;
    	int t=0;
    	while(i<data.length) {
    		t += data[i];
    		i++;
     	}    	
		return t/data.length;
    }
}

class MaxLimitCalculator extends Calculator2 {
	int getValue() {
		if(value<=100) {
			return this.value;
		} else {
			return 100;
		}
	}
}

public class objectQ2 {

	public static void main(String[] args) {
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);  // 50 더하기
		cal.add(60);  // 60 더하기
		System.out.println(cal.getValue());  // 100 출력
		System.out.println("");
		
		System.out.println(cal.isOdd());
		System.out.println("");

		int[] data = {1, 3, 5, 7};
		Calculator2 cal2 = new Calculator2();
		int result = cal2.avg(data);
		System.out.println(result);
	}

}
