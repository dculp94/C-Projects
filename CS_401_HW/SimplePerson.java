
public class SimplePerson extends Human{
	private String name;
	
	
	public SimplePerson (int age, String name)
	{
		super(age);
		setName(name);		
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	
	

}
