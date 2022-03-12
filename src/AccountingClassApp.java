class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public double dividend1rate;
	public double dividend2rate;
	public double dividend3rate;
	
	public double getDividend3() {
		return getIncome() * dividend3rate;
	}

	public double getDividend2() {
		return getIncome() * dividend2rate;
	}

	public double getDividend1() {
		return getIncome() * dividend1rate;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend 1 : "+ getDividend1() );
		System.out.println("Dividend 2 : "+ getDividend2() );
		System.out.println("Dividend 3 : "+ getDividend3() );
	}
}

public class AccountingClassApp {

	public static void main(String[] args) {
		
//		Accounting.valueOfSupply = Double.parseDouble(args[0]);
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.dividend1rate = 0.5;
//		Accounting.dividend2rate = 0.3;
//		Accounting.dividend3rate = 0.2;
//		Accounting.print();
		//위 작업이 각 나라마다 달라서 여러 나라의 작업이 필요하다?
		//클래스를 Accounting1, Accounting2, 이런 순으로 복제해서 사용할 수도 있지만
		//인스턴스를 사용하여 클래스를 복제할 수 있다.
		//그리고 이렇게 되면 기존클래스에서 static을 다 없애야 한다.
		
		//63번줄 내용을 하게 되면 오류가 나서 53~59를 주석처리함.
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = Double.parseDouble(args[1]);
		a1.vatRate = 0.05;
		a1.expenseRate = 0.2;
		a1.dividend1rate = 0.3;
		a1.dividend2rate = 0.3;
		a1.dividend3rate = 0.4;
		

	}
}
