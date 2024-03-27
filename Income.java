package BudgetPack;
public class Income
{
	public double salary;
	public double allowance;
	public double rent;
	public Income(){}
	public Income(double salary,double allowance,double rent)
	{
		this.salary=salary;
		this.allowance=allowance;
		this.rent=rent;
	}	
	public double calculateIncome()
	{
		double income=salary+allowance-rent;
		return income;
	}
}
