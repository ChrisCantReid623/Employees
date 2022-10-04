
import java.util.ArrayList;
import java.util.List;

public class Payroll 
{
	public static void main(String[] args) 
	{
		List<Employee> elist = new ArrayList<>();

		Manager m1 = new Manager("Tom Jones", 2479, "2/22/1991", 40000.0);
		Manager m2 = new Manager("Jan Macy", 8976, "9/14/2000", 80000.0);

		elist.add(m1);
		elist.add(m2);
				
		SalesPerson sp1 = new SalesPerson("Alice Fay", 2334, "5/12/1995", 0.5);
		sp1.setSalary(60000.0f);
		sp1.setSales(100);
		
		Staffer st1 = new Staffer("Fay Wray", 2334, "5/12/1995", 16.5);
		st1.setHours(30);
		
		elist.add(sp1);
		elist.add(st1);	
		
		double total = 0.0;
		for (Employee e: elist)
			total = total + e.Pay();

		System.out.println("Total pay: " + total);
		
		for (Employee e: elist)
			System.out.println(e.toString());
	}

}
