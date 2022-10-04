
public class SalesPerson extends Employee
{
	private double commission;
	private int sales;
	private double salary;

	public SalesPerson(String nm, int id, String bd, double com)
	{
		super(nm, id, bd);
		sales = 0;
		commission = com;
	}
	
	public double getCommission() {return commission;}
	public void setCommission(double commission) {this.commission = commission;}
	public int getSales() {return sales;}
	public void setSales(int sales) {this.sales = sales;}
	public double getSalary() {return salary;}
	public void setSalary(double salary) {this.salary = salary;}

	public double Pay()
	{
		return salary/12.0 + sales*commission;
	}
}
