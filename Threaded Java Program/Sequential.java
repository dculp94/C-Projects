import java.io.*;
import java.util.*;


public class Sequential {
	
	public static void main(String[] args) throws IOException 
    { 
			// initialize variables
		    Scanner scan = new Scanner(System.in);
		    String filename = "War and Peace.txt";
		    System.out.println("Please enter a word: ");
		    String wordname1 = scan.next();
		    String wordname2 = scan.next();
		    String wordname3 = scan.next();
		    String wordname4 = scan.next();
		    int count1 = 0;
		    int count2 = 0;
		    int count3 = 0;
		    int count4 = 0;
		    
		    // starts timer
		    long startTime = System.nanoTime();
		    
		    
		    
		    
		    try (LineNumberReader r = new LineNumberReader(new FileReader(filename))) 
		    {
		        String line;
		        // while loop to traverse entire file
		        while ((line = r.readLine()) != null) 
		        {
		        	// determines word from whitespace
		            for (String element : line.split(" ")) 
		            {
		            	// ignores upper and lower
		                if (element.equalsIgnoreCase(wordname1))
		                {
		                    count1++;
		                    
		                }
		                if (element.equalsIgnoreCase(wordname2))
		                {
		                    count2++;
		                    
		                }
		                if (element.equalsIgnoreCase(wordname3))
		                {
		                    count3++;
		                    
		                }
		                if (element.equalsIgnoreCase(wordname4))
		                {
		                    count4++;
		                    
		                }
		            }
		        }
		    
		    }
		    // stops timer and measures how long loop took
		    long endTime = System.nanoTime();
		    long totalTime = endTime - startTime;
		    
		    System.out.println("The word '" + wordname1 + "' appears " + count1 + " times.");
		    System.out.println("The word '" + wordname2 + "' appears " + count2 + " times.");
		    System.out.println("The word '" + wordname3 + "' appears " + count3 + " times.");
		    System.out.println("The word '" + wordname4 + "' appears " + count4 + " times.");
		    System.out.println("Runtime: " +totalTime/1000000+ " ms");
	}
}
