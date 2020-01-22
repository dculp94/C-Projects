

public class Wrestler extends SimplePerson{
	private String move = "nothing";
	private boolean face;
	public Wrestler(int age, String name, String move, boolean face) {
		super(age, name);
		setMove(move);
		setFace(face);
		
	}
	
	

	public void printWresInfo(){
		System.out.println("Printing Wrestler's Information: ");
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Finishing Move: "+getMove());
		System.out.println("Face: "+getFace());
		
	}
	private boolean getFace() {
		return face;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		if (move != null)
		{
		this.move = move;
		}
		else 
		{
			System.out.println("Bad finishing move exiting now");

			System.exit(0);
		}
	}
	public void setFace(boolean face)
	{
		if (face == true || face == false)
		{
		this.face = face;
		}
		else 
		{
			System.out.println("Not boolean form exiting");
			System.exit(0);
		}
	}
	
	

}
