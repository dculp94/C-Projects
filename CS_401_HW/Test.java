
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d1 = new Doctor(1196, "Matt Smith", "Time Lord", 4.95);
		Doctor d2 = new Doctor(62, "Albert W. Wiley","Robotics",1987);
		//Test comparison 
		//Doctor d2 = new Doctor(1196, "Matt Smith", "Time Lord", 4.95);
		Lawyer l1 = new Lawyer(44, "Saul Goodman", "Criminal Lawyer", "4/6/2015");
		Wrestler w1 = new Wrestler(33,"Daniel Brian","Yes Lock", true);
		
		System.out.println();
		d1.printDocInfo();
		System.out.println();
		d2.printDocInfo();
		
		System.out.println();
		System.out.println("Testing if doctor's are similar");
		if (d1.equals(d2))
		{
			System.out.println("They match!");
		}
		else 
		{
			System.out.println("False match");
		}
		
		System.out.println();
		l1.printLawInfo();
		System.out.println();
		w1.printWresInfo();
	}

}
