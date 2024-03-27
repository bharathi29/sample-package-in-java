import BudgetPack.Expenses;
import BudgetPack.Income;
public class FamilyBudget
{
	public static void main(String args[])
	{
		Expenses e=new Expenses(5000.0,3000.0,20000.0);
		Income i=new Income(80000.0,5000.0,15000.0);
		double s=i.calculateIncome()-e.calculateExpenses();
		
		System.out.println("Savings is :"+s);
	}
}
