
public class Manager extends Employee
{
	private double salary;

	public Manager(String nm, int id, String bd, double salary)
	{
		super(nm, id, bd);
		this.salary = salary;
	}
		
	public double getSalary() {return salary;}
	public void setSalary(double salary) {this.salary = salary;}

	public double Pay()
	{
		return salary/12.0;
	}
}
