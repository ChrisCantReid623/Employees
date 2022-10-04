
public class Staffer extends Employee
{
	private double wage;
	private int hours;

	public Staffer(String nm, int id, String bd, double wage)
	{
		super(nm, id, bd);
		hours = 0;
		this.wage = wage;
	}
	
	public double getWage() {return wage;}
	public void setWage(double wage) {this.wage = wage;}
	public int getHours() {return hours;}
	public void setHours(int hours) {this.hours = hours;}

	public double Pay()
	{
		return hours*wage;
	}
}
