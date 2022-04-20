package lib;

public class TaxFunction {
	
	private final int SingleAndChildless = 54000000;
	private final int Married = 4500000;
	private final int HaveChild = 4500000;

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		PrintMonthWorking(numberOfMonthWorking);
		
		Children(numberOfChildren);
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
		}
		
		PrintTax(tax);
			 
	}

	private static void PrintMonthWorking (int numberOfMonthWorking) {
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
	}

	private static void Children (int numberOfChildren) {
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
	}

	private static void PrintTax (int tax) {
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
	}
	
}
