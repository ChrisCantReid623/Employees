
public abstract class Employee 
{
	private String name;
	private int id;
	private Birthday bday;
	
	public Employee(String nm, int id, String bd)
	{
		name = nm;
		this.id = id;
		bday = new Birthday(bd);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public Birthday getBday() {return bday;}
	public void setBday(Birthday bday) {this.bday = bday;}

	abstract double Pay();
	
	public String toString()
	{
		return name + '\t' + id + '\t' + bday + '\t' + Pay();
	}
}
