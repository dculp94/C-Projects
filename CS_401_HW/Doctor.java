
public class Doctor extends SimplePerson{

	private String Specialty = "none";
	private double Fee;
	// private boolean equal;
	
	public Doctor(int age, String name, String Specialty, double Fee) {
		super(age, name);
		setSpecialty(Specialty);
		setFee(Fee);
		
		// TODO Auto-generated constructor stub
	}

	public void printDocInfo()
	{
		System.out.println("Printing Doctor's Information: ");
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Specialty: "+getSpecialty());
		System.out.println("Fee: $"+getFee());
	}
	
	public String getSpecialty()
	{
		return Specialty;
	}
	
	public void setSpecialty(String Specialty)
	{
		if (this.Specialty != null) {
			this.Specialty = Specialty;
		}
		else{
			System.out.println("Bad fee input, exiting");
			System.exit(0);
		}
	}
	
	public double getFee()
	{
		return Fee;
	}
	
	public void setFee(double Fee)
	{
		if (Fee >= 0)
		{
			this.Fee = Fee;
		}
		else {
			System.out.println("Bad fee input, exiting");
			System.exit(0);
		}
	}
	
	public boolean equals(Object obj)
	{
	
		if (this == obj)
		{
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass())
		{
			return false;
		}
		Doctor doctor  = (Doctor) obj;
		return (doctor.getName() == this.getName());
	}
	
	
}
