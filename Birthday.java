
public class Birthday 
{
	private int month;
	private int day;
	private int year;
	
	public Birthday(){}
	
	public Birthday(String bdstr)
	{
		String[] s = bdstr.split("/");
		month = Integer.parseInt(s[0]);
		day = Integer.parseInt(s[1]);
		year = Integer.parseInt(s[2]);
	}

	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	public int getDay() {return day;}
	public void setDay(int day) {this.day = day;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}

	public String toString(){
		return String.valueOf(month) + '/' + day + '/' + year;
	}
}
