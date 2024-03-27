package BudgetPack;
public class Expenses
{
	public double foodExpenses;
	public double clothExpenses;
	public double educationalExpenses;
	public Expenses(){}
	public Expenses(double foodExpenses,double clothExpenses,double educationalExpenses){
		this.foodExpenses=foodExpenses;
		this.clothExpenses=clothExpenses;
		this.educationalExpenses=educationalExpenses;
	}
	public double calculateExpenses()
	{
		double exp=foodExpenses+clothExpenses+educationalExpenses;
		return exp;
	}
}
