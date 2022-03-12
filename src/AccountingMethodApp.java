public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double dividend1rate;
	public static double dividend2rate;
	public static double dividend3rate;

	public static void main(String[] args) {
		
		valueOfSupply = Double.parseDouble(args[0]);
		vatRate = 0.1;
		expenseRate = 0.3;
		dividend1rate = 0.5;
		dividend2rate = 0.3;
		dividend3rate = 0.2;
		
		print();

	}

	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend 1 : "+ getDividend1() );
		System.out.println("Dividend 2 : "+ getDividend2() );
		System.out.println("Dividend 3 : "+ getDividend3() );
	}

	public static double getDividend3() {
		return getIncome() * dividend3rate;
	}

	public static double getDividend2() {
		return getIncome() * dividend2rate;
	}

	public static double getDividend1() {
		return getIncome() * dividend1rate;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
