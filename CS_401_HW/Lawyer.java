
public class Lawyer extends SimplePerson {

	private String type, date;
	public Lawyer(int age, String name, String type, String date) {
		super(age, name);
		
		setType(type);
		setDate(date);
	}
	public void printLawInfo() {
		System.out.println("Printing Lawyer's Information: ");
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Type: "+getType());
		System.out.println("Date: "+getDate());
	}
	private void setDate(String date) {
		this.date = date;
		
	}
	private void setType(String type) {
		this.type = type;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public String getType()
	{
		return type;
	}
}
